package it.unicam.cs.pa2021.cardgames.roles;

/**
 * Interfaccia rappresentante un generico giocatore di un gioco di carte
 */
public interface Player<T> {

    /**
     * Metodo che torna il nome del player
     *
     * @return nome del player
     */
    String getNome();

    /**
     * Meotodo che ritorna l'id di un player
     *
     * @return l'id del player
     */
    int getId();
}
