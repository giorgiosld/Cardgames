package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

public abstract class SimpleIPlayer<T extends SimpleICard<? extends IRank, ? extends ISuit>> implements IPlayer<T> {

    public String nome;
    public int id;
    Hand<T> hand;

    public SimpleIPlayer(String nome, int id){
        this.nome = nome;
        this.id = id;
        hand = new Hand<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void addCardToHand(T card){
        hand.addCard(card);
    }

    @Override
    public T getCard(int index) {
        return hand.getCard(index);
    }

    @Override
    public T removeCard() {
        return hand.removeCard();
    }
}
