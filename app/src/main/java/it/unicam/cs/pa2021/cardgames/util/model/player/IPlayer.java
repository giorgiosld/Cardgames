package it.unicam.cs.pa2021.cardgames.util.model.player;

/**
 * Interfaccia rappresentante un generico giocatore di un gioco di carte
 */
public interface IPlayer<T> {

    /**
     * Metodo che torna il nome del player
     *
     * @return nome del player
     */
    String getNome();

    /**
     * Meotodo che ritorna l'id di un player
     *
     * @return l'id del player
     */
    int getId();

    /**
     * Metodo che permette l'aggiunta di una carta sulla mano
     *
     * @param card la carta da aggiungere
     */
    public void addCardToHand(T card);

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

    void clearHand();
}
