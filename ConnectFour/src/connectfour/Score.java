/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.ArrayList;

/**
 *
 * @author laurenkorpacz
 */
public class Score {

    ArrayList<Integer> redStats = new ArrayList<Integer>();
    ArrayList<Integer> blackStats = new ArrayList<Integer>();
    
    Score(){
        redStats.add(1);
        redStats.add(0);
        redStats.add(1);
        redStats.add(0);
        redStats.add(1);
        redStats.add(0);
        redStats.add(1);
        redStats.add(0);
        
        blackStats.add(0);
        blackStats.add(1);
        blackStats.add(0);
        blackStats.add(1);
        blackStats.add(0);
        blackStats.add(1);
        blackStats.add(0);
        blackStats.add(1);
        
    }

    public void scoreStore(String winner) {

        winner = winner.toLowerCase();
        switch (winner) {
            case "red":
                redStats.add(1);
                blackStats.add(0);
                System.out.println("Congratulations Red Team!");
                break;

            case "black":
                redStats.add(0);
                blackStats.add(1);
                System.out.println("Congratulations Black Team");
                break;

            default:
                System.out.println("Invalid Team. Please use red or black.");
        }
        scoreSort(redStats);
        scoreSort(blackStats);
    }

    public void scoreSort(ArrayList<Integer> list) {
        int i, j, first, temp;
        for (i = list.size() - 1; i > 0; i --) {
            first = 0; //initialize to subscript of first element
            for (j = 1; j <= i; j++) //locate smallest element between positions 1 and i.
            {
                
                if (list.get(j) < list.get(first)) {
                    first = j;
                }
            }
            temp = list.get(first); //swap smallest found with element in position i.
            list.set(first,list.get(i));
            list.set(i,temp);
        }
        for(int k = 0; k < list.size(); k++){
            System.out.print(list.get(k)+" ");
        }
        System.out.println();
    }
}
