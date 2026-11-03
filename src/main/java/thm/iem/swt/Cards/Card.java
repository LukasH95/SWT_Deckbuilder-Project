package thm.iem.swt.Cards;

enum CardType {
    ATTACK, DEFEND, SKILL, POWER
}

public class Card {

    private final int id;
    private final String name;
    private final CardType type;
    private int energyCost; // not final as future effects may or may not reduce energy costs
    private String description;
    private CardEffect[] effects;
    private int effectcount = 0;

    /// @param id
    /// @param name
    /// @param type
    /// @param energyCost
    public Card(int id, String name, CardType type, int energyCost) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.energyCost = energyCost;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public CardType getType() { return type; }
    public int getEnergyCost() { return energyCost; }
    public int getNumberOfEffects() { return effectcount; }

    public void addEffect(CardEffect effect) {
        this.effects[effectcount] = effect;
        this.effectcount++;
    }

    public CardEffect getEffectAt(int index) {
        if (index < 0 || index >= this.effectcount) return null;
        return this.effects[index];
    }
}
