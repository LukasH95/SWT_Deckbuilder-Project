package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;
import static java.lang.Integer.max;

public class CardEffectBlock extends CardEffect {
    public CardEffectBlock(Actor target, int value) {
        super(target, value);
    }

    public CardEffectBlock(int value) {
        super(value);
    }

    private final Actor a = getTarget();

    @Override
    public void applyEffect() {
//        int newHp = max(0, a.getCurrentHp() - getValue());
//        a.setCurrentHp(newHp);
        a.receiveBlock(getValue());
    }
}
