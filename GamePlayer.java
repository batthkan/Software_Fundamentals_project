package cardgame;


public class GamePlayer {

	public static void main(String[] args) {
		CardHandGenerator ch = new CardHandGenerator();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getRank() + " of " + c.getColor());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}

}
