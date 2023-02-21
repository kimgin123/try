package cardgamew23tueam;

public class Card {

	public enum Hi{
            OH
        };
        public enum Suit {
        HEARTS,DIAMONDS,SPADES,CLUBS
        };
        
        public enum Value{
            ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
            EIGHT,NINE,TEN,JACK,QUEEN,KING
        };
        
        private Value value;
	private Suit suit;
        

        public Card(Value value, Suit suit) {
           this.value = value;
           this.suit = suit;
    }

	public Value getValue() {
		return this.value;
	}

	
	public void setValue(Value value) {
		this.value = value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

}