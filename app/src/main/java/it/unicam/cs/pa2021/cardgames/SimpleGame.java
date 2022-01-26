package it.unicam.cs.pa2021.cardgames;

import java.util.ArrayList;
import java.util.List;

public class SimpleGame implements Game{

    List<Rules> rules;

    public SimpleGame(){
        this.rules = new ArrayList<>();
    }


    @Override
    public List<Rules> seeRules() {
        return rules;
    }

    @Override
    public void start() {

    }

    @Override
    public boolean addRule(Rules rules) {
        rules.addRules(rules);
        return true;
    }

    @Override
    public boolean removeRule(Rules rule) {
        rules.remove(rule);
        return true;
    }


}
