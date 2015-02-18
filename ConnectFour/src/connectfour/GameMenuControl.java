/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author laurenkorpacz
 */
public class GameMenuControl {
    
    private Game game;
    private Board board;


    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard(); 
    }
    
    
    private boolean isWinner() {

      /*  Player[][] locations = this.board.getBoardLocations();

        for (int row = 0; row < locations.length; row++) {
            Player[] rowLocations = locations[row];
     
            
            for (int col = 0; col < rowLocations.length; col++) {
                if (fourInARow(row, col, locations)) {
                    return true;
                }
            }
        }*/

        return false;
    }

 private boolean fourInARow(int row, int col, Player[][] boardLocations) {
        boolean winner = false;

        int columnLength = boardLocations[row].length;
        int rowLength = boardLocations.length;

        // square not taken yet
        if (boardLocations[row][col] == null) {
            return false;
        } // search for three adjacent horizontally
        else if (row < rowLength && col < columnLength - 2
                && boardLocations[row][col] == boardLocations[row][col + 1]
                && boardLocations[row][col] == boardLocations[row][col + 2]) {
            return true;
        } // search for three adjacent vertically
        else if (row < rowLength - 2 && col < columnLength
                && boardLocations[row][col] == boardLocations[row + 1][col]
                && boardLocations[row][col] == boardLocations[row + 2][col]) {
            return true;
        } // search for three adjacent diagonally leaning backward
        else if (row < rowLength - 2 && col < columnLength - 2
                && boardLocations[row][col] == boardLocations[row + 1][col + 1]
                && boardLocations[row][col] == boardLocations[row + 2][col + 2]) {
            return true;
        } // search for three adjacent diagonally learning forward
        else if (row < rowLength - 2 && col > 1
                && boardLocations[row][col] == boardLocations[row + 1][col - 1]
                && boardLocations[row][col] == boardLocations[row + 2][col - 2]) {
            return true;
        }

        return false;
    }

    private static class Game {

        public Game() {
        }

        private Board getBoard() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}