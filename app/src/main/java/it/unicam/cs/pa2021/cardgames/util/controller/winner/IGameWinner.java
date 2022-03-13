package it.unicam.cs.pa2021.cardgames.util.controller.winner;

import it.unicam.cs.pa2021.cardgames.util.controller.table.SimpleIGameTable;
import it.unicam.cs.pa2021.cardgames.util.model.player.IPlayer;
import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;

import java.util.List;

public interface IGameWinner  {

    /**
     * Metodo che decreterà il vincitore della mano
     *
     * @param table il tavolo da cui estrarre il vincitore
     */
    void evaluateWinner();
}
