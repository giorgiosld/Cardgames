package it.unicam.cs.pa2021.cardgames.util.model.cards;

/**
 * Enum rappresentante i rank francesi
 */
public enum FrenchIRank implements IRank {

    TWO(0, "2",2),
    THREE(1, "3",3),
    FOUR(2, "4",4),
    FIVE(3, "5",5),
    SIX(4, "6",6),
    SEVEN(5, "7",7),
    EIGHT(6, "8",8),
    NINE(7, "9",9),
    TEN(8, "10",10),
    JACK(9, "J",10),
    QUEEN(10, "Q",10),
    KING(11, "K",10),
    ACE(12, "A",11);


    private final int index;
    private final String name;
    private final int bjValue;


    FrenchIRank(int index, String name, int bjValue) {
        this.index = index;
        this.name = name;
        this.bjValue = bjValue;
    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    public int getBjValue() {
        return bjValue;
    }
}
