package it.unicam.cs.pa2021.cardgames;

public class SimpleCard implements Card {

    public Face face;
    private final Rank rank;
    private final Suit suit;

    public SimpleCard(Rank r, Suit s){
        this.rank = r;
        this.suit = s;
        face = Face.DOWN;
    }

    @Override
    public Rank getRank() {
        return this.rank;
    }

    @Override
    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public void setFace(Face f) {
        this.face = f;
    }

    @Override
    public Face getFace() {
        return this.face;
    }

}
