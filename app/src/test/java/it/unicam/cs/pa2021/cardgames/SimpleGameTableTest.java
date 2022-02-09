package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.FrenchCard;
import it.unicam.cs.pa2021.cardgames.games.BlackJackGame;
import it.unicam.cs.pa2021.cardgames.roles.SimplePlayer;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleGameTableTest {

    @Test
    public void manageGameTable() {
        SimpleDeck<FrenchCard> deck = new SimpleDeck<>();
        BlackJackGame bj = new BlackJackGame();
        SimpleGameTable<FrenchCard, BlackJackGame> tableBJ = new SimpleGameTable<>(deck);
        tableBJ.addGame(bj);
        tableBJ.chooseGame(bj);
        assertEquals(tableBJ.deck.size(), 52);
        SimplePlayer<BlackJackGame> pl1 = new SimplePlayer<>("Giorgio", 1);
        SimplePlayer<BlackJackGame> pl2 = new SimplePlayer<>("Spina", 2);
        tableBJ.addPlayer(pl1);
        tableBJ.addPlayer(pl2);
        assertEquals(tableBJ.getNumberPlayer(),2);
        SimplePlayer<BlackJackGame> pl3 = new SimplePlayer<>("Greendux", 3);
        tableBJ.addPlayer(pl3);
        assertEquals(tableBJ.getNumberPlayer(),3);
        tableBJ.removePayer(pl3);
        assertEquals(tableBJ.getNumberPlayer(),2);
    }
}
