package it.unicam.cs.pa2021.cardgames.cards;


/**
 * Interfaccia rappresentando una generica carta
 */
public interface Card<T,P> {

    /**
     * Metodo che ritorna il valore della carta inteso come grado della carta
     */
    T getRank();

    /**
     * Metodo che ritorna il seme della carta
     */
    P getSuit();

    /**
     * Metodo che setta la faccia della carta
     */
    void setFace(Face f);

    /**
     * Metodo che ritorna la faccia della carta
     * @return faccia della carta intesa come coperta e scoperta
     */
    Face getFace();

}
