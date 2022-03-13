package it.unicam.cs.pa2021.cardgames.util.model.cards;

/**
 * Enum rappresentante i rank di carte italiane
 */
public enum ItalianIRank implements IRank {
    ACE(0, "1"),
    TWO(1, "2"),
    THREE(2, "3"),
    FOUR(3, "4"),
    FIVE(4, "5"),
    SIX(5, "6"),
    SEVEN(6, "7"),
    FANTE(7, "8"),
    CAVALLO(8, "9"),
    RE(9, "10");


    private final int index;
    private final String name;


    ItalianIRank(int index, String name) {
        this.index = index;
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    int getIndex() {
        return this.index;
    }
}
