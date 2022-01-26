package it.unicam.cs.pa2021.cardgames;

import java.util.List;

/**
 * Interfaccia che rappresenta un generico gioco
 */
public interface Game {

    /**
     * Ritorna le regole del gioco attuale
     *
     * @return regole del gioco attuale
     */
    List<Rules> seeRules();

    /**
     * Metodo che permette di iniziare la partita
     */
    void start();

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
}
