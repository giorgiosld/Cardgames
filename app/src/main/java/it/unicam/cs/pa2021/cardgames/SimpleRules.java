package it.unicam.cs.pa2021.cardgames;

import java.util.List;
import java.util.Map;

public abstract class SimpleRules implements Rules{

    public Map<Integer, String> rules;

    @Override
    public boolean addRules(Rules r) {
        //return rules.put(0, r);
        return true;
    }

    @Override
    public boolean removeRules(int index) {
        return false;
    }
}
