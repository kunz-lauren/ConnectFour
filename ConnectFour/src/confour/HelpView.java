/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Davy
 */
public class HelpView{
    private final static String[][] helpItems = {
        {"G", "The game"},
        {"P", "A regular player"},   
        {"B", "The board"},
        {"C", "A column"},
        {"M", "A marker"},     
        {"Q", "Quit Help"}        
    };    
    
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
    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for(int i = 0; i < HelpView.helpItems.length; i++) {
            System.out.println("\t   " + helpItems[i][0] + "\t" + helpItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
