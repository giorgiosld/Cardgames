package it.unicam.cs.pa2021.cardgames.cards;

public class ItalianCard extends SimpleCard<ItalianRank, ItalianSuit> implements Card<ItalianRank, ItalianSuit> {

    private final ItalianRank italianRank;
    private final ItalianSuit italianSuit;

    public ItalianCard(ItalianRank r, ItalianSuit s){
        super();
        this.italianRank = r;
        this.italianSuit = s;
    }

    @Override
    public ItalianRank getRank() {
        return this.italianRank;
    }

    @Override
    public ItalianSuit getSuit() {
        return this.italianSuit;
    }
}
