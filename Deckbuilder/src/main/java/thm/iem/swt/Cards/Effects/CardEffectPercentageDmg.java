package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;
import static java.lang.Integer.max;

public class CardEffectPercentageDmg extends CardEffect {
    public CardEffectPercentageDmg(Actor target, int value) {
        super(target, value);
    }

    Actor a = getTarget();

    @Override
    public void applyEffect() {
        int percentDmg = (int) (a.getMaxHp() * ((float)getValue() / 100));
//        int newHp = max(0, a.getCurrentHp() - percentDmg);
//        a.setCurrentHp(newHp);
        a. receiveDamage(percentDmg);
    }
}
