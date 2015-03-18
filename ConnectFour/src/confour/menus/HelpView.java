/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.menus;

import confour.ConnectFour;
import confour.HelpControl;
import confour.Menu;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Davy
 */
public class HelpView extends Menu implements Serializable{
    private final static String[][] choices = {
        {"G", "The game"},
        {"P", "A regular player"},   
        {"B", "The board"},
        {"C", "A column"},
        {"M", "A marker"},     
        {"Q", "Quit Help"}        
    };    
    
    public HelpView(){
    super(HelpView.choices);
    }
    // Create instance of the HelpMenuControl (action) class
   
    private HelpControl helpControl = new HelpControl();
        
    // display the help menu and get the end users input selection

    public void go(){       
              
        String command;
        
        do{
            
            this.display(); // display the menu
            
            // get commaned entered
            command = ConnectFour.input.nextLine().trim().toUpperCase();
            
            switch (command){
                case "G":
                    this.helpControl.displayGameHelp();
                    break;
                    
                case "P":
                    this.helpControl.displayPlayerHelp();
                    break;                     
                
                case "B":
                    this.helpControl.displayBoardHelp();
                    break;
                    
                case "C":
                    this.helpControl.displayColumnHelp();
                    break;                   
                    
                case "M":
                    this.helpControl.displayMarkerHelp();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.helpControl.displayError();
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    

    public HelpControl getHelpControl() {
        return helpControl;
    }

    public void setHelpControl(HelpControl helpControl) {
        this.helpControl = helpControl;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.helpControl);
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
        final HelpView other = (HelpView) obj;
        if (!Objects.equals(this.helpControl, other.helpControl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HelpView{" + "helpControl=" + helpControl + '}';
    }
    
}
