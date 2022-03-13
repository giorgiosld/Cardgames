package it.unicam.cs.pa2021.cardgames.util.controller.table;

import it.unicam.cs.pa2021.cardgames.util.model.player.SimpleIPlayer;
import it.unicam.cs.pa2021.cardgames.util.model.cards.IRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.SimpleICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.ISuit;
import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleIGameTable<T extends SimpleICard<? extends IRank, ? extends ISuit>, P extends SimpleIPlayer<T>> implements IGameTable<T, P> {

    protected SimpleIDeck<T> deck;
    private final List<P> players;

    public SimpleIGameTable(SimpleIDeck<T> deck){
        this.deck = deck;
        this.players= new ArrayList<>();
    }

    @Override
    public void setDeck(SimpleIDeck<T> deck) {
        this.deck = deck;
    }

    @Override
    public void addPlayer(P player) {
        this.players.add(player);
    }

    @Override
    public void removePayer(P player) {
        this.players.remove(player);
    }


    @Override
    public int getNumberPlayer() {
        return this.players.size();
    }

    @Override
    public List<P> getPlayers(){
        return this.players;
    }
}
