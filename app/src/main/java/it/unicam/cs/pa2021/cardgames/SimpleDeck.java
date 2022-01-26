package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.Rank;
import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;
import it.unicam.cs.pa2021.cardgames.cards.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleDeck<T extends SimpleCard<? extends Rank,? extends Suit>> implements Deck<T>{

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
}
