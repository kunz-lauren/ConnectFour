/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author 
 */
public class CreditsView {
    

    
    private final static String[][] creditsItems = {
        {"L", "Lauren Kunz"},
        {"T", "Tenille Diel"},   
        {"D", "Davy Garaix"},
        {"R", "Lauren \"Ren\" Korpacz"},
        {"B", "Daniel Barton"}, 
        {"K", "Keoni Aledo"},
        {"Q", "Quit Help"}        
    };    
    
    // Create instance of the HelpMenuControl (action) class
    private CreditsControl creditsMenuControl = new CreditsControl();
    
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
                case "L":
                    this.creditsMenuControl.displayLauren();
                    break;
                    
                case "T":
                    this.creditsMenuControl.displayTenille();
                    break;                     
                
                case "D":
                    this.creditsMenuControl.displayDavy();
                    break;
                    
                case "R":
                    this.creditsMenuControl.displayRen();
                    break;                   
                    
                case "B":
                    this.creditsMenuControl.displayDaniel();
                    break;
                    
                case "K":
                    this.creditsMenuControl.displayKeoni();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.creditsMenuControl.displayError();
            }
        } while (!command.equals("Q"));
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < CreditsView.creditsItems.length; i++) {
            System.out.println("\t   " + creditsItems[i][0] + "\t" + creditsItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
