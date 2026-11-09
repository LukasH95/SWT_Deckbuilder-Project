package thm.iem.swt.Cards;

public class CardPool {

    public Card createAttack_1() {
        public Card Attack_1 = new Card(1, "Angriff", CardType.ATTACK, 1);
        Attack_1.addEffect (weakdmg);
        return Attack_1;
    }

    public Card createAttack_1() {
        public Card Block_1 = new Card(1, "Block", CardType.DEFEND, 1);
        Block_1.addEffect (weakblock);
        return Block_1;
    }

}
