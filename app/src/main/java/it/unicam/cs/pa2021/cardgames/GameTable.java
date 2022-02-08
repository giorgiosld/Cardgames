package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;
import it.unicam.cs.pa2021.cardgames.games.Game;
import it.unicam.cs.pa2021.cardgames.roles.Player;

/**
 * Questa interfaccia rappresenta un generico tavolo da gioco
 */
public interface GameTable {

    /**
     * Sceglie il gioco a cui vuoi partecipare
     *
     * @param game il gioco che si vuole scegliere
     */
    void chooseGame(Game game);

    /**
     * Inserisce il mazzo
     *
     * @param deck il mazzo da aggiungere
     * @return true se il mazzo &egrave; aggiunto con successo, false altrimenti
     */
    boolean setMazzo(Deck<? extends SimpleCard> deck);

    /**
     * Metodo per far sedere un giocatore al tavolo se non presente a inizio partita
     *
     * @param player giocatore da aggiungere
     * @return true se il giocatore &egrave; aggiunto con sucesso, false altrimenti
     */
    boolean addPlayer(Player<Game> player);

    /**
     * Metodo per rimuovere un giocatore dal tavolo
     *
     * @param player giocatore da rimuovere
     * @return true se il giocatore &egrave; rimosso con sucesso, false altrimenti
     */
    boolean removePlayer(Player<Game> player);


    /**
     * Metodo per aggiungere un nuovo gioco a quelli disponibili
     *
     * @oaram game il gioco da aggiungere
     */
    boolean addGame(Game game);

}
