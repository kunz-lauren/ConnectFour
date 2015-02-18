/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;


/**
 *
 * @author laurenkorpacz
 */
public class DisclaimerMenuControl {
        
    public void DisclaimerMenuControl() {
        System.out.println();
        displayWelcomeBorder();     
        System.out.println( 
                 "\t'Unauthorized use and/or duplication of this material "
                + "\n\t without express and written permission from this game's "
                + "\n\n\t- author and/or owner is strictly prohibited."
                ); 
        displayWelcomeBorder();
    }

public void displayWelcomeBorder() {       
        System.out.println(
        "\t#####################################################################################");
    }

    public void displayError() {       
        System.out.println();
        displayWelcomeBorder();                     
        System.out.println("\tThat is an invalid selection. Please choose again.");
        displayWelcomeBorder();             
    }
    
}