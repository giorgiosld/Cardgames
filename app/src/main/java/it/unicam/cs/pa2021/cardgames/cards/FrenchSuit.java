package it.unicam.cs.pa2021.cardgames.cards;

public enum FrenchSuit {
    /**
     * Field HEARTS.
     */
    HEARTS("h"), /**
     * Field DIAMONDS.
     */
    DIAMONDS("d"), /**
     * Field CLUBS.
     */
    CLUBS("c"), /**
     * Field SPADES.
     */
    SPADES("s");

    /**
     * Field name.
     */
    private final String name;

    /**
     * Constructor for Suit.
     *
     */
    private FrenchSuit(String name) {
        this.name = name;
    }

    /**
     * Method getName.
     *
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }
}
