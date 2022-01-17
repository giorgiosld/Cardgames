package it.unicam.cs.pa2021.cardgames;

import java.util.List;

/**
 * Implementazione di default del tavolo da gioco
 */
public class DefaultGameTable implements GameTable {

    public List<Player> listaGiocatori;
    public int numeroGiocatori;
    public Game tipoDiGame;

    public DefaultGameTable(List<Player> listPlayer, Game tipologia){
        this.listaGiocatori = listPlayer;
        this.numeroGiocatori = listPlayer.size();
        this.tipoDiGame = tipologia;
    }

    @Override
    public void chooseGame() {
        //da richiamare a fine partita
    }

    @Override
    public boolean addMazzo(Deck deck) {
        if(deck == null) throw new NullPointerException();
        if(!this.tipoDiGame.getTypeCards().equals(deck)) throw new IllegalArgumentException();
        int sizeMazzo = deck.size();
        // 0. Verificare che il mazzo sia non-null; Nel caso NullpointerException
        // 1. Verificare che il mazzo sia compatibile con il gioco scelto
        // 1. Ottenere le dimensioni del mazzo

        return false;
    }

    @Override
    public boolean addPlayer(Player player) {
        return false;
    }

    @Override
    public boolean removePlayer(Player player) {
        return false;
    }

    @Override
    public boolean addRules(Rules rules) {
        return false;
    }

    @Override
    public Player winnerRound() {
        return null;
    }

    @Override
    public Player winnerGame() {
        return null;
    }
}
