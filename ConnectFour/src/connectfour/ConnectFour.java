/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Scanner;

/**
 *
 * @author Keith
 */
public class ConnectFour {
    //Instance Variables
    String name;
    String instructions = "This is the game of Connect Four \n\n"
            + "This is a two player game. \n"
            + "The point of the game is to get four of your pieces \n"
            + "in a row, either hortizonaly, vertically, or diagionally. \n"
            + "Player take turns placing their pieces on a six by six board. \n"
            + "The first person to connect four of their pieces in a row wins! \n"
            + "Good Luck!\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectFour myGame = new ConnectFour();
        myGame.getName();
        myGame.displayHelp();
           
        Player player1=new Player();
        
        System.out.println(player1.getName());
        System.out.println(player1.getColor());
        
        //@author Tenille Diel
        GamePieces redPiece = new GamePieces();
        GamePieces blackPiece = new GamePieces();
        
        System.out.println("\nPlayer 1 has " + redPiece.getPiecesPerPlayer() + " red " + redPiece.getShape() + " shaped pieces.");
        System.out.println("\nPlayer 2 has " + blackPiece.getPiecesPerPlayer() + " black " + blackPiece.getShape() + " shaped pieces.");
        
        Location location1 = new Location();
        System.out.println("\nThe location is: Column " + location1.getColumnNumber() + ",and Row " + location1.getRowNumber() + ".");                
        
    }
    //Functions
    public void getName() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
}
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
        
    }
}
