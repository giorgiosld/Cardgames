package it.unicam.cs.pa2021.cardgames.games;

import it.unicam.cs.pa2021.cardgames.Rules;
import it.unicam.cs.pa2021.cardgames.cards.Rank;
import it.unicam.cs.pa2021.cardgames.cards.SimpleCard;
import it.unicam.cs.pa2021.cardgames.cards.Suit;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleGame<T extends SimpleCard<? extends Rank, ? extends Suit>> implements Game<T> {

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
        //return rules.addRules(rules);
        return  true;
    }

    @Override
    public boolean removeRule(Rules rule) {
        rules.remove(rule);
        return true;
    }


}
