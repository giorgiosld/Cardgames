package it.unicam.cs.pa2021.cardgames;

/**
 * Interfaccia rappresentante un generico giocatore di un gioco di carte
 */
public interface Player<T> {

    /**
     * Metodo che permette la visualizzazione del punteggio
     */
    int seePoints();
}
