package thm.iem.swt.Cards.Effects;

import thm.iem.swt.Actor;

public abstract class CardEffect {

    private Actor target;
    private int value;

    public CardEffect(Actor target, int value) {
        this.target = target;
        this.value = value;
    }

    public CardEffect(int value) {
        this.value = value;
    }

    public Actor getTarget() { return target; }
    public void setTarget(Actor target) { this.target = target; }
    public int getValue() { return value; }

    public abstract void applyEffect(); // to be overridden in child classes, to create different effects
}