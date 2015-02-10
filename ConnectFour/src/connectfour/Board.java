/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author Daniel
 */
public class Board {
    private String board[][] = {{"┌-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┬-","-","-┐"},
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


    public void setBoardPiece(int col, String piece) {
        //System.out.println(board[11][col*2-1]);
        int row = 0;
        int actualCol = col*2-1;
        for(int i = 11; i > 0; i-= 2 ){
            if(board[i][actualCol].equals(" ")){
                row = i;
                i = -1;
            }
        }
        if(row == 0){
            System.out.println("Could not add piece to column.");
        }else{
            this.board[row][actualCol] = piece;
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
    
    /*
    * @author Davy Garaix
    * This function checks to see if a custom sized board
    *   has enough rows and columns. It also checks if it has too many.
    * Additionally, it calculates how much bigger or smaller it is compared to
    *   the 6 x 6 default board size.
    */
    public String checkBoardSize (int columns, int rows) {
        String message;
        double percent;
        
        if (columns < 4) {
            percent = -1;
            message = "\nNot enough columns";
            return message;
        }
        
        if (columns > 10) {
            percent = -1;
            message = "\nToo many columns";
            return message;
        }
        
        if (rows < 4) {
            percent = -1;
            message = "\nNot enough rows";
            return message;
        }
        
        if (rows > 10) {
            percent = -1;
            message = "\nToo many rows";
            return message;
        }
        
        percent = (double)(columns * rows) / 36 * 100;
        message = "\nThe board is valid, and is "
                + percent + "% of the default 6 x 6 board.";
        return message;
    }
}
