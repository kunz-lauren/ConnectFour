/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author Davy
 */
public class GameModeControl {
    
    public GameModeControl() {
        
    } 

    public void displayPopOut() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\t Pop Out starts the same as traditional gameplay, with an empty board and players alternating"
                + "\n\tturns placing their own colored discs into the board. During each turn, a player can either"
                + "\n\tadd another disc from the top or, if one has any discs of his or her own color on the bottom"
                + "\n\t row, remove (or \\\"pop out\\\") a disc of one's own color from the bottom. Popping a disc"
                + "\n\tout from the bottom drops every disc above it down one space, changing their relationship with"
                + "\n\tthe rest of the board and changing the possibilities for a connection. The first player to"
                + "\n\tconnect four of their discs horizontally, vertically, or diagonally wins the game."
                ); 
           
        displayHelpBorder();
    }

    
    public void displayPopTen() {
        System.out.println();
        displayHelpBorder();             
        System.out.println( 
                "\tBefore play begins, Pop 10 is set up differently from the traditional game. Taking turns, each player"
                + "\n\tplaces their opponent's color discs into the slots filling up only the bottom row, then moving on "
                + "\n\to the next row until it is filled and so forth until all rows have been filled."
                + "\n\tGameplay works by players taking turns removing a disc of one's own color through the bottom of the board."
                + "\n\tIf the disc that was removed was part of a four-disc connection at the time of its removal, the player sets"
                + "\n\t it aside out of play and immediately takes another turn. If it was not part of a \"connect four\", then it"
                + "\n\t must be placed back on the board through a slot at the top into any open space and the turn ends, switching"
                + "\n\t to the other player. The first player to set aside ten discs of his or her color wins the game."
                );
        displayHelpBorder();
                   

     
        
    }
    
    public void displayFiveInARow() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe 5-in-a-Row variation for Connect Four is a game played on a 6 high, 9 wide, grid. Hasbro adds two"
                + "\n\t additional board columns,already filled with player pieces in an alternating pattern, to the left"
                + "\n\t and right sides of their standard6 by 7 game board. The game plays similarly to the original Connect"
                + "\n\t Four, except players must now get five pieces in a row to win. Notice this is still a 42-ply game,"
                + "\n\t since the two new columns added to the game represent twelve game pieces already played, before the start of a game."
                );
        displayHelpBorder();
            
    }    
        
    public void displayPowerUp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tIn this variation of Connect Four, players begin a game with one or more specially marked,\"Power Checkers\" game pieces,"
                + "\n\t which each player may choose to play once per game. When playing a piece marked with an anvil icon, for example, the"
                + "\n\tplayer may immediately pop out all pieces below it, leaving the anvil piece at the bottom row of the game board. Other "
                + "\n\t marked game pieces include one with a wall icon, allowing a player to play a second consecutive non winning turn with an"
                + "\n\t unmarked piece, a \"×2\" icon, allowing for an unrestricted second turn with an unmarked piece, and a bomb icon, allowing"
                + "\n\t a player to immediately pop out an opponent's piece."
                ); 
        displayHelpBorder();
             
    }
            
    public void displayHelpBorder() {       
        System.out.println(
        "\t****************************************************************************************************");
    }

    public void displayError() {       
        System.out.println();
        displayHelpBorder();                     
        System.out.println("\tThis is an invalid selection. Please choose again.");
        displayHelpBorder();             
    }
    
}
