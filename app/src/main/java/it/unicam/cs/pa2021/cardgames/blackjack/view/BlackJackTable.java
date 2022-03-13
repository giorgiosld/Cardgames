package it.unicam.cs.pa2021.cardgames.blackjack.view;

import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIGame;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackDealer;
import it.unicam.cs.pa2021.cardgames.util.controller.winner.IGameWinner;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.controller.table.SimpleIGameTable;

import java.util.List;

public class BlackJackTable extends SimpleIGameTable<FrenchICard, BlackJackIPlayer> implements IGameWinner<BlackJackIPlayer>{

    private BlackJackIDeck deck;
    private BlackJackIGame game;
    private List<BlackJackIPlayer> players;
    private BlackJackDealer mazziere;

    public BlackJackTable(BlackJackIDeck deck,BlackJackIGame game) {
        super(deck);
        this.game = game;
    }


    @Override
    public void startGame() {
        this.deck = this.game.start();
        //addmano turno
        //evaluate winner
    }

    @Override
    public BlackJackIDeck getDeck() {
        return this.deck;
    }

//    @Override
//    public BlackJackIDeck initializeDeck() {
//        for (FrenchISuit s : FrenchISuit.values()){
//            for (FrenchIRank r: FrenchIRank.values()){
//                deck.addCard(new FrenchICard(r, s), deck.size());
//            }
//        }
//        return deck;
//    }


    @Override
    public BlackJackIPlayer evaluateWinner(List<BlackJackIPlayer> players) {
        return null;
    }

    public void addDealer(BlackJackDealer dealer){
        mazziere = dealer;
    }

    public BlackJackDealer getDealer(){
        return this.mazziere;
    }

    public BlackJackIGame getGame() {
        return game;
    }
}
