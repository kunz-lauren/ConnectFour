/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Keoni AldedoJr
 */
public class RulesControl {
    
    String rule1;
    
    String rule2;
    
    String rule3;
    
    String rule4;
    
    String rule5;
    
    String rule6;
    
    String rule7;
    
    RulesControl(){
     rule1 = "1. A player can only play one piece per turn.";
     
     rule2 = "2. Players must alternate turns.";
     
     rule3 = "3. Player picks a color and uses only that color for the whole game.";
     
     rule4 = "4. Player to get four of their pieces in a row (either horizontal, vertical, or diagonal) wins the game.";
     
     rule5 = "5. If all pieces are used and no player has four in a row, the game ends in a tie.";
     
     rule6 = "6. All pieces drop to the lowest open space in the column.";
     
     rule7 = "7. Only one piece is allowed per space.";
        
    }

    void display() {
        System.out.println(rule1 + "\n" +
                           rule2 + "\n" +
                           rule3 + "\n" + 
                           rule4 + "\n" + 
                           rule5 + "\n" + 
                           rule6 + "\n" + 
                           rule7);
    }
    
}
