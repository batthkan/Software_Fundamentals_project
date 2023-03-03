package cardgame;

/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @suthor dancye, 2019.
 */

public class CardHandGenerator {

        private int handSize = 60;
	public Card[] cards = new Card[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Color s: Card.Color.values())
                {
                    for(Card.Rank v: Card.Rank.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}