package thm.iem.swt.Cards;

import thm.iem.swt.Actor;

public class CardEffectDamage extends CardEffect{
    public CardEffectDamage(Actor target, int value) {
        super(target, value);
    }

    @Override
    public void applyEffect() {
        int newHp = getTarget().getCurrentHp() - getValue();
    }
}
