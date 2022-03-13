package it.unicam.cs.pa2021.cardgames.blackjack.view;

import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIGame;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackDealer;
import it.unicam.cs.pa2021.cardgames.util.controller.winner.IGameWinner;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.controller.table.SimpleIGameTable;

import java.util.List;

public class BlackJackTable extends SimpleIGameTable<FrenchICard, BlackJackIPlayer>{

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
    }

    @Override
    public BlackJackIDeck getDeck() {
        return this.deck;
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
