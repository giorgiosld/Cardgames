package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.Face;
import it.unicam.cs.pa2021.cardgames.cards.FrenchRank;
import it.unicam.cs.pa2021.cardgames.cards.FrenchSuit;

public class SimpleCard implements Card {

    public Face face;
    private final FrenchRank frenchRank;
    private final FrenchSuit frenchSuit;

    public SimpleCard(FrenchRank r, FrenchSuit s){
        this.frenchRank = r;
        this.frenchSuit = s;
        face = Face.DOWN;
    }

    @Override
    public FrenchRank getRank() {
        return this.frenchRank;
    }

    @Override
    public FrenchSuit getSuit() {
        return this.frenchSuit;
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
