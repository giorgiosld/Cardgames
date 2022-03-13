package it.unicam.cs.pa2021.cardgames.util.model.cards;

/**
 * Enum rappresentante il seme delle carte francesi
 */
public enum FrenchISuit implements ISuit {

    HEARTS("h"),
    DIAMONDS("d"),
    CLUBS("c"),
    SPADES("s");


    private final String name;

    FrenchISuit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
