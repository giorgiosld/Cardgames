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
     * da controllare dopo su github
     */
    void resolveBet();

    /**
     * da controllare dopo su github
     */
    Hand<T> compareHand();

}
