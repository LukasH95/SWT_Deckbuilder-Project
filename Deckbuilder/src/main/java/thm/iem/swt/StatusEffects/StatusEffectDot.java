package thm.iem.swt.StatusEffects;

import thm.iem.swt.Actor;

import static java.lang.Integer.max;

public class StatusEffectDot extends StatusEffect {

    private final int dmgValue;
    private int remainingDuration;

    public StatusEffectDot(Actor target, int durationInRounds, int dmgValue, boolean isDebuff) {
        super(target, durationInRounds, isDebuff);
        this.dmgValue = dmgValue;
        this.remainingDuration = durationInRounds;
    }

    private final Actor a = getTarget();

    @Override
    public void applyEffect() {
        if (this.isDebuff && remainingDuration > 0) {
            int newHp = max(0, a.getCurrentHp() - dmgValue);
            a.setCurrentHp(newHp);
            remainingDuration--;
        }
    }
}