package cardgamew23tueam;

import java.util.Random;

public class CardHandGenerator {

	public static Card[] generateHand(int numCard) {
            Card[] hand = new Card[numCard];
            Random random = new Random();
        
        for(int i =0; i < hand.length; i++){
            Card.Value value = Card.Value.values()[random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card card = new Card(value,suit);
            hand[i]=card;
        }//end of for 
		return hand;
                
}//end of method

}//end of class