package it.unicam.cs.pa2021.cardgames;

import java.util.ArrayList;
/**
 * Interfaccia rappresentante le regole di un generico gioco di carte
 */
public interface Rules<T> {

    /**
     * Metodo che permette di aggiungere una regola
     *
     * @param r la regola da aggiungere
     * @return true se aggiunta
     */
    boolean addRules(Rules<T> r);

    /**
     * Metodo che permette l'eliminazione di una regola
     *
     * @param index l'indice della regola che si vuole eliminare
     * @return true se eliminata
     */
    boolean removeRules(int index);
}
