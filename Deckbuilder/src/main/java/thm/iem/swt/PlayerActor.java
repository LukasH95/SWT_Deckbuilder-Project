package thm.iem.swt;

import thm.iem.swt.Cards.Card;
import thm.iem.swt.StatusEffects.StatusEffect;

import java.util.ArrayList;
import java.util.Random;

public class PlayerActor extends Actor {

    public int currentEnergy;
    public int maxEnergy;

    private final ArrayList<Card> hand = new ArrayList<Card>();

    public PlayerActor() {
        super();
    }

    private void initPlayerHand(int handSize, ArrayList<Card> allCards) {
        int decksize = allCards.size(), i;

        Random rand = new Random();
        for (i = 0; i < handSize; i++) {
            this.hand.add(allCards.get(rand.nextInt(decksize - 1)));
        }
    }

    private boolean removeCardFromHand(int cardId) {
        int i;
        boolean cardSuccessfullyRemoved = false;

        for (i = 0; i < this.hand.size(); i++) {
            if (this.hand.get(i).getId() == cardId) {
                this.hand.remove(cardId);
                cardSuccessfullyRemoved = true;
            }
        }
        return cardSuccessfullyRemoved;
    }

    private void addCardToHand(Card card) {
        this.hand.add(card);
    }

    private void listHand() {
        int i;

        System.out.println("You currently hold the following cards: ");

        for (i = 0; i < this.hand.size(); i++) {
            System.out.println(this.hand.get(i).getName());
        }
    }
}
