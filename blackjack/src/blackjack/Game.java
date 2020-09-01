package blackjack;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Game {
	private static boolean initialShuffle = true;
	private static Deck deck = new Deck(initialShuffle);
	
	private Queue<Card> pile = new LinkedList<>(Arrays.asList(deck.getCards()));
	
	public Game() {
		Player player1 = new Player();
		
		player1.giveCard(pile.remove());
		player1.giveCard(pile.remove());	
		player1.printHand();
		pile.add(player1.takeCard(0));
		
		player1.printHand();
	}
	
}
