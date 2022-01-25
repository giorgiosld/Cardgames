package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia che rappresenta un generico gioco
 */
public interface Game<T> {

    /**
     * Ritorna le regole del gioco attuale
     *
     * @return regole del gioco attuale
     */
    Rules<T> seeRules();

    /**
     * Metodo che permette di iniziare la partita
     */
    void start();


}
