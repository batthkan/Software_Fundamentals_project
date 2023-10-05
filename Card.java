package cardgame;


public class Card {
    
        public enum Color{RED, YELLOW, GREEN, BLUE};
        public enum Rank{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, WILDCARD, DRAW_FOUR};
        private final Color color;
        private final Rank rank;
        
        public Card(Color s, Rank gVal)
        {
           color =s;
           rank= gVal;
        }
	public Rank getRank() {
		return this.rank;
	}

	
	public Color getColor() {
		return this.color;
        }
}
