package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.ICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

import java.util.ArrayList;
import java.util.List;

public class Hand<T extends ICard<? extends IRank, ? extends ISuit>> implements IHand<T>{

    ArrayList<T> cardsInHand;

    public Hand(){
        cardsInHand = new ArrayList<>();
    }

    @Override
    public void addCard(T card) {
        cardsInHand.add(card);
    }

    @Override
    public T getCard(int index) {
        return cardsInHand.get(index);
    }

    @Override
    public T removeCard() {
        return cardsInHand.remove(0);
    }

    @Override
    public List<T> getCards(){
        return this.cardsInHand;
    }

    @Override
    public void removeCards(){
        List<T> cardsToRemove = this.cardsInHand;
        this.cardsInHand.removeAll(cardsToRemove);
    }

    @Override
    public int numCardsHand(){
        return this.cardsInHand.size();
    }
}
