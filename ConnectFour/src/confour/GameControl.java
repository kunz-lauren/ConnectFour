/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

// @author Daniel

import confour.enums.GameVariables;

public class GameControl {
    private static int row, col;
    private static String piece;
    private static String board[][] = {{"┌-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┐"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                {"└-","-","-┴-","-","-┴-","-","-┴-","-","-┴-","-","-┴-","-","-┘"},
                                {" "," 1 ","  "," 2 ","  "," 3 ","  "," 4 "," "," 5 ","  "," 6 "," "}};

    public void clearBoard(){
        for(int i = GameVariables.COLUMN_ONE.getNumber(); i < GameVariables.UPPER_EDGE.getNumber(); i += GameVariables.COUNTER.getNumber()){
            for(int j = GameVariables.COLUMN_ONE.getNumber(); j < GameVariables.UPPER_EDGE.getNumber(); j += GameVariables.COUNTER.getNumber()){
                board[i][j] = " ";
            }
        }
    }

    public void setBoardPiece(int col, String piece) {
        int row = 0;
        int actualCol = col*2-1;
        for(int i = GameVariables.COLUMN_SIX.getNumber(); i > GameVariables.LOWER_EDGE.getNumber(); i-= GameVariables.COUNTER.getNumber() ){
            if(board[i][actualCol].equals(" ")){
                row = i;
                i = GameVariables.LOWER_EDGE.getNumber();
                this.row = i*2-1;
                this.col = actualCol;
                this.piece = piece;
            }
        }
        if(row == 0){
            System.out.println("Could not add piece to column.");
        }else{
            this.board[row][actualCol] = piece;
        }
        if (isFull()) {
            System.out.println("The board is full.");
        }
    }

    public void displayBoard(){
        
        //System.out.println(board[0][13]);
        
        for(int i = 0; i < 14; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public boolean checkWin(){
        for(int i = 1; i < 12; i += 2){
            for(int j = 1; j < 12; j += 2){
                if(!board[i][j].equals(" ")){
                    if(checkSpace(i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean checkSpace(int row, int col){
        //int row1, row2, row3, row4;
        //int col1, col2, col3, col4;
        
        
        int counter = 0;
        for(int i = -6; i <= 6; i += 2){
            if(row + i >= 1 && row + i <= 11 && col + i >= 1 && col + i <= 11){
                if(board[row + i][col + i].equals(piece)){
                    counter++;
                }
                else{
                    counter = 0;
                }
            }
            if(counter == 4){
                return true;
            }
        }
        counter = 0;
        
        for(int i = -6; i <= 6; i += 2){
            if(row + i >= 1 && row + i <= 11 && col - i >= 1 && col - i <= 11){
                if(board[row + i][col - i].equals(piece)){
                    counter++;
                }
                else{
                    counter = 0;
                }
            }
            if(counter == 4){
                return true;
            }
        }
        counter = 0;
                
        for(int i = -6; i <= 6; i += 2){
            if(row + i >= 1 && row + i <= 11){
                if(board[row + i][col].equals(piece)){
                    counter++;
                }
                else{
                    counter = 0;
                }
            }
            if(counter == 4){
                return true;
            }
        }
        counter = 0;
              
        for(int i = -6; i <= 6; i += 2){
            if(col + i >= 1 && col + i <= 11){
                if(board[row][col + i].equals(piece)){
                    counter++;
                }
                else{
                    counter = 0;
                }
            }
            if(counter == 4){
                return true;
            }
        }
        return false;
        
    }
    
    //@author Tenille Diel
        private boolean isFull() {      

            for (int cols = 1; cols < 12; cols+=2) {
                 
                if (board[1][cols] == " ");
                return false;
            }
            return true;
        }        

    // Default constructor
    public GameControl() {
    }

    // Getters and Setters
    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        GameControl.row = row;
    }

    public static int getCol() {
        return col;
    }

    public static void setCol(int col) {
        GameControl.col = col;
    }

    public static String getPiece() {
        return piece;
    }

    public static void setPiece(String piece) {
        GameControl.piece = piece;
    }

    public static String[][] getBoard() {
        return board;
    }

    public static void setBoard(String[][] board) {
        GameControl.board = board;
    }

}
