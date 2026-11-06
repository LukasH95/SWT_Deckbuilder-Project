package thm.iem.swt.Foes;

import thm.iem.swt.Actor;
import thm.iem.swt.Cards.Effects.CardEffect;

import java.util.ArrayList;

public class FoeActor extends Actor {

    private ArrayList<CardEffect> availableAttacks = new ArrayList<CardEffect>();

    public FoeActor(String name, int id, int maxHP) {
        super(name, id, maxHP);
    }

    public void addAttackEffect(CardEffect effect) {
        availableAttacks.add(effect);
    }
}