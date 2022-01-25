package it.unicam.cs.pa2021.cardgames;

/**
 * Questa interfaccia rappresenta un generico tavolo da gioco
 */
public interface GameTable {

    /**
     * Sceglie il gioco a cui vuoi partecipare
     */
    void chooseGame();

    /**
     * Inserisce il mazzo
     *
     * @param deck il mazzo da aggiungere
     * @return true se il mazzo &egrave; aggiunto con successo, false altrimenti
     */
    boolean addMazzo(Deck<TypeDeck> deck);

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




}
