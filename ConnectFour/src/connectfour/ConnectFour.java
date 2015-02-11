/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Keith
 */
public class ConnectFour {
    public static Scanner input = new Scanner (System.in);
    Board board = new Board();
    Rules rule = new Rules();
    HelpMenuView helpView = new HelpMenuView();
    FrenchHelpMenuView frenchHelpView = new FrenchHelpMenuView();
    CreditsMenuView creditsView = new CreditsMenuView();
    QuoteMenuView quoteView = new QuoteMenuView();
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
        myGame.mainMenu();
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
        
        /*
        System.out.println(myGame.gameStatus(0,0));
        System.out.println(myGame.gameStatus(15,14));
        System.out.println(myGame.gameStatus(19,18));
        System.out.println(myGame.gameStatus(7,8));
        System.out.println(myGame.gameStatus(0,-1));
        System.out.println(myGame.gameStatus(15,13));
        System.out.println(myGame.percentRed(15,14));
        System.out.println(myGame.percentRed(36,0));
        System.out.println(myGame.percentRed(0,36));
        System.out.println(myGame.percentRed(15,13));
        System.out.println(myGame.totalPiecesLeft(0,0));
        System.out.println(myGame.totalPiecesLeft(70,6));
        System.out.println(myGame.totalPiecesLeft(-1,0));
        System.out.println(myGame.totalPiecesLeft(15,14));
        System.out.println(myGame.totalPiecesLeft(2,1));
        System.out.println(myGame.totalPiecesLeft(6,5));
        System.out.println(myGame.totalPiecesLeft(17,16));*/
        
        /*
        * Added by Davy Garaix
        * The following tests are for the checkBoardSize function
        * from the Board class
        */
        
        /*
        System.out.print("\n*****************Start*of*Davy's*checkBoardSize*function*****************");
        System.out.print(board.checkBoardSize(7, 5));
        System.out.print(board.checkBoardSize(3, 6));
        System.out.print(board.checkBoardSize(8, 2));
        System.out.print(board.checkBoardSize(12, 9));
        System.out.print(board.checkBoardSize(7, 13));
        System.out.print(board.checkBoardSize(10, 10));
        System.out.println("\n******************End*of*Davy's*checkBoardSize*function******************\n");*/
        
        // Test for Davy's fourInARow function
        // These tests will execute when the main menu is exited (via option 10)
        String[] fourInARowTestOne = {"r","r","b","b","r","r"};
        String[] fourInARowTestTwo = {"","r","b","b","b","b"};
        String[] fourInARowTestThree = {"b","b","b","b","",""};
        String[] fourInARowTestFour = {"r","r","r","r","",""};
        String[] fourInARowTestFive = {"","","","","",""};
        System.out.println("\n***fourInARow test***");
        System.out.print(myGame.fourInARow(fourInARowTestOne,"r"));
        System.out.print(myGame.fourInARow(fourInARowTestTwo,"b"));
        System.out.print(myGame.fourInARow(fourInARowTestThree,"c"));
        System.out.print(myGame.fourInARow(fourInARowTestFour,"-1"));
        System.out.print(myGame.fourInARow(fourInARowTestFive,"r"));
        System.out.println("\n***end of fourInARow test***\n");
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
    
    public void mainMenu(){               
        String menuOption = "";
        while(!menuOption.equals("10")){
            System.out.println("Select an option:");
            System.out.println("1) Single player game"
                              +"\n2) 2 player game"
                              +"\n3) Rules"
                              +"\n4) Help"
                              +"\n5) Help-French"
                              +"\n6) Game-Mode"
                              +"\n7) Quote of the Day"
                              +"\n8) Credit"
                              +"\n9) Disclamer"
                              +"\n10) Exit");
            System.out.print(">");
            menuOption = input.nextLine();
            switch (menuOption){
                case "1":
                    play();
                    break;
                case "2":
                    computerPlay();
                    break;
                case "3":
                    System.out.println();
                    Rules display = new Rules();
                    display.output();
                    System.out.println();
                    break;
                case "4":
                    helpView.getInput();
                    break;
                case "5":
                    frenchHelpView.getInput();
                    break;
                case "6":
                    new GameModeView().getInput();
                    break;
                case "7":
                    quoteView.getInput();
                    break;
                case "8":
                    creditsView.getInput();
                    break;
                case "9":
                    System.out.println("There is nothing here right now.");
                    break;
            }
        }
    }
    
    //Added by Daniel
    public void computerPlay(){
        Board board = new Board();
        Computer comp = new Computer();
        board.displayBoard();
        boolean turn = true;
        int col = 0;
        String piece;
        while(col != -1){
            if(turn){
                System.out.println("Enter a column to insert into. Enter -1 to exit.");
                col = input.nextInt();
                piece = "r";
            }else{
                System.out.println("It is the computers turn. It is thinking.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ConnectFour.class.getName()).log(Level.SEVERE, null, ex);
                }
                piece = "b";
                col = comp.easyMode();
            }
            if(col != -1){
                board.setBoardPiece(col, piece);
                board.displayBoard();
                turn = !turn;
            }
        }
    }
    
    public void play(){
        Board board = new Board();
        Computer comp = new Computer();
        board.displayBoard();
        boolean turn = true;
        int col = 0;
        String piece;
        while(col != -1){
           System.out.println("Enter a column to insert into or check a column using (example) check3 (Checks column 3). Enter -1 to exit.");
           String column = input.nextLine().toLowerCase();
           if(column.length() == 6){
               if (column.startsWith("check") && (column.endsWith("1") || column.endsWith("2") || column.endsWith("3") || column.endsWith("4") || column.endsWith("5") || column.endsWith("6"))){
                   // checkBoard (column);
               } else {
                   System.out.println("Invalid input.");
                   continue;
               }
                   
           } else if(column.length() == 1 || column.length() == 2){
               try{
               col = Integer.getInteger(column);
               } catch(Exception e){
                   System.out.println("Invalid input.");
                   continue;
               }
               if(turn){
                   piece = "r";
               }else{
                   piece = "b";
               }
               if(col != -1){
                   board.setBoardPiece(col, piece);
                   board.displayBoard();
                   turn = !turn;
               }
           } else{
               System.out.println("Invalid input.");
               continue;
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
            phrase = percentage + "%. Invalid number of pieces. \n\tPlease put the board back together.";
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
    
    //Added by Tenille
    public String totalPiecesLeft (int redPieces, int blackPieces) {
    //variables
        String userDisplay;
        int redLeft;
        int blackLeft;
        int piecesUsed;
        int piecesLeft;
        double percentLeft;
            
    //calculations
    redLeft = 18 - redPieces;
    blackLeft = 18 - blackPieces;
    piecesUsed = redPieces + blackPieces;
    piecesLeft = 36 - piecesUsed;
    percentLeft = ((double)piecesLeft / 36) * 100;
    
    //valid input test
    if (piecesUsed > 36 || piecesUsed < 0) {
        userDisplay = "Invalid number of pieces.";
        return userDisplay;
    }
    /* if (piecesUsed < 0) {
        userDisplay = "Invalid number of pieces.";
    }*/
    
    //logic
    if (percentLeft <= 30){
        userDisplay = "\nYou are almost out of pieces!\n"
                + "Hurry! Connect 4 pieces!\n" 
                + "Red has " + redLeft + " pieces left.\t"
                + "Black has " + blackLeft + " pieces left.\n"
                + "There is " + percentLeft + "%" + " of the pieces "
                + "left in this game.";
           }
    else {
        userDisplay = "\nYou have plenty of pieces left!\n"
                + "Try to connect 4 pieces!\n" 
                + "Red has " + redLeft + " pieces left.\t"
                + "Black has " + blackLeft + " pieces left.\n"
                + "There is " + percentLeft + "%" + " of the pieces "
                + "left in this game.";
           }
     return userDisplay;
            }
    //end of Tenille's function
    
   public String percentRed (int redPieces, int blackPieces){

//instance variables
String phrase;
int red;
int black;

red=redPieces;
black=blackPieces;

//equation
double percentage;
percentage=((double)red/((double)red+(double)black))*100;


if(percentage > 60){
    phrase="Red is lonely";}

else if (percentage<40){
    phrase= "\n Black is lonely";}

else{
    phrase= "\n"+ percentage+"%";





}
return phrase;

   }

   // Lesson 05 individual function added by Davy Garaix
   public boolean fourInARow(String[] gamePieces, String shape){
       String[] arrayOfPieces = gamePieces;
       String evaluatedPiece = shape;
       int i;
       int count = 0;
       
       for (i=0; i < arrayOfPieces.length; i++) {
           if (arrayOfPieces[i] == null) {
               count = 0;
               continue;
           }
           if (arrayOfPieces[i] == evaluatedPiece){
               count++;
               if (count == 4) {
                   return true;
               }
           } else {
               count = 0;
           }
       }
       return false;
   }

}
