package it.unicam.cs.pa2021.cardgames.util.model.cards;


public abstract class SimpleICard<T, P> implements ICard<T, P> {

    public Face face;

    public SimpleICard(){
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
