package it.unicam.cs.pa2021.cardgames.util.model.cards;

/**
 * Classe astratta rappresentante una carta base non istanziabile
 *
 * @param <T> il rank usato dalla carta
 * @param <P> il seme usato dalla carta
 */
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
