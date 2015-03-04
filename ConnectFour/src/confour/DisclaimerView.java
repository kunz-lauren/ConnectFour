/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Lauren Korpacz
 */
public class DisclaimerView {
    private final static String[][] choices = {
          
        {"T", "See disclaimer message"}     
    };    
    
    private DisclaimerControl disclaimerMenuControl = new DisclaimerControl();

    public void go() {       
              
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
        
        }
        }while (!command.equals("Q"));
           
    }

    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < DisclaimerView.choices.length; i++) {
            System.out.println("\t   " + choices[i][0] + "\t" + choices[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
   
}

