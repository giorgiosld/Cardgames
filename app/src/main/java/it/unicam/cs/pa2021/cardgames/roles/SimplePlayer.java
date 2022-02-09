package it.unicam.cs.pa2021.cardgames.roles;

import it.unicam.cs.pa2021.cardgames.games.SimpleGame;

public class SimplePlayer<T extends SimpleGame> implements Player<T> {

    public String nome;
    public int id;

    public SimplePlayer(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }
}
