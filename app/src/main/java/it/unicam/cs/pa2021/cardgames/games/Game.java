package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.Rules;
import it.unicam.cs.pa2021.cardgames.SimpleDeck;
import it.unicam.cs.pa2021.cardgames.cards.Rank;
import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;
import it.unicam.cs.pa2021.cardgames.cards.Suit;

import java.util.List;

/**
 * Interfaccia che rappresenta un generico gioco
 */
public interface Game<T extends SimpleCard<? extends Rank, ? extends Suit>> {

    /**
     * Ritorna le regole del gioco attuale
     *
     * @return regole del gioco attuale
     */
    List<Rules> seeRules();

    /**
     * Metodo che permette di iniziare la partita
     */
    SimpleDeck<T> start();

    /**
     * Metodo che permette l'aggiunta di una regola al gioco
     *
     * @param rule regola da inserire
     * @return true se viene aggiunta
     */
    boolean addRule(Rules rule);

    /**
     * Metodo che permette la rimozione di una regola dal gioco
     *
     * @param rule regola da rimuovere
     * @return true se viene rimossa
     */
    boolean removeRule(Rules rule);

    /**
     * Metodo che inizializza un mazzo all'interno del gioco
     *
     * @return il tipo di mazzo, pu&ograve; puo ritornare sia mazzo francese che mazzo italiano
     */
    SimpleDeck<? extends SimpleCard<? extends Rank, ? extends Suit>> initializeDeck();
}
