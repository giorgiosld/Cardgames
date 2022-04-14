package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.ICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

import java.util.List;

/**
 * Interfaccia che rappresenta una generica mano di un player
 *
 * @param <T> la tipologia di carte contenute nella mano
 */
public interface IHand <T extends ICard<? extends IRank, ? extends ISuit>>{

    /**
     * Metodo che permette l'aggiunta di una carta nella mano
     */
    void addCard(T card);

    /**
     * Metodo che permette di prendere una carta dalla mano
     *
     * @param index l'indice della carta da visualizzare
     * @return la carta visualizzata
     */
    T getCard(int index);

    /**
     * Metodo che permette la rimozione di una carta dalla mano
     *
     * @return la carta rimossa
     */
    T removeCard();

    /**
     * Metodo che permette il ritorno delle carte contenute nella mano
     *
     * @return le carte contenute nella mano
     */
    List<T> getCards();

    /**
     * Metodo che rimuove tutte le carte dalla mano
     */
    void removeCards();

    /**
     * Metodo che permette di tornare il numero di carte in mano
     *
     * @return il numero di carte nella mano
     */
    int numCardsHand();
}
