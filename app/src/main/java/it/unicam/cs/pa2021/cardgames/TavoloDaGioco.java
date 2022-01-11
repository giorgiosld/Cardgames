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
     * @param mazzo il mazzo &egrave; da aggiungere
     * @return true se il mazzo &egrave; aggiunto con successo, false altrimenti
     */
    boolean addMazzo(Mazzo mazzo);

    /**
     * Metodo per far sedere un giocatore al tavolo se non presente a inizio partita
     *
     * @param giocatore giocatore da aggiungere
     * @return true se il giocatore &egrave; aggiunto con sucesso, false altrimenti
     */
    boolean addPlayer(Giocatore giocatore);

    /**
     * Metodo per rimuovere un giocatore dal tavolo
     *
     * @param giocatore giocatore da rimuovere
     * @return true se il giocatore &egrave; rimosso con sucesso, false altrimenti
     */
    boolean removePlayer(Giocatore giocatore);

    /**
     * Inserisce le regole del gioco scelto
     *
     * @param regole regole del gioco
     * @return true se le regole sono aggiunte con sucesso, false altrimenti
     */
    boolean addRules(Regole regole);

    /**
     * Calcola chi vince il round
     *
     * @return il giocatore che ha vinto il round
     */
    Giocatore winnerRound();

    /**
     * Calcola chi ha vinto il gioco in generale
     *
     * @return il giocatore che ha vinto la partita
     */
    Giocatore winnerGame();
}
