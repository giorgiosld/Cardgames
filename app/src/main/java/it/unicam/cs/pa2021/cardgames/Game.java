package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia che rappresenta un generico gioco
 */
public interface Game {

    /**
     * Ritorna la tipologia di mazzo utilizzato nel gioco
     *
     * @return tipologia del mazzo
     */
    Deck getTypeCards();
}
