package it.unicam.cs.pa2021.cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleDeck<T> implements Deck<SimpleCard>{

    public List<SimpleCard> deck;

    public SimpleDeck(){
        this.deck = new ArrayList<>();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
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
    public void addCard(SimpleCard card) {
        deck.add(card);
    }


    @Override
    public void addCards(List cards) {

    }

    @Override
    public SimpleCard removeCard() {
        return null;
    }

    @Override
    public List removeCards() {
        return null;
    }
}
