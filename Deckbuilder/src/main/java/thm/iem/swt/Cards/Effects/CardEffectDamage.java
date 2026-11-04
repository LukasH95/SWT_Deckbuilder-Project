package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;
import static java.lang.Integer.max;

public class CardEffectDamage extends CardEffect {
    public CardEffectDamage(Actor target, int value) {
        super(target, value);
    }

    private final Actor a = getTarget();

    @Override
    public void applyEffect() {
//        int newHp = max(0, a.getCurrentHp() - getValue());
//        a.setCurrentHp(newHp);
        a.receiveDamage(getValue());
    }
}
