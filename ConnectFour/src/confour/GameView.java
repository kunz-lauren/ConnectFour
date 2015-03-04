/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import static confour.ConnectFour.input;

/**
 *
 * @author Daniel
 */
public class GameView {
    GameControl game = new GameControl();
    boolean gameWon;
    boolean turn;
    String piece;
    int col;
    Player player1;
    Player player2;
    
    public void play(int players){
        game.clearBoard();
        gameWon = false;
        col = 0;
        turn = true;
        
        if(players == 1){
            createPlayer1();
            player2 = new Player("Computer");
            computerPlay();
        }
        else{
            createPlayer1();
            createPlayer2();
            regularPlay();
        }
    }
    
    private void computerPlay(){
        Computer comp = new Computer();
        game.displayBoard();
        while(col != -1){
            if(turn){
                playerTurn();
                piece = "r";
            }
            else{
                System.out.println("It is the computers turn. It is thinking.");
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    //do nothing
                }
                piece = "b";
                col = comp.easyMode();
            }
            endTurn();
        }
    }
    
    private void regularPlay(){
        game.displayBoard();
        while(col != -1){
            playerTurn();
            if(turn){
                piece = "r";
            }
            else{
                piece = "b";
            }
            endTurn();
        }
    }
    
    private void playerTurn(){
        System.out.println("Enter a colum to insert into. Enter -1 to exit.");
        col = input.nextInt();
        //System.out.println("playerTurn "+col);
        input.nextLine();
    }
    
    private void endTurn(){
        //System.out.println("Made it into endTurn");
        if(col != -1){
            //System.out.println("Made it into if statement.");
            game.setBoardPiece(col, piece);
            game.displayBoard();
            gameWon = game.checkWin();
            if(gameWon){
                col = -1;
                addWinLoss(piece);
                displayFinishMessage();
            } else{
            turn = !turn;
        }
    }
}
    
    private void createPlayer1(){
        System.out.println("What is the name of player 1.");
        System.out.print(">");
        player1 = new Player(input.nextLine());
    }
    
    private void createPlayer2(){
        System.out.println("What is the name of player 2.");
        System.out.print(">");
        player2 = new Player(input.nextLine());
    }
    
    private void addWinLoss(String piece){
        if(piece.equals("r")){
            player1.addScore(1);
            player2.addScore(0);
        } else{
            player2.addScore(1);
            player1.addScore(0);
        }
    }
    
    private void displayFinishMessage(){
        String winner;
        String notWinner;
        if(piece.equals("r")){
            winner = player1.getName();
            notWinner = player2.getName();
        }
        else{
            winner = player2.getName();
            notWinner = player1.getName();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Congratulations " + winner +".\n"
                         + "Better luck next time " + notWinner + ".");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
