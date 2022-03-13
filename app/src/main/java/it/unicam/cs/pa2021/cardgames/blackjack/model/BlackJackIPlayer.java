package it.unicam.cs.pa2021.cardgames.blackjack.model;

import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.model.player.Hand;
import it.unicam.cs.pa2021.cardgames.util.model.player.IBanker;
import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;

public class BlackJackIPlayer extends SimpleIPlayer<FrenchICard> implements IBanker<FrenchICard> {

    private Hand<FrenchICard> bjHand;
    private int bank;
    private int bet;

    public BlackJackIPlayer(String nome, int id) {
        super(nome, id);
        this.bjHand = new Hand<>();
        this.bank = 100;
    }


    @Override
    public void placeBet(int bet) {
        this.bet = bet;
    }

    @Override
    public int getBet() {
        return this.bet;
    }

    @Override
    public void resolveBet() {

    }

    @Override
    public Hand<FrenchICard> compareHand() {
        return this.bjHand;
    }

    @Override
    public void addCardToHand(FrenchICard card){
        bjHand.addCard(card);
    }

    public int getBank(){
        return this.bank;
    }

    public void setBank(int newBank){
        this.bank = newBank;
    }

    @Override
    public void clearHand(){
        this.bjHand.removeCards();
    }
}
