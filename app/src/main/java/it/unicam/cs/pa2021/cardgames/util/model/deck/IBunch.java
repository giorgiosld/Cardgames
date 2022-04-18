package it.unicam.cs.pa2021.cardgames.util.model.deck;

import it.unicam.cs.pa2021.cardgames.util.model.cards.ICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

import java.util.List;

/**
 * INterfaccia che rappresenta un insieme di carte
 */
public interface IBunch<T extends ICard<? extends IRank,? extends ISuit>> {

    /**
     * Metodo che torna le carte contenute nel mazzo
     *
     * @return le carte contenute nel mazzo
     */
    List<T> getCards();
}
