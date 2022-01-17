package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia usata per rappresentare un generico mazzo su un tavolo da gioco
 */
public interface Deck {

    /**
     * Mischia l'ordine delle carte
     */
    void mischiare();

    /**
     * Pesca una carta dal mazzo
     *
     * @param player il giocatore che deve pescare
     * @return la carta pescata
     */
    Card pescare(Player player);

    /**
     * Restituisce il tipo di mazzo che si sta usando
     *
     * @return tipo di mazzo
     */
    TypeDeck tipo();

    /**
     * Restituisce il numero di carte rimaste all'interno del mazzo
     *
     * @return il numero di carte ancora giocabili
     */
    int carteRimasteNelMazzo();

    /**
     * Restituisce il numero di carte dal quale &grave; formato il mazzo
     *
     * @return
     */
    int size();
}
