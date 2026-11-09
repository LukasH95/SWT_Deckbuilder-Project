package thm.iem.swt.Foes;

import thm.iem.swt.Actor;
import thm.iem.swt.Cards.Effects.CardEffect;
import java.util.ArrayList;
import java.util.Random;

public class FoeActor extends Actor {

    private final ArrayList<CardEffect> availableAttacks = new ArrayList<CardEffect>();

    public FoeActor(String name, int id, int maxHP) {
        super(name, id, maxHP);
    }

    public void addAttackEffect(CardEffect effect) {
        availableAttacks.add(effect);
    }

    public void useAllAttacks(Actor target) {
        for (CardEffect effect : availableAttacks) {
            effect.setTarget(target);
            effect.applyEffect();
        }
    }

    public void useRandomAttack(Actor target) {
        Random rand = new Random();
        int i = rand.nextInt(0, availableAttacks.size() - 1);
        availableAttacks.get(i).setTarget(target);
        availableAttacks.get(i).applyEffect();
    }

    public CardEffect determineBestAttackAgainst(Actor target) {
        CardEffect best = null;
        for (CardEffect effect : availableAttacks) {

        }
        return best;
    }
}