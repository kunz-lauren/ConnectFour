/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Arrays;

/**
 *
 * Lesson 06 individual function added by Davy Garaix
 */
public class ScoreCalc {

    // This class object is created through a "new" command in the ConnectFour class.
    ScoreCalc(){
        
        // Creating the test strings from the test matrix
        String[] scoreCalcTest1 = {"r","r","T","b","R","","t"};
        String[] scoreCalcTest2 = {"-1","0","w","&","@"};
        String[] scoreCalcTest3 = null;
        String[] scoreCalcTest4 = {"r","r","r"};
        
        // Running each of the test strings from the test matrix through the function
        scoreCalc(scoreCalcTest1);
        scoreCalc(scoreCalcTest2);
        scoreCalc(scoreCalcTest3);
        scoreCalc(scoreCalcTest4);
        
        // Adding a space for readability
        System.out.println();
    }
    
    /* This is the function that is supposed to take a string of game scores,
     *    and spit out stats about the game.
     * For example, if we give it a string like this {"r","b","t"), it means
     *    that red won, black won, and there was a tie.
     * So logically, the function should print that red won once (consequently, black lost).
     *    that black won once (consequently, red lost), and that both earned a tie.
     * So the scores for each team should be 1/1/1 (wins/losses/ties).
     * The function also calculates the win ratio of each team.
     * There is a counter (totalGames) that keeps track of valid games.
     * If there is anything else besides "r", "b", or "t", it is ignored.
     */ 
    public void scoreCalc(String[] score) {
        // If the array is null, such as scoreCalcTest3, it'll detect it.
        // I suppose it could happen somehow.
        if (score == null) {
            System.out.println("\nThe score array is null");
            return;
        }
        
        // All variables are declared and initialized.
        int redWins, redLosses, redTies, blackWins, blackLosses, blackTies, totalGames;
        redWins = redLosses = redTies = blackWins = blackLosses = blackTies = totalGames = 0;

        // This is the for each loop, going through each element of the passed array (score)
        for (String str : score) {
            str = str.toLowerCase();
            switch(str) {
                case "r": redWins++; blackLosses++; totalGames++; break;
                case "b": redLosses++; blackWins++; totalGames++; break;
                case "t": redTies++; blackTies++; totalGames++; break;
                default: break;
            }            
        }
        
        // These statements here calculate the win ratio percent.
        // They cast the int into doubles, and rounds them up to 2 decimals
        //     That's what the "* 100 / 100" means.
        // If I would do "* 1000 / 1000", it would round to three decimals.
        double redWinRatio = (double)redWins / (double)totalGames * 100;
        redWinRatio = (double)Math.round(redWinRatio * 100) / 100;
        double blackWinRatio = (double)blackWins / (double)totalGames * 100;
        blackWinRatio = (double)Math.round(blackWinRatio * 100) / 100;
        
        // Printing out all that stuff with new lines and tabs.
        System.out.print("\nGames: " + Arrays.toString(score));
        System.out.print("\nRed W/L/T: " + redWins + "/" + redLosses + "/" + redTies);
        System.out.print("\tRed win ratio: " + redWinRatio + "%");        
        
        System.out.print("\nBlack W/L/T: " + blackWins + "/" + blackLosses + "/" + blackTies);
        System.out.print("\tBlack win ratio: " + blackWinRatio + "%\n");
        
        // If you actually read this, honk.
    }
}
