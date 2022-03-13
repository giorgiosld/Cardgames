package it.unicam.cs.pa2021.cardgames.blackjack.controller;

import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackDealer;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.view.BlackJackTable;
import it.unicam.cs.pa2021.cardgames.util.controller.engine.IEngine;
import it.unicam.cs.pa2021.cardgames.util.controller.winner.IGameWinner;
import it.unicam.cs.pa2021.cardgames.util.model.cards.Face;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Engine implements IGameWinner, IEngine<BlackJackIPlayer> {

    BlackJackTable bj;
    BlackJackIDeck deck;
    List<BlackJackIPlayer> noMoreAction;

    public Engine(BlackJackTable bj){
        this.bj = bj;
        noMoreAction = new ArrayList<>();
    }

    @Override
    public void shuffleDeck(){
        BlackJackDealer dealer = bj.getDealer();
        deck = bj.getDeck();
        deck = dealer.shuffle(deck);
    }

    public void askBet() throws IOException {
        List<BlackJackIPlayer> players = bj.getPlayers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (BlackJackIPlayer bjp: players){
            System.out.println("Inserire il bet del giocatore " + bjp.getNome()+ " (bank = "+bjp.getBank()+")");
            int bet = Integer.parseInt(reader.readLine());
            bjp.placeBet(bet);
            while(bet > bjp.getBank()){
                System.out.println("Giocatore "+bjp.getNome()+" inserire un bet valido!");
                bet = Integer.parseInt(reader.readLine());
                bjp.placeBet(bet);
            }
            bjp.setBank(bjp.getBank() - bjp.getBet());
        }
    }

    @Override
    public void dealCards() {
        List<BlackJackIPlayer> players = bj.getPlayers();
        BlackJackDealer bjDealer = bj.getDealer();
        for (BlackJackIPlayer bjp : players){
            FrenchICard firstCard= bjDealer.delOneCard(deck);
            this.turnCard(firstCard, bjp);
            FrenchICard secondCard= bjDealer.delOneCard(deck);
            this.turnCard(secondCard, bjp);
            printValue(bjp);
        }
        FrenchICard cardToShow = bjDealer.delOneCard(deck);
        this.turnCardDealer(cardToShow, bjDealer);
        FrenchICard hiddenCard = bjDealer.delOneCard(deck);
        bjDealer.addCardBanco(hiddenCard);
        System.out.println("dealer "+bjDealer.getNome()+" ha ottenuto "+cardToShow.getRank().get().getBjValue()+"  e *carta Nascosta* con valore "+cardToShow.getRank().get().getBjValue());
    }

    @Override
    public void makeChoise() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(!noMoreAction.containsAll(bj.getPlayers())) {
            for (BlackJackIPlayer bjp : bj.getPlayers()) {
                if(!noMoreAction.contains(bjp)) {
                    System.out.println("giocatore " + bjp.getNome() + " fai la tua mossa!");
                    System.out.println("1 - stay");
                    System.out.println("2 - hit");
                    int action = Integer.parseInt(reader.readLine());
                    resolveAction(action, bjp);
                }
            }
        }
    }

    @Override
    public void resolveAction(int action, BlackJackIPlayer bjp) {
        switch (action) {
            case 1 -> {
                System.out.println("giocatore " + bjp.getNome() + " ha deciso di stare");
                noMoreAction.add(bjp);
            }
            case 2 -> {
                FrenchICard newCard = bj.getDealer().delOneCard(deck);
                this.turnCard(newCard, bjp);
                System.out.println("giocatore " + bjp.getNome() + " ha ottenuto " + newCard.getRank().get().getBjValue());
                this.printValue(bjp);
                int check = bj.getGame().calculateHand(bjp.compareHand().getCards());
                if (check > 21)
                    noMoreAction.add(bjp);
            }
        }
    }

    @Override
    public void evaluateWinner() {
        List<FrenchICard> carteBanco = bj.getDealer().getBanco().getCards();
        System.out.println("Dealer "+bj.getDealer().getNome()+" ha come carte: ");
        int valueBanco = bj.getGame().calculateHand(carteBanco);
        for(FrenchICard card: carteBanco){
            System.out.println(card.getRank().get().getBjValue());
        }
        System.out.println("Con valore di: "+valueBanco);
        for (BlackJackIPlayer bjp : bj.getPlayers()){
            int valueBjp = bj.getGame().calculateHand(bjp.compareHand().getCards());
            if((valueBjp > valueBanco) && (valueBjp <= 21)){
                System.out.println("Giocatore "+bjp.getNome()+" vince contro banco!");
                bjp.setBank(bjp.getBank()+(bjp.getBet()*2));
            }
        }
    }

    @Override
    public void clearHand(){
        List<BlackJackIPlayer>players = bj.getPlayers();
        for(BlackJackIPlayer bjp : players){
            bjp.clearHand();
        }
        bj.getDealer().clearHand();
    }

    private void printValue(BlackJackIPlayer bjp){
        Stream<FrenchICard> cardsInMano = bjp.compareHand().getCards().stream();
        System.out.println("giocatore "+bjp.getNome()+" ha: ");
        cardsInMano.forEach(s -> System.out.println(s.getRank().get().getBjValue()));
        System.out.println("Con valore totale di " + bj.getGame().calculateHand(bjp.compareHand().getCards()));
    }

    private void turnCard(FrenchICard card, BlackJackIPlayer bjp){
        card.setFace(Face.UP);
        bjp.addCardToHand(card);
    }

    private void turnCardDealer(FrenchICard card, BlackJackDealer bjd){
        card.setFace(Face.UP);
        bjd.addCardBanco(card);
    }

    public BlackJackTable getBj() {
        return bj;
    }

    public BlackJackIDeck getDeck() {
        return deck;
    }
}
