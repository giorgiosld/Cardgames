package it.unicam.cs.pa2021.cardgames.cards;


public abstract class SimpleCard<T, P> implements Card<T, P> {

    public Face face;

    public SimpleCard(){
        this.face = Face.DOWN;
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
