package blackjack;

import java.util.List;
import java.util.LinkedList;

public class Player {
	private List<Card> hand;
	
	public Player() {
		hand = new LinkedList<Card>();
	}
	
	public void giveCard(Card newCard) {
		hand.add(newCard);
	}
	
	public Card takeCard(int index) {
		return hand.remove(index);
	}
	
	public void printHand() {
		if (!hand.isEmpty()) {
			for (Card card: hand) {
				card.printCard();
			}
		}
	}
}
