package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.util.model.cards.*;
import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleIDeckTest {

    @Test
    public void manageDeckFrenchCards(){
        SimpleIDeck<FrenchICard> deck = new SimpleIDeck<>();
        for (FrenchISuit s : FrenchISuit.values()){
            for (FrenchIRank r: FrenchIRank.values()){
                deck.addCard(new FrenchICard(r, s), deck.size());
            }
        }
        assertEquals(deck.size(), 52);
        //deck.shuffle();
        assertEquals(deck.size(), 52);
        FrenchICard toAdd = new FrenchICard(FrenchIRank.TWO, FrenchISuit.DIAMONDS);
        deck.addCard(toAdd, deck.size() );
        assertEquals(deck.size(), 53);
        FrenchICard toDelete = deck.removeCard(deck.size()-1);
        assertEquals(toDelete, toAdd);
        assertEquals(deck.size(), 52);
        List<FrenchICard> listToAdd = new ArrayList<>();
        FrenchICard toAddList1 = new FrenchICard(FrenchIRank.TEN, FrenchISuit.CLUBS);
        FrenchICard toAddList2 = new FrenchICard(FrenchIRank.SEVEN, FrenchISuit.HEARTS);
        FrenchICard toAddList3 = new FrenchICard(FrenchIRank.NINE, FrenchISuit.SPADES);
        listToAdd.add(toAddList1);
        listToAdd.add(toAddList2);
        listToAdd.add(toAddList3);
        deck.addCards(listToAdd);
        assertEquals(deck.size(), 55);
        List<FrenchICard> listToRemove;
        listToRemove = listToAdd.stream().toList();
        List<FrenchICard> listRemoved;
        listRemoved = deck.removeCards(listToRemove);
        assertEquals(listToAdd, listRemoved);
        assertEquals(deck.size(), 52);
        FrenchICard toTest = new FrenchICard(FrenchIRank.FOUR, FrenchISuit.DIAMONDS);
        assertEquals(Face.DOWN, toTest.getFace());
        toTest.setFace(Face.UP);
        assertEquals(FrenchIRank.FOUR.getBjValue(), toTest.getRank().get().getBjValue());
        assertEquals(FrenchISuit.DIAMONDS, toTest.getSuit());
        toTest.setFace(Face.UP);
        assertEquals(Face.UP, toTest.getFace());
        FrenchICard toTestFace = deck.removeCard(deck.size()-1);
        assertEquals(toTestFace.getFace(), Face.DOWN);
    }

    @Test
    public void manageDeckItalianCards(){
        SimpleIDeck<ItalianICard> deck = new SimpleIDeck<>();
        for (ItalianISuit s : ItalianISuit.values()){
            for (ItalianIRank r: ItalianIRank.values()){
                deck.addCard(new ItalianICard(r, s), deck.size());
            }
        }
        assertEquals(deck.size(), 40);
        //deck.shuffle();
        assertEquals(deck.size(), 40);
        ItalianICard toAdd = new ItalianICard(ItalianIRank.ACE, ItalianISuit.DENARI);
        deck.addCard(toAdd, deck.size());
        assertEquals(deck.size(), 41);
        ItalianICard toDelete = deck.removeCard(deck.size()-1);
        assertEquals(toDelete, toAdd);
        assertEquals(deck.size(), 40);

        List<ItalianICard> listToAdd = new ArrayList<>();
        ItalianICard toAddList1 = new ItalianICard(ItalianIRank.RE, ItalianISuit.DENARI);
        ItalianICard toAddList2 = new ItalianICard(ItalianIRank.SEVEN, ItalianISuit.SPADE);
        ItalianICard toAddList3 = new ItalianICard(ItalianIRank.ACE, ItalianISuit.COPPE);
        listToAdd.add(toAddList1);
        listToAdd.add(toAddList2);
        listToAdd.add(toAddList3);
        deck.addCards(listToAdd);
        assertEquals(deck.size(), 43);
        List<ItalianICard> listToRemove;
        listToRemove = listToAdd.stream().toList();
        List<ItalianICard> listRemoved;
        listRemoved = deck.removeCards(listToRemove);
        assertEquals(listToAdd, listRemoved);
        assertEquals(deck.size(), 40);
    }


}
