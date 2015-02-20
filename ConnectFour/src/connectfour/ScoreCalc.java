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

    ScoreCalc(){
        String[] scoreCalcTest1 = {"r","r","T","b","R","","t"};
        String[] scoreCalcTest2 = {"-1","0","w","&","@"};
        String[] scoreCalcTest3 = null;
        String[] scoreCalcTest4 = {"r","r","r"};
        
        scoreCalc(scoreCalcTest1);
        scoreCalc(scoreCalcTest2);
        scoreCalc(scoreCalcTest3);
        scoreCalc(scoreCalcTest4);
        
        System.out.println();
    }
    
    public void scoreCalc(String score[]) {
        if (score == null) {
            System.out.println("\nThe score array is null");
            return;
        }
        int redWins, redLosses, redTies, blackWins, blackLosses, blackTies, totalGames;
        redWins = redLosses = redTies = blackWins = blackLosses = blackTies = totalGames = 0;

        for (String str : score) {
            str = str.toLowerCase();
            switch(str) {
                case "r": redWins++; blackLosses++; totalGames++; break;
                case "b": redLosses++; blackWins++; totalGames++; break;
                case "t": redTies++; blackTies++; totalGames++; break;
                default: break;
            }            
        }
        
        double redWinRatio = (double)redWins / (double)totalGames * 100;
        redWinRatio = (double)Math.round(redWinRatio * 100) / 100;
        double blackWinRatio = (double)blackWins / (double)totalGames * 100;
        blackWinRatio = (double)Math.round(blackWinRatio * 100) / 100;
        
        System.out.print("\nGames: " + Arrays.toString(score));
        System.out.print("\nRed W/L/T: " + redWins + "/" + redLosses + "/" + redTies);
        System.out.print("\tRed win ratio: " + redWinRatio + "%");        
        
        System.out.print("\nBlack W/L/T: " + blackWins + "/" + blackLosses + "/" + blackTies);
        System.out.print("\tBlack win ratio: " + blackWinRatio + "%\n");
    
    }
}
