/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

// @author Daniel

public class GameControl {
    private static final int negSix = -6, negOne = -1, zero = 0,
                            one = 1, two = 2, four = 4, six = 6, 
                            eleven = 11, twelve = 12, thirteen = 13, 
                            fourteen = 14, fifteen = 15;
    private static final String emptyString = " ";
    private static int row, col;
    private static String piece;
    
    private String actualBoard[][] = {{" ", " ", " ", " ", " ", " ", " "},
                                      {" ", " ", " ", " ", " ", " ", " "},
                                      {" ", " ", " ", " ", " ", " ", " "},
                                      {" ", " ", " ", " ", " ", " ", " "},
                                      {" ", " ", " ", " ", " ", " ", " "},
                                      {" ", " ", " ", " ", " ", " ", " "}};
    
    private static String board[][] = {{"┌-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┐"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"├-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┼-","-","-┤"},
                                       {"│ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │ "," "," │"},
                                       {"└-","-","-┴-","-","-┴-","-","-┴-","-","-┴-","-","-┴-","-","-┴-","-","-┘"},
                                       {" "," 1 ","  "," 2 ","  "," 3 ","  "," 4 "," "," 5 ","  "," 6 ","  ", " 7 ", " "}};

    public void clearBoard(){
        for(int i = one; i < twelve; i += two){
            for(int j = one; j < fourteen; j += two){
                board[i][j] = emptyString;
            }
        }
    }
    
    public void clearActualBoard(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                actualBoard[i][j] = emptyString;
            }
        }
    }

    public void setBoardPiece(int col, String piece) {
        int row = zero;
        int actualCol = col*two-one;
        for(int i = eleven; i > zero; i-= two){
            if(board[i][actualCol].equals(emptyString)){
                row = i;
                i = negOne;
                this.row = i*two-one;
                this.col = actualCol;
                this.piece = piece;
            }
        }
        if(row == zero){
            System.out.println("Could not add piece to column.");
        }else{
            this.board[row][actualCol] = piece;
        }
        if (isFull()) {
            System.out.println("The board is full.");
        }
    }
    
    public int setActualBoardPiece(int col, String piece){
        int row = -1;
        for(int i = 5; i >=0; i--){
            if(actualBoard[i][col].equals(emptyString)){
                row = i;
                i = -1;
                this.row = i;
                this.col = col;
                this.piece = piece;
            }
        }
        if(row == -1){
            return -1;
        } else{
            this.actualBoard[row][col] = piece;
            return row;
        }
    }

    public void displayBoard(){
        
        //System.out.println(board[0][13]);
        
        for(int i = zero; i < fourteen; i++){
            for(int j = zero; j < fifteen; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    
    public boolean checkWin(){
        for(int i = one; i < twelve; i += two){
            for(int j = one; j < fourteen; j += two){
                if(!board[i][j].equals(emptyString)){
                    if(checkSpace(i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean checkGuiWin(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                if(!actualBoard[i][j].equals(emptyString)){
                    if(checkGuiSpace(i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean checkSpace(int row, int col){        
        
        int counter = zero;
        for(int i = negSix; i <= six; i += two){
            if(row + i >= one && row + i <= eleven && col + i >= one && col + i <= thirteen){
                if(board[row + i][col + i].equals(piece)){
                    counter++;
                }
                else{
                    counter = zero;
                }
            }
            if(counter == four){
                return true;
            }
        }
        counter = 0;
        
        for(int i = negSix; i <= six; i += two){
            if(row + i >= one && row + i <= eleven && col - i >= one && col - i <= thirteen){
                if(board[row + i][col - i].equals(piece)){
                    counter++;
                }
                else{
                    counter = zero;
                }
            }
            if(counter == four){
                return true;
            }
        }
        counter = zero;
                
        for(int i = negSix; i <= six; i += two){
            if(row + i >= one && row + i <= eleven){
                if(board[row + i][col].equals(piece)){
                    counter++;
                }
                else{
                    counter = zero;
                }
            }
            if(counter == four){
                return true;
            }
        }
        counter = zero;
              
        for(int i = negSix; i <= six; i += two){
            if(col + i >= one && col + i <= thirteen){
                if(board[row][col + i].equals(piece)){
                    counter++;
                }
                else{
                    counter = zero;
                }
            }
            if(counter == four){
                return true;
            }
        }
        return false;
        
    }
    
    private boolean checkGuiSpace(int row, int col){
        int counter = 0;
        //top left to bottom right
        for(int i = -3; i <= 3; i++){
            if(row + i >= 0 && row + i <= 5 && col + i >= 0 && col + i <= 6){
                if(actualBoard[row + i][col + i].equals(piece)){
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
        
        //bottom left to top right
        for(int i = -3; i <= 3; i++){
            if(row + i >= 0 && row + i <= 5 && col - i >= 0 && col - i <= 6){
                if(actualBoard[row + i][col - i].equals(piece)){
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
                
        //bottom to top
        for(int i = -3; i <= 3; i++){
            if(row + i >= 0 && row + i <= 5){
                if(actualBoard[row + i][col].equals(piece)){
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
              
        //left to right
        for(int i = -3; i <= 3; i++){
            if(col + i >= 0 && col + i <= 6){
                if(actualBoard[row][col + i].equals(piece)){
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

            for (int cols = one; cols < twelve; cols += two) {
                 
                if (board[one][cols].equals(emptyString));
                return false;
            }
            return true;
        } 
    
    public boolean isTie(){
        for(int i = 0; i < 6; i++){
            if(actualBoard[0][i].equals(emptyString)){
                return false;
            }
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
