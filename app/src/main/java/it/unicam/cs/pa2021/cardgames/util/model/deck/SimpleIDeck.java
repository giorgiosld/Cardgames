package it.unicam.cs.pa2021.cardgames.util.model.deck;

import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleIDeck<T extends SimpleICard<? extends IRank,? extends ISuit>> implements IDeck<T> {

    public List<T> deck;

    public SimpleIDeck(){
        this.deck = new ArrayList<>();
    }


    @Override
    public int remainingCards() {
        return this.size();
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public void addCard(T card, int index) {
        deck.add(index, card);
    }


    @Override
    public void addCards(List<T> cards) {
        deck.addAll(cards);
    }

    @Override
    public T removeCard(int index) {
        return deck.remove(index);
    }

    @Override
    public List<T> removeCards(List<T> cards) {
        deck.removeAll(cards);
        return cards;
    }

    @Override
    public List<T> getCards() {
        return this.deck;
    }
}
