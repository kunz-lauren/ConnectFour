/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

// @author Daniel
public class GameControl {
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

    public void clearBoard(){
        for(int i = 1; i < 12; i += 2){
            for(int j = 1; j < 12; j += 2){
                board[i][j] = " ";
            }
        }
    }

    public void setBoardPiece(int col, String piece) {
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
    
    public boolean checkSpace(int row, int col){
        int row1, row2, row3, row4;
        int col1, col2, col3, col4;
        
        /*
        
        */
        //check far top-left
        row1 = row-6;
        row2 = row-4;
        row3 = row-2;
        row4 = row;
        
        col1 = col-6;
        col2 = col-4;
        col3 = col-2;
        col4 = col;
                
        if(row1 < 1 || row2 < 1 || row3 < 1 || col1 < 1 || col2 < 1 || col3 < 1){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check mid top-left
        row1 = row-4;
        row2 = row-2;
        row3 = row;
        row4 = row+2;
        
        col1 = col-4;
        col2 = col-2;
        col3 = col;
        col4 = col+2;
        
        if(row1 < 1 || row2 < 1 || row4 > 11 || col1 < 1 || col2 < 1 || col4 > 11){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check mid bot-right
        row1 = row-2;
        row2 = row;
        row3 = row+2;
        row4 = row+4;
        
        col1 = col-2;
        col2 = col;
        col3 = col+2;
        col4 = col+4;
        
        if(row1 < 1 || row3 > 11 || row4 > 11 || col1 < 1 || col3 > 11 || col4 > 11){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check far bot-right
        row1 = row;
        row2 = row+2;
        row3 = row+4;
        row4 = row+6;
        
        col1 = col;
        col2 = col+2;
        col3 = col+4;
        col4 = col+6;
        
        if(row2 > 11 || row3 > 11 || row4 > 11 || col2 > 11 || col3 > 11 || col4 > 11){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check far bot-left
        row1 = row-6;
        row2 = row-4;
        row3 = row-2;
        row4 = row;
        
        col1 = col+6;
        col2 = col+4;
        col3 = col+2;
        col4 = col;
        
        if(row1 < 1 || row2 < 1 || row3 < 1 || col1 > 11 || col2 > 11 || col3 > 11){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check mid bot-left
        row1 = row-4;
        row2 = row-2;
        row3 = row;
        row4 = row+2;
        
        col1 = col+4;
        col2 = col+2;
        col3 = col;
        col4 = col-2;
        
        if(row1 < 1 || row2 < 1 || row4 > 11 || col1 > 11 || col2 > 11 || col4 < 1){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check mid top-right
        row1 = row-2;
        row2 = row;
        row3 = row+2;
        row4 = row+4;
        
        col1 = col+2;
        col2 = col;
        col3 = col-2;
        col4 = col-4;
        
        if(row1 < 1 || row3 > 11 || row4 > 11 || col1 > 11 || col3 < 1 || col4 < 1){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check far top-right
        row1 = row;
        row2 = row+2;
        row3 = row+4;
        row4 = row+6;
        
        col1 = col;
        col2 = col-2;
        col3 = col-4;
        col4 = col-6;
        
        if(row2 > 11 || row3 > 11 || row4 > 11 || col2 < 1 || col3 < 1 || col4 < 1){}
        else{
            if(board[row1][col1].equals(board[row2][col2]) && board[row2][col2].equals(board[row3][col3]) && board[row3][col3].equals(board[row4][col4])){
                return true;
            }
        }
        
        //check far top mid
        row1 = row-6;
        row2 = row-4;
        row3 = row-2;
        row4 = row;
        
        if(row1 < 1 || row2 < 1 || row3 < 1){}
        else{
            if(board[row1][col].equals(board[row2][col]) && board[row2][col].equals(board[row3][col]) && board[row3][col].equals(board[row4][col])){
                return true;
            }
        }
        
        //check mid top mid
        row1 = row-4;
        row2 = row-2;
        row3 = row;
        row4 = row+2;
        
        if(row1 < 1 || row2 < 1 || row4 > 11){}
        else{
            if(board[row1][col].equals(board[row2][col]) && board[row2][col].equals(board[row3][col]) && board[row3][col].equals(board[row4][col])){
                return true;
            }
        }
        
        //check mid bot mid
        row1 = row-2;
        row2 = row;
        row3 = row+2;
        row4 = row+4;
        
        if(row1 < 1 || row3 > 11 || row4 > 11){}
        else{
            if(board[row1][col].equals(board[row2][col]) && board[row2][col].equals(board[row3][col]) && board[row3][col].equals(board[row4][col])){
                return true;
            }
        }
        
        //check far bot mid
        row1 = row;
        row2 = row+2;
        row3 = row+4;
        row4 = row+6;
        
        if(row2 > 11 || row3 > 11 || row4 > 11){}
        else{
            if(board[row1][col].equals(board[row2][col]) && board[row2][col].equals(board[row3][col]) && board[row3][col].equals(board[row4][col])){
                return true;
            }
        }
        
        //check far mid left
        col1 = col-6;
        col2 = col-4;
        col3 = col-2;
        col4 = col;
        
        if(col1 < 1 || col2 < 1 || col3 < 1){}
        else{
            if(board[row][col1].equals(board[row][col2]) && board[row][col2].equals(board[row][col3]) && board[row][col3].equals(board[row][col4])){
                return true;
            }
        }
        
        //check mid mid left
        col1 = col-4;
        col2 = col-2;
        col3 = col;
        col4 = col+2;
        
        if(col1 < 1 || col2 < 1 || col4 > 11){}
        else{
            if(board[row][col1].equals(board[row][col2]) && board[row][col2].equals(board[row][col3]) && board[row][col3].equals(board[row][col4])){
                return true;
            }
        }
        
        //check mid mid right
        col1 = col-2;
        col2 = col;
        col3 = col+2;
        col4 = col+4;
        
        if(col1 < 1 || col3 > 11 || col4 > 11){}
        else{
            if(board[row][col1].equals(board[row][col2]) && board[row][col2].equals(board[row][col3]) && board[row][col3].equals(board[row][col4])){
                return true;
            }
        }
        
        //check far mid right
        col1 = col;
        col2 = col+2;
        col3 = col+4;
        col4 = col+6;
        
        if(col2 > 11 || col3 > 11 || col4 > 11){}
        else{
            if(board[row][col1].equals(board[row][col2]) && board[row][col2].equals(board[row][col3]) && board[row][col3].equals(board[row][col4])){
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

}
