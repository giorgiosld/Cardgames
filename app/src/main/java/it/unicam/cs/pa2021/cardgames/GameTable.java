package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import it.unicam.cs.pa2021.cardgames.games.SimpleGame;
import it.unicam.cs.pa2021.cardgames.roles.SimplePlayer;

/**
 * Interfaccia che rappresenta un generico campo da gioco
 *
 * @param <T> la tipologia di carte ammesse nel tavolo
 * @param <P> il tipologia di gioco da giocare
 */
public interface GameTable<T extends SimpleCard<? extends Rank, ? extends Suit>,P extends SimpleGame> {

    /**
     * Metodo che permette il settaggio di un deck all'interno del campo da gioco
     *
     * @param deck il mazzo da aggiungere
     */
    void setDeck(SimpleDeck<T> deck);

    /**
     * Metodo che permette l'aggiunta dei giocatori all'interno del campo
     *
     * @param player il giocatore che vuole aggiungersi
     */
    void addPlayer(SimplePlayer<P> player);

    /**
     * Metodo che permette la rimozione dei giocatori all'interno del campo
     *
     * @param player il giocatore che deve essere rimosso
     */
    void removePayer(SimplePlayer<P> player);

    /**
     * Metodo che permette la start del gioco all'interno del tavolo da gioco
     *
     * @param game
     */
    void startGame(P game);


    /**
     * Metodo che ritorna il numero di giocatori presenti all'interno del tavolo da gioco
     *
     * @return il numero di giocatori presenti
     */
    int getNumberPlayer();
}
