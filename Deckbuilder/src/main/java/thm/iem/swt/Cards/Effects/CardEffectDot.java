package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;
import thm.iem.swt.StatusEffects.StatusEffect;

public class CardEffectDot extends CardEffect {

    private final StatusEffect dotEffect;

    public CardEffectDot(Actor target, int value, StatusEffect dotEffect) {
        super(target, value);
        this.dotEffect = dotEffect;
    }

    private final Actor a = getTarget();

    @Override
    public void applyEffect() {
        if (dotEffect.isDebuff) {
            a.receiveDebuff(dotEffect);
        }
    }
}
