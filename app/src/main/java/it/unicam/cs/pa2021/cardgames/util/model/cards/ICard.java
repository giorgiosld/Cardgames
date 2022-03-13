package it.unicam.cs.pa2021.cardgames.util.model.cards;


import java.util.Optional;

/**
 * Interfaccia generica per una carta che permette la sua identificazione
 *
 * @param <T> valore generico rappresentante un valore
 * @param <P> valore generico rappresentante un seme
 */
public interface ICard<T,P> {

    /**
     * Metodo che ritorna il valore della carta inteso come grado della carta
     */
    Optional<T> getRank();

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
