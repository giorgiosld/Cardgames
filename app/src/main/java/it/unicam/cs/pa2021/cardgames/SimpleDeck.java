package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleDeck<T extends SimpleCard> implements Deck<T>{

    public List<T> deck;

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
    public void addCard(T card, int index) {
        deck.add(index, card);
    }


    @Override
    public void addCards(List cards) {
        deck.addAll(cards);
    }

    @Override
    public T removeCard(int index) {
        T cardRemoved = deck.remove(index);
        return cardRemoved;
    }

    @Override
    public List removeCards(List cards) {
        deck.removeAll(cards);
        return cards;
    }
}
