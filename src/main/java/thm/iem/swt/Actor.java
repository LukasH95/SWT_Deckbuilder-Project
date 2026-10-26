package thm.iem.swt;

public class Actor {
    private String name;
    private short ID;

    public Actor() { }
    public Actor(String name, short ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() { return name; }
    public short getID() { return ID; }

    public int currentHP;
    public int maxHP;
}
