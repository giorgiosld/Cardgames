package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.Rules;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleGame implements Game {

    public List<Rules> rules;

    public SimpleGame(){
        this.rules = new ArrayList<>();
    }


    @Override
    public List<Rules> seeRules() {
        return rules;
    }


    @Override
    public boolean addRule(Rules rules) {
        return rules.addRules(rules);
    }

    @Override
    public boolean removeRule(Rules rule) {
        rules.remove(rule);
        return true;
    }


}
