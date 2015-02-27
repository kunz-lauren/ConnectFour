/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Player {
    String name;
    ArrayList<Integer> scores = new ArrayList<Integer>();
    //wins variable;
    
    public Player(String playerName){
        name = playerName;
    }

    public String getName() {
        return name;
    }
    
    public void addScore(int score){
        scores.add(score);
    }
    
    public int getWins(){
        int tally = 0;
        for(int score : scores){
            if(score == 1){
                tally++;
            }
        }
        return tally;
    }
    
    public int getLosses(){
        int tally = 0;
        for(int score : scores){
            if(score == 0){
                tally++;
            }
        }
        return tally;
    }
}
