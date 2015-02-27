/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Davy
 */
public class HelpControl {
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the first player to match four pieces "
                + "\n\tvertically, horizontally or diagonally. Each player takes "
                + "\n\tturns placing their marker in one of the locations on the "
                + "\n\tboard. The first player to connect four is the winner."
                ); 
        displayHelpBorder();
    }

    public void displayPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tEach player takes turn by placing their piece "
                + "\n\tin an unused location on the board."
                ); 
        displayHelpBorder();
    }
    
    public void displayBoardHelp() {
        System.out.println();
        displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Connect Four consists of a grid of "
                + "\n\tlocations. Each player places their markers in the different locations "
                + "\n\tof the board in an attempt to win the game while blocking the other player."
                + "\n\tThe default board is 6 rows by 6 columns.");
        displayHelpBorder();
    }
    
    public void displayColumnHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThere are 6 available columns. When a player selects "
                + "\tthe column they want their marker to be in, "
                + "\tThe game piece will drop to the lowest available slot."
                );
        displayHelpBorder();
    }    
        
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA marker is an object that occupies a location in the board "
                + "\n\tThere are two different types of markers, one for each player."
                ); 
        displayHelpBorder();
    }
            
    public void displayHelpBorder() {       
        System.out.println(
        "\t********************************************************************");
    }

    public void displayError() {       
        System.out.println();
        displayHelpBorder();                     
        System.out.println("\tThis is an invalid selection. Please choose again.");
        displayHelpBorder();             
    }
}
