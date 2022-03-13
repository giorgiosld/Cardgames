package it.unicam.cs.pa2021.cardgames.util.controller.engine;

import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;

import java.io.IOException;

/**
 * Interfaccia che si occupa di far funzionare i giochi che possono essere implementati
 *
 * @param <T> tipo di giocatore quale gioca al gioco
 */
public interface IEngine<T extends SimpleIPlayer<? extends SimpleICard<? extends IRank, ? extends ISuit>>> {

    /**
     * Metodo che permette il mischiaggio del mazzo all'inizio del gioco
     */
    void shuffleDeck();

    /**
     * Metodo che permette di ripulire le mani dopo una partita
     */
    void clearHand();

    /**
     * Metodo che permette la distribuzione delle carte
     */
    void dealCards();

    /**
     * Metodo che permette di fare una scelta in base al gioco giocato
     *
     * @throws IOException eccezzione per terminale
     */
    void makeChoise() throws IOException;

    /**
     * Metodo che permette la risoluzione dell'azione scelta
     *
     * @param action la scelta selezionata dal giocatore
     * @param player il giocatore che ha effettuato la scelta
     */
    void resolveAction(int action, T player);
}
