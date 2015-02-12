package connectfour;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keoni AledoJr
 */
public class CheckAvailibiltyView {
    
    public void findAvailable(String[][] board, int column){
        int actualCol = column*2-1;
        if(board[1][actualCol].equals(" ")){
            System.out.println("You can put a piece in this column.");
        } else{
            System.out.println("This column is full. Pick a different one.");
        }
    }
    
}

