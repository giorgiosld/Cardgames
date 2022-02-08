package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import it.unicam.cs.pa2021.cardgames.games.SimpleGame;
import it.unicam.cs.pa2021.cardgames.roles.SimplePlayer;

import java.util.List;

public class SimpleGameTable<T extends SimpleCard<? extends Rank, ? extends Suit>, P extends SimpleGame<T>> implements GameTable<T,P>{

    SimpleDeck<? extends SimpleCard<? extends Rank, ? extends Suit>> deck;
    List<SimplePlayer<P>> players;
    List<P> games;

    SimpleGameTable(SimpleDeck<T> deck){
        this.deck = deck;
    }

    @Override
    public void setDeck(SimpleDeck<T> deck) {
        this.deck = deck;
    }

    @Override
    public void addPlayer(SimplePlayer<P> player) {
        this.players.add(player);
    }

    @Override
    public void removePayer(SimplePlayer<P> player) {
        this.players.remove(player);
    }

    @Override
    public void chooseGame(P game) {
        //in caso eccezione
        if (games.isEmpty())
            addGame(game);
        P gametoStart = games.stream().filter(x -> x.equals(game)).findFirst().orElse(null);
        assert gametoStart != null;
        this.deck = gametoStart.start();
    }

    @Override
    public void addGame(P game) {
        this.games.add(game);
    }


}
