/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.enums;

/**
 *
 * @author Davy
 */
public enum GameVariables {
    
    COLUMN_ONE (1),
    COLUMN_SIX (11),
    COUNTER (2),
    LOWER_EDGE (0),
    UPPER_EDGE (12);
    
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    private GameVariables (int number) {
        this.number = number;
    }
    
    
}
