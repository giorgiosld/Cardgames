package it.unicam.cs.pa2021.cardgames;

import java.util.List;

/**
 * Implementazione di default del tavolo da gioco
 */
public class DefaultGameTable implements TavoloDaGioco{

    public List<Giocatore> listaGiocatori;
    public int numeroGiocatori;
    public Gioco tipoDiGioco;

    public DefaultGameTable(List<Giocatore> listPlayer, Gioco tipologia){
        this.listaGiocatori = listPlayer;
        this.numeroGiocatori = listPlayer.size();
        this.tipoDiGioco = tipologia;
    }

    @Override
    public void chooseGame() {
        //da richiamare a fine partita
    }

    @Override
    public boolean addMazzo(Mazzo mazzo) {
        if(mazzo == null) throw new NullPointerException();
        if(!this.tipoDiGioco.getTypeCards().equals(mazzo)) throw new IllegalArgumentException();
        int sizeMazzo = mazzo.size();
        // 0. Verificare che il mazzo sia non-null; Nel caso NUllpointerException
        // 1. Verificare che il mazzo sia compatibile con il gioco scelto
        // 1. Ottenere le dimensioni del mazzo

        return false;
    }

    @Override
    public boolean addPlayer(Giocatore giocatore) {
        return false;
    }

    @Override
    public boolean removePlayer(Giocatore giocatore) {
        return false;
    }

    @Override
    public boolean addRules(Regole regole) {
        return false;
    }

    @Override
    public Giocatore winnerRound() {
        return null;
    }

    @Override
    public Giocatore winnerGame() {
        return null;
    }
}
