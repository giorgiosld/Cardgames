package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import it.unicam.cs.pa2021.cardgames.games.SimpleGame;
import it.unicam.cs.pa2021.cardgames.roles.SimplePlayer;

import java.util.ArrayList;
import java.util.List;

public class SimpleGameTable<T extends SimpleCard<? extends Rank, ? extends Suit>, P extends SimpleGame<T>> implements GameTable<T,P>{

    SimpleDeck<T> deck;
    List<SimplePlayer<P>> players;
    P gameInTable;

    SimpleGameTable(SimpleDeck<T> deck, P game){
        this.deck = deck;;
        this.players= new ArrayList<>();
        this.gameInTable = game;
        startGame(this.gameInTable);
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
    public void startGame(P game) {
        SimpleDeck<T> deckToSet = gameInTable.start();
        setDeck(deckToSet);
    }

    @Override
    public int getNumberPlayer() {
        return this.players.size();
    }

    //TODO
    //modificare javadoc card
}
