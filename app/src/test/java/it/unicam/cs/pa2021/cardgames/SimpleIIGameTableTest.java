package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIGame;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.view.BlackJackTable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleIIGameTableTest {

    @Test
    public void manageGameTable() {
        BlackJackIDeck deck = new BlackJackIDeck();
        BlackJackIGame bj = new BlackJackIGame();
        BlackJackTable tableBJ = new BlackJackTable(deck, bj);
        tableBJ.startGame();
        assertEquals(tableBJ.getDeck().size(), 52);
        BlackJackIPlayer pl1 = new BlackJackIPlayer("Giorgio", 1);
        BlackJackIPlayer pl2 = new BlackJackIPlayer("Spina", 2);
        tableBJ.addPlayer(pl1);
        tableBJ.addPlayer(pl2);
        assertEquals(tableBJ.getNumberPlayer(),2);
        BlackJackIPlayer pl3 = new BlackJackIPlayer("Greenducci", 3);
        tableBJ.addPlayer(pl3);
        assertEquals(tableBJ.getNumberPlayer(),3);
        tableBJ.removePayer(pl3);
        assertEquals(tableBJ.getNumberPlayer(),2);
    }
}
