package it.unicam.cs.pa2021.cardgames.blackjack.model;

import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.model.deck.SimpleIDeck;


import java.util.Collections;
import java.util.Random;

public class BlackJackIDeck extends SimpleIDeck<FrenchICard> {

    public BlackJackIDeck shuffle(BlackJackIDeck bjDeck){
        Collections.shuffle(bjDeck.getCards(), new Random());
        return bjDeck;
    }


}
