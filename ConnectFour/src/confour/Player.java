/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Daniel
 */
public class Player implements Serializable {
    private String name;
    private ArrayList<Integer> scores = new ArrayList<Integer>();
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
    public Player() {
    
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.scores);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.scores, other.scores)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", scores=" + scores + '}';
    }
    
}
