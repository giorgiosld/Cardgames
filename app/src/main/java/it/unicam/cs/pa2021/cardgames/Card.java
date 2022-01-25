package it.unicam.cs.pa2021.cardgames;

import it.unicam.cs.pa2021.cardgames.cards.Face;
import it.unicam.cs.pa2021.cardgames.cards.FrenchRank;
import it.unicam.cs.pa2021.cardgames.cards.FrenchSuit;

/**
 * Interfaccia rappresentando una generica carta
 */
public interface Card {

    /**
     * Metodo che ritorna il valore della carta inteso come grado della carta
     */
    FrenchRank getRank();

    /**
     * Metodo che ritorna il seme della carta
     */
    FrenchSuit getSuit();

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
