package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.SimpleDeck;
import it.unicam.cs.pa2021.cardgames.cards.*;

public class BlackJackGame<T extends SimpleCard<? extends Rank, ? extends Suit>>  extends SimpleGame<T> implements Game<T>{

    public SimpleDeck<FrenchCard> deck;


    @Override
    public SimpleDeck<FrenchCard> start() {
        return deck = initializeDeck();
    }

    @Override
    public SimpleDeck<FrenchCard> initializeDeck(){
        for (FrenchSuit s : FrenchSuit.values()){
            for (FrenchRank r: FrenchRank.values()){
                deck.addCard(new FrenchCard(r, s), deck.size());
            }
        }
        return deck;
    }

}
