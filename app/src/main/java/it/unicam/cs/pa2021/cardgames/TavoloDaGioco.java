package it.unicam.cs.pa2021.cardgames;

/**
 * Questa interfaccia rappresenta un generico tavolo da gioco
 */
public interface TavoloDaGioco {

    /**
     * Sceglie il gioco a cui vuoi partecipare
     */
    void chooseGame();

    /**
     * Inserisce il mazzo
     *
     * @param deck il mazzo &egrave; da aggiungere
     * @return true se il mazzo &egrave; aggiunto con successo, false altrimenti
     */
    boolean addMazzo(Deck deck);

    /**
     * Metodo per far sedere un giocatore al tavolo se non presente a inizio partita
     *
     * @param player giocatore da aggiungere
     * @return true se il giocatore &egrave; aggiunto con sucesso, false altrimenti
     */
    boolean addPlayer(Player player);

    /**
     * Metodo per rimuovere un giocatore dal tavolo
     *
     * @param player giocatore da rimuovere
     * @return true se il giocatore &egrave; rimosso con sucesso, false altrimenti
     */
    boolean removePlayer(Player player);

    /**
     * Inserisce le regole del gioco scelto
     *
     * @param rules regole del gioco
     * @return true se le regole sono aggiunte con sucesso, false altrimenti
     */
    boolean addRules(Rules rules);

    /**
     * Calcola chi vince il round
     *
     * @return il giocatore che ha vinto il round
     */
    Player winnerRound();

    /**
     * Calcola chi ha vinto il gioco in generale
     *
     * @return il giocatore che ha vinto la partita
     */
    Player winnerGame();
}
