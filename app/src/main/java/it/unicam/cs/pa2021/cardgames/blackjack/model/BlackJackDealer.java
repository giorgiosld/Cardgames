package it.unicam.cs.pa2021.cardgames.blackjack.model;

import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.model.player.Hand;
import it.unicam.cs.pa2021.cardgames.util.model.player.IDealer;
import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;

public class BlackJackDealer extends SimpleIPlayer<FrenchICard> implements IDealer<FrenchICard, BlackJackIDeck> {

    private final Hand<FrenchICard> banco;

    public BlackJackDealer(String nome, int id){
        super(nome, id);
        banco = new Hand<>();
    }



    @Override
    public BlackJackIDeck shuffle(BlackJackIDeck bjDeck) {
        return bjDeck.shuffle(bjDeck);
    }

    @Override
    public FrenchICard delOneCard(BlackJackIDeck bjDeck) {
        return bjDeck.removeCard(0);
    }

    @Override
    public void addCardBanco(FrenchICard card) {
        this.banco.addCard(card);
    }

    @Override
    public Hand<FrenchICard> getBanco() {
        return this.banco;
    }


    @Override
    public void addCardToHand(FrenchICard card) {
        throw new UnsupportedOperationException();
    }

    @Override
    public FrenchICard getCard(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public FrenchICard removeCard() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearHand() {
        this.banco.removeCards();
    }
}
