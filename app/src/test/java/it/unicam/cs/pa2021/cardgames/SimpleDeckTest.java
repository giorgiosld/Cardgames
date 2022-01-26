package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleDeckTest {

    @Test
    public void manageDeckFrenchCards(){
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
        assertEquals(deck.size(), 52);
        FrenchCard toTest = new FrenchCard(FrenchRank.FOUR, FrenchSuit.DIAMONDS);
        assertEquals(FrenchRank.FOUR, toTest.getRank());
        assertEquals(FrenchSuit.DIAMONDS, toTest.getSuit());
        assertEquals(Face.DOWN, toTest.getFace());
        toTest.setFace(Face.UP);
        assertEquals(Face.UP, toTest.getFace());
        FrenchCard toTestFace = deck.removeCard(deck.size()-1);
        assertEquals(toTestFace.getFace(), Face.DOWN);
    }

    @Test
    public void manageDeckItalianCards(){
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

        List<ItalianCard> listToAdd = new ArrayList<>();
        ItalianCard toAddList1 = new ItalianCard(ItalianRank.RE, ItalianSuit.DENARI);
        ItalianCard toAddList2 = new ItalianCard(ItalianRank.SEVEN, ItalianSuit.SPADE);
        ItalianCard toAddList3 = new ItalianCard(ItalianRank.ACE, ItalianSuit.COPPE);
        listToAdd.add(toAddList1);
        listToAdd.add(toAddList2);
        listToAdd.add(toAddList3);
        deck.addCards(listToAdd);
        assertEquals(deck.size(), 43);
        List<ItalianCard> listToRemove;
        listToRemove = listToAdd.stream().toList();
        List<ItalianCard> listRemoved;
        listRemoved = deck.removeCards(listToRemove);
        assertEquals(listToAdd, listRemoved);
        assertEquals(deck.size(), 40);
    }


}
