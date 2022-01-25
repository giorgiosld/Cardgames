package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.FrenchRank;
import it.unicam.cs.pa2021.cardgames.cards.FrenchSuit;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDeckTest {

    @Test
    public void createDeckBlackJack(){
        SimpleDeck<SimpleCard> deck = new SimpleDeck<>();
        for (FrenchSuit s : FrenchSuit.values()){
            for (FrenchRank r: FrenchRank.values()){
                deck.addCard(new SimpleCard(r, s));
            }
        }
        assertEquals(deck.size(), 52);
    }

    public void createDeckScopa(){
        SimpleDeck<SimpleCard> deck = new SimpleDeck<>();

    }
}
