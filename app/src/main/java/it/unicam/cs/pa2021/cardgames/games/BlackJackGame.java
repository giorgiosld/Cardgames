package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.SimpleDeck;
import it.unicam.cs.pa2021.cardgames.cards.*;


public class BlackJackGame  extends SimpleGame<FrenchCard> implements Game<FrenchCard>{

    public SimpleDeck<FrenchCard> deck;

    public BlackJackGame(){
        deck = new SimpleDeck<>();
    }

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
