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
    Scanner input = new Scanner (System.in);
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
        /*myGame.getName();
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
        System.out.println("\nThe location is: Column " + location1.getColumnNumber() + ",and Row " + location1.getRowNumber() + ".");     */   
        
        //Added by Daniel
        //myGame.play();
        
        System.out.println(myGame.gameStatus(0,0));
        System.out.println(myGame.gameStatus(15,14));
        System.out.println(myGame.gameStatus(19,18));
        System.out.println(myGame.gameStatus(7,8));
        System.out.println(myGame.gameStatus(0,-1));
        System.out.println(myGame.gameStatus(15,13));
        
    }
    //Functions
    public void getName() {
        
        System.out.println("Enter your name: ");
        this.name = input.next();
}
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
        
    }
    
    //Added by Daniel
    public void play(){
        Board board = new Board();
        board.displayBoard();
        boolean turn = true;
        int col = 0;
        String piece;
        while(col != -1){
            System.out.println("Enter a column to insert into. Enter -1 to exit.");
            col = input.nextInt();
            if(col != -1){
                if(turn){
                    piece = "r";
                }else{
                    piece = "b";
                }
                board.setBoardPiece(col, piece);
                board.displayBoard();
                turn = !turn;
            }
        }
    }
    
    public String gameStatus(int redPieces, int blackPieces){
        String phrase;
        
        int red;
        int black;
        red = redPieces;
        black = blackPieces;
        
        double percentage;
        percentage = (((double)red+(double)black)/36)*100;
        
        if(percentage > 100){
            phrase = "The board is too full.";
        }
        else if(percentage < 0){
            phrase = percentage + "%. Invalid number of pieces. Please put the board back together.";
        }
        else{
            phrase = percentage + "%";
        }
        
        if(black > red){
            phrase = "Black has too many pieces.";
        }
        else if(red - black > 1){
            phrase = "Red has too many pieces.";
        }
        return phrase;
    }
}
