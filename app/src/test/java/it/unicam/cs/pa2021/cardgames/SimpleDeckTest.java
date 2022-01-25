package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleDeckTest {

    @Test
    public void createDeckBlackJack(){
        SimpleDeck<FrenchCard> deck = new SimpleDeck<>();
        for (FrenchSuit s : FrenchSuit.values()){
            for (FrenchRank r: FrenchRank.values()){
                deck.addCard(new FrenchCard(r, s), deck.size());
            }
        }
        assertEquals(deck.size(), 52);
        deck.shuffle();
        assertEquals(deck.size(), 52);
        FrenchCard toAdd = new FrenchCard(FrenchRank.TWO, FrenchSuit.DIAMONDS);
        deck.addCard(toAdd, deck.size() );
        assertEquals(deck.size(), 53);
        FrenchCard toDelete = deck.removeCard(deck.size()-1);
        assertEquals(toDelete, toAdd);
        assertEquals(deck.size(), 52);
        List<FrenchCard> listToAdd = new ArrayList<>();
        FrenchCard toAddList1 = new FrenchCard(FrenchRank.TEN, FrenchSuit.CLUBS);
        FrenchCard toAddList2 = new FrenchCard(FrenchRank.SEVEN, FrenchSuit.HEARTS);
        FrenchCard toAddList3 = new FrenchCard(FrenchRank.NINE, FrenchSuit.SPADES);
        listToAdd.add(toAddList1);
        listToAdd.add(toAddList2);
        listToAdd.add(toAddList3);
        deck.addCards(listToAdd);
        assertEquals(deck.size(), 55);
        List<FrenchCard> listToRemove;
        listToRemove = listToAdd.stream().toList();
        List<FrenchCard> listRemoved;
        listRemoved = deck.removeCards(listToRemove);
        assertEquals(listToAdd, listRemoved);
    }

    @Test
    public void createDeckScopa(){
        SimpleDeck<ItalianCard> deck = new SimpleDeck<>();
        for (ItalianSuit s : ItalianSuit.values()){
            for (ItalianRank r: ItalianRank.values()){
                deck.addCard(new ItalianCard(r, s), deck.size());
            }
        }
        assertEquals(deck.size(), 40);
        deck.shuffle();
        assertEquals(deck.size(), 40);
        ItalianCard toAdd = new ItalianCard(ItalianRank.ACE, ItalianSuit.DENARI);
        deck.addCard(toAdd, deck.size());
        assertEquals(deck.size(), 41);
        ItalianCard toDelete = deck.removeCard(deck.size()-1);
        assertEquals(toDelete, toAdd);
        assertEquals(deck.size(), 40);
    }


}
