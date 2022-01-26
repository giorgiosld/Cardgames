package it.unicam.cs.pa2021.cardgames.cards;

public enum FrenchSuit implements Suit{

    HEARTS("h"),
    DIAMONDS("d"),
    CLUBS("c"),
    SPADES("s");


    private final String name;

    FrenchSuit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
