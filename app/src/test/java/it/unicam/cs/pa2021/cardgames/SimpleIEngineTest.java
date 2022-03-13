package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.blackjack.controller.Engine;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackDealer;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIDeck;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIGame;
import it.unicam.cs.pa2021.cardgames.blackjack.model.BlackJackIPlayer;
import it.unicam.cs.pa2021.cardgames.blackjack.view.BlackJackTable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleIEngineTest {

    @Test
    public void manageEngine() {
        BlackJackIPlayer player1 = new BlackJackIPlayer("giorgio", 1);
        BlackJackIDeck deckBj = new BlackJackIDeck();
        BlackJackIGame bjGame = new BlackJackIGame();
        BlackJackTable bjTable = new BlackJackTable(deckBj, bjGame);
        bjTable.startGame();
        bjTable.addPlayer(player1);
        BlackJackDealer dealer = new BlackJackDealer("spina", 3);
        bjTable.addDealer(dealer);
        Engine gioco = new Engine(bjTable);
        gioco.clearHand();
        assertEquals(bjTable.getDeck(), gioco.getBj().getDeck());
        gioco.shuffleDeck();
        assertEquals(bjTable.getDeck(), gioco.getBj().getDeck());
        gioco.dealCards();
        assertEquals(gioco.getBj().getPlayers().get(0).compareHand().numCardsHand(), 2);
    }
}
