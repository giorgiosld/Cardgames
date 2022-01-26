package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;

import java.util.List;

/**
 * Interfaccia usata per rappresentare un generico mazzo su un tavolo da gioco
 *
 * @param <T> il tipo parametrico per le carte contenute nel mazzo
 */
public interface Deck<T> {

    /**
     * Mischia il mazzo di carte in maniera casuale
     */
    void shuffle();


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
     * @param index
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
    SimpleCard removeCard(int index);

    /**
     * Metodo che permette la rimozione di una lista di carte dal mazzo
     *
     * @return la lista di carte rimosse
     */
    List<T> removeCards(List<T> cards);
}
