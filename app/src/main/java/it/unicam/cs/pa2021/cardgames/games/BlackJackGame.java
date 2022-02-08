package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.SimpleDeck;
import it.unicam.cs.pa2021.cardgames.cards.FrenchCard;
import it.unicam.cs.pa2021.cardgames.cards.FrenchRank;
import it.unicam.cs.pa2021.cardgames.cards.FrenchSuit;

public class BlackJackGame extends SimpleGame implements Game{

    public SimpleDeck<FrenchCard> deck;


    @Override
    public void start() {
        deck = initializeDeck();
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
