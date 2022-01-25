package it.unicam.cs.pa2021.cardgames.cards;

public class FrenchCard extends SimpleCard implements Card {

    private final FrenchRank frenchRank;
    private final FrenchSuit frenchSuit;

    public FrenchCard(FrenchRank r, FrenchSuit s){
        this.frenchRank = r;
        this.frenchSuit = s;
    }

    @Override
    public FrenchRank getRank() {
        return null;
    }

    @Override
    public FrenchSuit getSuit() {
        return null;
    }
}
