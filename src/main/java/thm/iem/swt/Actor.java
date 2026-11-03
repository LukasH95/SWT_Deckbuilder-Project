package thm.iem.swt;

public class Actor {
    private String name;
    private int id;
    private int maxHp;

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
}
