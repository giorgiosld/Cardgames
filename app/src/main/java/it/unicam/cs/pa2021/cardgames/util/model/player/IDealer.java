package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.ICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;

/**
 * Interfaccia che rappresenta un ruolo che puo assumere un qualsiasi giocatore
 *
 * @param <P> la tipologia di carte
 * @param <T> la tipologia del mazzo
 */
public interface IDealer<P extends ICard<? extends IRank, ? extends ISuit>,T extends SimpleIDeck<P>> {

    /**
     * Mischa il mazzo
     *
     * @return ritorna il mazzo mischiato
     */
     T shuffle(T bj);


    /**
     * Distribuisci una sola carta
     *
     * @return la carta restituita
     */
    P delOneCard(T deck);

    /**
     * Aggiunge una carta al banco
     *
     * @param deck il mazzo da dove prendere la carta
     */
    void addCardBanco(P deck);

    /**
     * Metodo che ritorna una lista di carte contenute nel banco
     *
     * @return la lista di carte contenute
     */
    IHand<P> getBanco();
}
