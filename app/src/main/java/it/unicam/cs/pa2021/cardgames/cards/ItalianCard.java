package it.unicam.cs.pa2021.cardgames.cards;

public class ItalianCard extends SimpleCard implements Card {

    private final ItalianRank italianRank;
    private final ItalianSuit italianSuit;

    public ItalianCard(ItalianRank r, ItalianSuit s){
        this.italianRank = r;
        this.italianSuit = s;
    }

    @Override
    public ItalianRank getRank() {
        return this.italianRank;
    }

    @Override
    public ItalianRank getSuit() {
        return null;
    }
}
