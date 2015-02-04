/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Scanner;

/**
 *
 * @author Davy
 */
public class HelpMenuView {
    

    
    private final static String[][] helpItems = {
        {"G", "The game"},
        {"P", "A regular player"},   
        {"B", "The board"},
        {"C", "A column"},
        {"M", "A marker"},     
        {"Q", "Quit Help"}        
    };    
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
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
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                    
                case "P":
                    this.helpMenuControl.displayPlayerHelp();
                    break;                     
                
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                    
                case "C":
                    this.helpMenuControl.displayColumnHelp();
                    break;                   
                    
                case "M":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.helpMenuControl.displayError();
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.helpItems.length; i++) {
            System.out.println("\t   " + helpItems[i][0] + "\t" + helpItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
