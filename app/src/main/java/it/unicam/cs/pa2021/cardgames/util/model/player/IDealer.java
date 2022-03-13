package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.controller.table.SimpleIGameTable;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;

import java.util.List;

public interface IDealer<P extends SimpleICard<? extends IRank, ? extends ISuit>,T extends SimpleIDeck<P>,R extends SimpleIPlayer<P>, Q extends SimpleIGameTable<P,R>> {

    /**
     * Mischa il mazzo
     */
     T shuffle(T bj);


    /**
     * Colleziona le carte
     */
    void collectCards();

    /**
     * Distribuisci una sola carta
     * @return la carta restituita
     */
    P delOneCard(T deck);

    /**
     * Aggiunge una carta al banco
     *
     * @param deck il mazzo da dove prendere la carta
     * @return la carta aggiunta
     */
    void addCardBanco(P deck);

    /**
     * Metodo che ritorna una lista di carte contenute nel banco
     *
     * @return la lista di carte contenute
     */
    Hand<P> getBanco();
}
