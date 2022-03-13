package it.unicam.cs.pa2021.cardgames.util.model.cards;

public enum ItalianISuit implements ISuit {
    SPADE("s"),
    COPPE("c"),
    DENARI("d"),
    BASTONI("b");


    private final String name;

    ItalianISuit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
