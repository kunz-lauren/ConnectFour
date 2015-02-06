/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Scanner;

/**
 *
 * @author Keoni
 */
public class GameModeView {
    

    
    private final static String[][] helpItems = {
        {"1", "Pop Out"},
        {"2", "Pop 10"},   
        {"3", "5-in-a-Row"},
        {"4", "Power Up"},    
        {"Q", "Quit Help"}        
    };    
    
    // Create instance of the HelpMenuControl (action) class
    private GameModeControl GameModeControl = new GameModeControl();
    
    // default constructor
    public GameModeView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
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
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameModeView.helpItems.length; i++) {
            System.out.println("\t   " + helpItems[i][0] + "\t" + helpItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
