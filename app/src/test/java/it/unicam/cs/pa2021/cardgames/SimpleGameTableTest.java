package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.FrenchCard;
import it.unicam.cs.pa2021.cardgames.games.BlackJackGame;
import org.junit.Test;

public class SimpleGameTableTest {

    @Test
    public void manageGameTable() {
        SimpleDeck<FrenchCard> deck = new SimpleDeck<>();
        SimpleGameTable<FrenchCard, BlackJackGame<FrenchCard>> tableBJ = new SimpleGameTable<>(deck);
    }
}
