package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;

import java.util.ArrayList;
import java.util.List;

public class SimpleGameTable implements GameTable{

    List<Player> players = new ArrayList<>();
    Deck<? extends SimpleCard> mazzo;
    Game game;


    @Override
    public void chooseGame() {

    }

    @Override
    public boolean setMazzo(Deck<? extends SimpleCard> deck) {
        this.mazzo = deck;
        return true;
    }

    @Override
    public boolean addPlayer(Player<Game> player) {
        this.players.add(player);
        return true;
    }

    @Override
    public boolean removePlayer(Player<Game> player) {
        this.players.remove(player);
        return true;
    }
}
