package it.unicam.cs.pa2021.cardgames.util.model.game;

import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

/**
 * Interfaccia che rappresenta un generico gioco
 *
 * @param <T> il tipo parametrico per le carte contenute nel mazzoì
 */
public interface IGame<T extends SimpleICard<? extends IRank, ? extends ISuit>, Q extends SimpleIDeck<T>> {


    /**
     * Metodo che permette di iniziare la partita
     */
    SimpleIDeck<T> start();

    /**
     * Metodo che inizializza un mazzo all'interno del gioco
     *
     * @return il tipo di mazzo, pu&ograve; puo ritornare sia mazzo francese che mazzo italiano
     */
    //SimpleIDeck<? extends SimpleICard<? extends IRank, ? extends ISuit>> initializeDeck();
    Q initializeDeck();
}
