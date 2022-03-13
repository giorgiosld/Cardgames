package it.unicam.cs.pa2021.cardgames.util.model.cards;

import java.util.Optional;

public class FrenchICard extends SimpleICard<FrenchIRank, FrenchISuit> implements ICard<FrenchIRank, FrenchISuit> {

    private final FrenchIRank frenchRank;
    private final FrenchISuit frenchSuit;

    public FrenchICard(FrenchIRank r, FrenchISuit s){
        super();
        this.frenchRank = r;
        this.frenchSuit = s;
    }

    @Override
    public Optional<FrenchIRank> getRank() {
        if (this.getFace() == Face.DOWN)
            return Optional.empty();
        return Optional.of(this.frenchRank);
    }

    @Override
    public FrenchISuit getSuit() {
        return this.frenchSuit;
    }
}
