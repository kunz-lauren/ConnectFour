/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour.menus;

import connectfour.ConnectFour;
import connectfour.DisclaimerMenuControl;
import static java.lang.Compiler.command;

/**
 *
 * @author laurenkorpacz
 */
public class DisclaimerMenuView {
    private final static String[][] choices = {
          
        {"T", "See disclaimer message"}     
    };    
    
    private DisclaimerMenuControl disclaimerMenuControl = new DisclaimerMenuControl();
    
    public DisclaimerMenuView() {
        
    } 

    public void getInput() {       
              
        String command;
                
        do {
            
            this.display(); // display the menu
            
            command = ConnectFour.input.nextLine();
            command = command.trim().toUpperCase();
            
        switch (command) {
            
            case "T":
                   // this.disclaimerMenuControl.displayWelcomemessage();
        case "Q": 
                    break;
                    
                default: 
                    this.disclaimerMenuControl.displayError();
                    continue;
        
        }
        }while (!command.equals("Q"));
           return;
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < DisclaimerMenuView.choices.length; i++) {
            System.out.println("\t   " + choices[i][0] + "\t" + choices[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
   
}


