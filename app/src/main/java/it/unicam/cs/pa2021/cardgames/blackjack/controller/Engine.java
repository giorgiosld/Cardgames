package it.unicam.cs.pa2021.cardgames.blackjack.controller;

import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackDealer;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIGame;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.view.BlackJackTable;
import it.unicam.cs.pa2021.cardgames.util.model.cards.Face;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Engine {

    BlackJackTable bj;
    BlackJackIDeck deck;
    List<BlackJackIPlayer> noMoreAction;

    public Engine(BlackJackTable bj){
        this.bj = bj;
        noMoreAction = new ArrayList<>();
    }

    public void shuffleDeck(BlackJackTable bj){
        BlackJackDealer dealer = bj.getDealer();
        deck = bj.getDeck();
        deck = dealer.shuffle(deck);
    }

    public void askBet(BlackJackTable bjTable) throws IOException {
        List<BlackJackIPlayer> players = bj.getPlayers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (BlackJackIPlayer bjp: players){
            System.out.println("Inserire il bet del giocatore " + bjp.getNome()+ " (bank = "+bjp.getBank()+")");
            bjp.placeBet(Integer.parseInt(reader.readLine()));
        }
    }

    public void dealCards(BlackJackTable bjTable) {
        List<BlackJackIPlayer> players = bj.getPlayers();
        BlackJackDealer bjDealer = bjTable.getDealer();
        for (BlackJackIPlayer bjp : players){
            FrenchICard firstCard= bjDealer.delOneCard(deck);
            firstCard.setFace(Face.UP);
            bjp.addCardToHand(firstCard);
            FrenchICard secondCard= bjDealer.delOneCard(deck);
            secondCard.setFace(Face.UP);
            bjp.addCardToHand(secondCard);
            System.out.println("giocatore "+bjp.getNome()+" 1 "+firstCard.getRank()+" 2 "+secondCard.getRank()+" con valore ");
            printValue(bjp);
        }
        FrenchICard cardToShow = bjDealer.delOneCard(deck);
        cardToShow.setFace(Face.UP);
        bjDealer.addCardBanco(cardToShow);
        FrenchICard hiddenCard = bjDealer.delOneCard(deck);
        bjDealer.addCardBanco(hiddenCard);
        System.out.println("dealer "+bjDealer.getNome()+" 1 "+cardToShow.getRank()+" 2 "+hiddenCard.getRank()+" con valore "+cardToShow.getRank().get().getBjValue());
    }

    public void makeChoise(BlackJackTable bjTable) throws IOException {
        BlackJackIGame game;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //controllare condizione while
        //il ciclo deve continuare affinche in nomoreaction ci siano tutti i giocatori del tavolo
        while(!noMoreAction.equals(bj.getPlayers())) {
            for (BlackJackIPlayer bjp : bj.getPlayers()) {
                System.out.println("giocatore " + bjp.getNome() + " fai la tua mossa!");
                System.out.println("1 - stay");
                System.out.println("2 - hit");
                int action = Integer.parseInt(reader.readLine());
                resolveAction(action, bjp);
            }
        }
        //far fare azioni ai giocatori finche:
        // 1 - il valore carte non supera 21 (23.07 check completed)
        // 2 - i players decidono di stare (da fare)

        //vedere se ci sta metodo comparazione per valore carte (21 non superare)
        //TODO metodo per stare hittare e raddoppiare
    }

    private void resolveAction(int action, BlackJackIPlayer bjp) {
        switch (action){
            case 1:
                System.out.println("giocatore "+bjp.getNome()+" ha deciso di stare");
                noMoreAction.add(bjp);
                break;
            case 2:
                FrenchICard newCard= bj.getDealer().delOneCard(deck);
                newCard.setFace(Face.UP);
                bjp.addCardToHand(newCard);
                System.out.println("giocatore "+bjp.getNome()+" ha ottenuto "+newCard.getRank());
                //sostituire con metodo per stampare la mano
                /*Stream<FrenchICard> cardsInMano = bjp.compareHand().getCards().stream();
                System.out.println("giocatore "+bjp.getNome()+" ha: ");
                cardsInMano.forEach(s -> System.out.println(s.getRank()));
                System.out.println("Con valore di ");
                int check = bj.getGame().over21(bjp.compareHand().getCards());*/
                this.printValue(bjp);
                int check = bj.getGame().calculateHand(bjp.compareHand().getCards());
                if(check > 21)
                    noMoreAction.add(bjp);
                break;
        }
    }

    public void evaluateWinner(BlackJackTable bjTable) {
        //ciclo che scorre nomoreaction e controlla per ogni player il vaore delle carte
        //se il valore delle carte è maggiore a quello del dealer chi ha maggiore vince
        List<FrenchICard> carteBanco = bjTable.getDealer().getBanco().getCards();
        int valueBanco = bjTable.getGame().calculateHand(carteBanco);
        for (BlackJackIPlayer bjp : bj.getPlayers()){
            int valueBjp = bjTable.getGame().calculateHand(bjp.compareHand().getCards());
            if((valueBjp > valueBanco) && (valueBjp <= 21)){
                System.out.println("Giocatore "+bjp.getNome()+" vince contro banco!");
            }
        }
    }

    private void printValue(BlackJackIPlayer bjp){
        Stream<FrenchICard> cardsInMano = bjp.compareHand().getCards().stream();
        System.out.println("giocatore "+bjp.getNome()+" ha: ");
        cardsInMano.forEach(s -> System.out.println(s.getRank()));
        System.out.println("Con valore di " + bj.getGame().calculateHand(bjp.compareHand().getCards()));
    }
}
