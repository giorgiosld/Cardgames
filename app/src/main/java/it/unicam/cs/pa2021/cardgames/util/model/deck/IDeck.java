package it.unicam.cs.pa2021.cardgames.util.model.deck;


import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

import java.util.List;

/**
 * Interfaccia usata per rappresentare un generico mazzo su un tavolo da gioco
 *
 * @param <T> il tipo parametrico per le carte contenute nel mazzo
 */
public interface IDeck<T extends SimpleICard<? extends IRank, ? extends ISuit>> {



    /**
     * Restituisce il numero di carte rimaste all'interno del mazzo
     *
     * @return il numero di carte ancora giocabili
     */
    int remainingCards();

    /**
     * Restituisce il numero di carte dal quale &grave; formato il mazzo
     *
     * @return la dimensione del mazzo
     */
    int size();

    /**
     * Metodo che permette di aggiungere una carta al mazzo
     *
     * @param card la carta aggiunta
     * @param index l'indice al quale si vuole aggiungere la carta
     */
    void addCard(T card, int index);

    /**
     * Metodo che permette l'aggiunta di una lista di carte al mazzo
     *
     * @param cards la lista di carte da aggiungere
     */
    void addCards(List<T> cards);

    /**
     * Metodo che permette la rimozione di una carta dal mazzo
     *
     * @param index l'indice della carta da rimuovere
     * @return la carta rimossa
     */
    T removeCard(int index);

    /**
     * Metodo che permette la rimozione di una lista di carte dal mazzo
     *
     * @return la lista di carte rimosse
     */
    List<T> removeCards(List<T> cards);

    /**
     * Metodo che torna le carte contenute nel mazzo
     *
     * @return le carte contenute nel mazzo
     */
    List<T> getCards();
}
