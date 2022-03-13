package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;

public interface IBanker<T extends SimpleICard<? extends IRank, ? extends ISuit>> {

    /**
     * Tiene traccia del bet inizializzato, si associa alla mano del giocatore
     *
     * @param bet il bet che si vuole puntare
     */
    void placeBet(int bet);

    /**
     * Restituisce il bet puntato dal giocatore
     *
     * @return il bet puntato
     */
    int getBet();


    /**
     * Metodo che permette la restituzione di una mano
     *
     * @return la mano del giocatore
     */
    Hand<T> compareHand();

    /**
     * Metodo che permette di visualizzare i fondi del giocatore
     *
     * @return i fondi del giocatore
     */
    int getBank();

    /**
     * Metodo che permette il settaggio di un nuovo per un giocatore
     *
     * @param newBank il nuovo fondo da settare
     */
    void setBank(int newBank);
}
