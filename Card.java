package cardgame;

/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */

/*
    Explaination why the given java code can be used and extend to the UNO game:-

    Inheritance is the major responsible that is responsible for the reusability and extension of the code. It means that a code or variables created in a classs can be further used in other classes.
*/

/*
    Eplain the feauture responsible:-

    The Card class may represent a single card independently because of its modular structure.
    The class's uncomplicated attributes and methods are clearly stated and may be changed or expanded to suit the requirements of another programme. Its adaptability makes it simple to reuse or expand the Card class in other applications that call for a typical deck of cards.
    By creating numerous Card objects and including them in a deck, the class, for instance, may be utilised in other games or software.
    MOreover, cohesion plays an important role in this feature.
*/
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
