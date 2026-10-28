package thm.iem.swt;

enum CardType {
    ATTACK, DEFEND, SKILL, POWER
}

public class Card {

    private int id;
    private String name;
    private CardType type;
    private int energyCost;
    private String decription;
    private CardEffect effect;
}
