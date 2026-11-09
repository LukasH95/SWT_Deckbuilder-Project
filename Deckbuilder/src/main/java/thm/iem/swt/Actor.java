package thm.iem.swt;

import thm.iem.swt.StatusEffects.StatusEffect;
import java.util.ArrayList;
import static java.lang.Integer.max;

public class Actor {
    private String name;
    private int id;
    private int maxHp;
    private ArrayList<StatusEffect> buffs = new ArrayList<StatusEffect>();
    private ArrayList<StatusEffect> debuffs = new ArrayList<StatusEffect>();
    private int block;

    public Actor() { }
    public Actor(String name, int id, int maxHp) {
        this.name = name;
        this.id = id;
        this.maxHp = maxHp;
    }

    private int currentHp = maxHp;

    public String getName() { return name; }
    public int getId() { return id; }
    public int getMaxHp() { return maxHp; }
    public int getCurrentHp() { return currentHp; }

    // doesnt take block into account and directly modifies currentHp within its limits
    public void setCurrentHp(int newHpValue) {
        if (newHpValue > this.maxHp) {
            this.currentHp = this.maxHp;
            return;
        } else if (newHpValue < 0) {
            this.currentHp = 0;
            return;
        } else {
            this.currentHp = newHpValue;
        }
    }

    // takes block into account when calculating new hp value
    public void receiveDamage(int incomingDmg) {
        int dmgAfterBlock = max(0, incomingDmg - block);
        setCurrentHp(currentHp - dmgAfterBlock);
    }

    public void receiveBlock(int block) {
        this.block = block;
    }

    public void receiveBuff(StatusEffect newBuff) {
        this.buffs.add(newBuff);
    }
    public void removeBuff(StatusEffect expiredBuff) {
        this.buffs.remove(expiredBuff);
    }

    public void receiveDebuff(StatusEffect newDebuff) {
        this.debuffs.add(newDebuff);
    }
    public void cleanseDebuff(StatusEffect cleansedDebuff) {
        this.debuffs.remove(cleansedDebuff);
    }
}
