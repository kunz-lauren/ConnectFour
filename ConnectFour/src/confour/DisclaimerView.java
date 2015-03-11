/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lauren Korpacz
 */
public class DisclaimerView implements Serializable {
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

    public DisclaimerView() {
    }

    public DisclaimerControl getDisclaimerMenuControl() {
        return disclaimerMenuControl;
    }

    public void setDisclaimerMenuControl(DisclaimerControl disclaimerMenuControl) {
        this.disclaimerMenuControl = disclaimerMenuControl;
    }

    @Override
    public String toString() {
        return "DisclaimerView{" + "disclaimerMenuControl=" + disclaimerMenuControl + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.disclaimerMenuControl);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DisclaimerView other = (DisclaimerView) obj;
        if (!Objects.equals(this.disclaimerMenuControl, other.disclaimerMenuControl)) {
            return false;
        }
        return true;
    }
    
    

    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < DisclaimerView.choices.length; i++) {
            System.out.println("\t   " + choices[i][0] + "\t" + choices[i][1]);
        }
        System.out.println("\t===============================================================\n");
    
    
    
    }

    
   
}

