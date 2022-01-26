package it.unicam.cs.pa2021.cardgames.cards;

public class FrenchCard extends SimpleCard<FrenchRank, FrenchSuit> implements Card<FrenchRank, FrenchSuit> {

    private final FrenchRank frenchRank;
    private final FrenchSuit frenchSuit;

    public FrenchCard(FrenchRank r, FrenchSuit s){
        super();
        this.frenchRank = r;
        this.frenchSuit = s;
    }

    @Override
    public FrenchRank getRank() {
        return this.frenchRank;
    }

    @Override
    public FrenchSuit getSuit() {
        return this.frenchSuit;
    }
}
