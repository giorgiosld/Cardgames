package it.unicam.cs.pa2021.cardgames.util.model.player;

import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;

public interface IHand <T extends SimpleICard<? extends IRank, ? extends ISuit>>{

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
}
