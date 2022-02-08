package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.roles.Player;

import java.util.Collection;

/**
 * Interfaccia che implementa gli elementi di una mano.
 *
 * @param <T> fa rimerimento al tipo di gioco utilizzato
 */
public interface Hand<T> {

    /**
     * Metodo che ritorna chi ha giocato la mano
     *
     * @return il giocatore che ha giocato la mano
     */
    Player<T> getOwner();

    /**
     * Aggiunge un elemento alla mano
     *
     * @param card la carta aggiunta alla mano
     */
    void addElement(T card);

    /**
     * Rimuove un elemento alla mano
     *
     * @param card la carta che deve essere eliminata
     * @return true se &grave; contenuta nella mano e viene eliminati, false altrimenti
     */
    boolean removeElement(T card);

    /**
     * Metodo che libera la mano dai vari elementi
     *
     * @return gli elementi che sono stati tolti dalla mano
     */
    Collection<T> clear();
}
