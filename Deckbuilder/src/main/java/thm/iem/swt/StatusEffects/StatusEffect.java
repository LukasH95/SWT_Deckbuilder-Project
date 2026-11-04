package thm.iem.swt.StatusEffects;

import thm.iem.swt.Actor;

public abstract class StatusEffect {
    public final boolean isDebuff;      // possibly unnecessary
    private final Actor target;
    private final int durationInRounds; // duration -1 means permanent buff or debuff, that stays until the end of the game or until its cleansed or canceled

    public StatusEffect(Actor target, int durationInRounds, boolean isDebuff) {
        this.target = target;
        this.durationInRounds = durationInRounds;
        this.isDebuff = isDebuff;
    }

    public Actor getTarget() { return target; }
    public int getDurationInRounds() { return durationInRounds; }
    public void applyEffect() {}
}
