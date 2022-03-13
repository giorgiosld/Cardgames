package it.unicam.cs.pa2021.cardgames.util.controller.winner;

import it.unicam.cs.pa2021.cardgames.util.model.player.IPlayer;
import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;

import java.util.List;

public interface IGameWinner <T extends SimpleIPlayer> {

    /**
     * Metodo che decreterà il vincitore della mano
     *
     * @param players i giocatori presenti nel tavolo
     * @return il giocatore vincente
     */
    T evaluateWinner(List<T> players);
}
