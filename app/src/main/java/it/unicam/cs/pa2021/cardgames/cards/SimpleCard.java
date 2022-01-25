package it.unicam.cs.pa2021.cardgames.cards;

import it.unicam.cs.pa2021.cardgames.cards.Card;
import it.unicam.cs.pa2021.cardgames.cards.Face;

public abstract class SimpleCard implements Card {

    public Face face;


    @Override
    public void setFace(Face f) {
        this.face = f;
    }

    @Override
    public Face getFace() {
        return this.face;
    }

}
