/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package deliverable_1;

/**
 *
 * @author Kanwarraj Singh Batth
 */
public class Deliverable_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        handgenerator ch = new handgenerator();
                ch.generateHand();
                for(cards c: ch.cards)
                {
                    System.out.println(c.getRank() + " of " + c.getColor());
                }
         
    }

}
