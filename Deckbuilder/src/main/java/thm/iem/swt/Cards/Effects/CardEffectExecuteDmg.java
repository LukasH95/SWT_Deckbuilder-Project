package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;

public class CardEffectExecuteDmg extends CardEffect {
    public CardEffectExecuteDmg(Actor target, int value) {
        super(target, value);
    }

    private final Actor a = getTarget();

    @Override
    public void applyEffect() {
        if (a.getCurrentHp() < (getValue() / 100.0 * a.getMaxHp())) {
            a.setCurrentHp(0);      // UNBLOCKABLE!
        }
    }
}
