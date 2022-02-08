package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import it.unicam.cs.pa2021.cardgames.games.SimpleGame;
import it.unicam.cs.pa2021.cardgames.roles.SimplePlayer;

public interface GameTable<T extends SimpleCard<? extends Rank, ? extends Suit>,P extends SimpleGame> {

    void setDeck(SimpleDeck<T> deck);

    void addPlayer(SimplePlayer<P> player);

    void removePayer(SimplePlayer<P> player);

    void chooseGame(P game);

    void addGame(P game);
}
