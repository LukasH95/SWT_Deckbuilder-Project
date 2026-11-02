package thm.iem.swt;

public class Actor {
    private String name;
    private short ID;
    private int maxHP;

    public Actor() { }
    public Actor(String name, short ID, int maxHP) {
        this.name = name;
        this.ID = ID;
        this.maxHP = maxHP;
    }

    public String getName() { return name; }
    public short getID() { return ID; }
    public int getMaxHP() { return maxHP; }
//testpush
    public int currentHP;
}
