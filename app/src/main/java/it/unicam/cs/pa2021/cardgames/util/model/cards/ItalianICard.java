package it.unicam.cs.pa2021.cardgames.util.model.cards;

import java.util.Optional;

public class ItalianICard extends SimpleICard<ItalianIRank, ItalianISuit> implements ICard<ItalianIRank, ItalianISuit> {

    private final ItalianIRank italianRank;
    private final ItalianISuit italianSuit;

    public ItalianICard(ItalianIRank r, ItalianISuit s){
        super();
        this.italianRank = r;
        this.italianSuit = s;
    }

    @Override
    public Optional<ItalianIRank> getRank() {
        if (this.getFace() == Face.DOWN)
            return Optional.empty();
        return Optional.of(this.italianRank);
    }

    @Override
    public ItalianISuit getSuit() {
        return this.italianSuit;
    }
}
