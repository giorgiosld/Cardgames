package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.Rank;
import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;
import it.unicam.cs.pa2021.cardgames.cards.Suit;
import it.unicam.cs.pa2021.cardgames.games.Game;
import it.unicam.cs.pa2021.cardgames.roles.Player;

import java.util.ArrayList;
import java.util.List;

public class SimpleGameTable implements GameTable{

    List<Player> players = new ArrayList<>();
    Deck<? extends SimpleCard<? extends Rank,? extends Suit>> mazzo;
    List<Game> gameList = new ArrayList<>();


    @Override
    public void chooseGame(Game game) {
            this.gameList.stream().filter(x -> x.equals(game)).findFirst().get().start();
    }

    @Override
    public boolean setMazzo(Deck<? extends SimpleCard> deck) {
        //this.mazzo = deck;
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

    @Override
    public boolean addGame(Game game) {
        return this.gameList.add(game);
    }
}
