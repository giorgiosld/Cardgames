package it.unicam.cs.pa2021.cardgames.cards;

public enum ItalianSuit {
    SPADE("s"),
    COPPE("c"),
    DENARI("d"),
    BASTONI("b");


    private final String name;

    private ItalianSuit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
