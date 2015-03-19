/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import confour.ConnectFour;
import confour.GameModeControl;
import confour.Menu;

/**
 *
 * @author Keoni
 */
public class GameModeView extends Menu{
    

    
    private final static String[][] choices = {
        {"1", "Pop Out"},
        {"2", "Pop 10"},   
        {"3", "5-in-a-Row"},
        {"4", "Power Up"},    
        {"Q", "Quit Help"}        
    };    
    
    // Create instance of the HelpMenuControl (action) class
    private GameModeControl GameModeControl = new GameModeControl();
    
    // display the help menu and get the end users input selection

    public void go() {       
              
        String command;
        
        // if the program doesn run, this is what we should fix
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = ConnectFour.input.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.GameModeControl.displayPopOut();
                    break;
                    
                case "2":
                    this.GameModeControl.displayPopTen();
                    break;                     
                
                case "3":
                    this.GameModeControl.displayFiveInARow();
                    break;
                    
                case "4":
                    this.GameModeControl.displayPowerUp();
                    break;                   
                    
                case "Q": 
                    break;
                    
                default: 
                    this.GameModeControl.displayError();
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    public GameModeView(){
    super (GameModeView.choices);
    }
  
}

