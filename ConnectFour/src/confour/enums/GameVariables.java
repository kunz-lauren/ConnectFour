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
    UPPER_EDGE (12),
    EMPTY_SPACE (" ");
    
    int number;
    String message;

    // Getters and Setters for each ENUM types
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    // Overloaded constructors for each ENUM types
    private GameVariables (int number) {
        this.number = number;
    }

    private GameVariables (String message) {
        this.message = message;
    }
    
    
}
