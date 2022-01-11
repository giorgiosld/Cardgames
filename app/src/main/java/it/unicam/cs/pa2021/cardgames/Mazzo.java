package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia usata per rappresentare un generico mazzo su un tavolo da gioco
 */
public interface Mazzo {

    /**
     * Mischia l'ordine delle carte
     */
    void mischiare();

    /**
     * Pesca una carta dal mazzo
     *
     * @param giocatore il giocatore che deve pescare
     * @return la carta pescata
     */
    Carta pescare(Giocatore giocatore);

    /**
     * Restituisce il tipo di mazzo che si sta usando
     *
     * @return tipo di mazzo
     */
    TipologiaMazzo tipo();

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
