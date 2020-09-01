package blackjack;

import blackjack.Card.Face;
import blackjack.Card.Suit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private Card[] cards;
    
    private static int noSuits = Suit.values().length;	//	normally 4
    private static int noFaces = Face.values().length;	//	normally 13
    private static int noCards = noSuits * noFaces;		//	normally 52 (= 4 * 13)
    
    public Deck(boolean shuffle) {
        this.cards = createCardDeck();
        if (shuffle) { shuffleDeck(); }
    }
    
    public void shuffleDeck() {
    	List<Card> cardsList = Arrays.asList(cards);
    	Collections.shuffle(cardsList);
    	cardsList.toArray(cards);
    }

    private Card[] createCardDeck() {
        Card[] cards = new Card[noCards];
        int counter = 0;
        
        while (counter < noCards) {
	        for (int i = 0; i < noSuits; i++) {
	            for (int j = 0; j < noFaces; j++) {
	                cards[counter] = new Card(Suit.values()[i], Face.values()[j]);
	                counter++;
	            }
	        }
        }
        
        return cards;
    }
    
    public void printDeck() {
    	System.out.println("- - - - - - - - - -");
    	for (Card card: cards) {
    		card.printCard();
    	}
    	System.out.println("- - - - - - - - - -");
    }
    
    public Card[] getCards() {
    	return cards;
    }
}