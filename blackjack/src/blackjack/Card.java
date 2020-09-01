package blackjack;

public class Card {	  
	enum Suit {
	    Hearts,
	    Diamonds,
	    Clovers,
	    Spades
	}
	enum Face {
	    two,
	    three,
	    four,
	    five,
	    six,
	    seven,
	    eight,
	    nine,
	    ten,
	    jack,
	    queen,
	    king,
	    ace
	}
	
	private Suit suit;
	private Face face;
	private int value;
	
    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
        
        switch (face) {
        	case two:
        		value = 2;
        		break;
        	case three:
        		value = 3;
        		break;
        	case four:
        		value = 4;
        		break;
        	case five:
        		value = 5;
        		break;
        	case six:
        		value = 6;
        		break;
        	case seven:
        		value = 7;
        		break;
        	case eight:
        		value = 8;
        		break;
        	case nine:
        		value = 9;
        		break;
        	case ten:
        		value = 10;
        		break;
        	case jack:
        		value = 10;
        		break;
        	case queen:
        		value = 10;
        		break;
        	case king:
        		value = 10;
        		break;
        	case ace:
        		value = 11;
        		break;
        	default:
        		value = 0;
        }
    }

    public Suit getSuit() {
        return suit;
    }
    public Face getFace() {
        return face;
    }
    public int getValue() {
    	return value;
    }
    
    public void printCard() {
    	System.out.print(suit.toString());
    	System.out.print(" ");
    	System.out.print(face.toString());
    	System.out.println();
    }
}