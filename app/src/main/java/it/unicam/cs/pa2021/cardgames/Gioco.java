package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia che rappresenta un generico gioco
 */
public interface Gioco {

    /**
     * Ritorna la tipologia di mazzo utilizzato nel gioco
     *
     * @return tipologia del mazzo
     */
    Mazzo getTypeCards();
}
