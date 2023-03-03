/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package deliverable_1;

/**
 *
 * @ author Kanwarraj Singh Batth
 */
public class handgenerator {
     private int handSize = 60;
	public cards[] cards = new cards[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                 int countCards = 0;
		for(cards.Color s: cards.Color.values())
                {
                    for(cards.Rank v: cards.Rank.values())
                    {
                        cards[countCards] = (new cards(s,v));
                        countCards++;
                    }
                }//end
        }//end method

}
