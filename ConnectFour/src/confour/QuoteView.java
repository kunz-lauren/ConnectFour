/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

/**
 *
 * @author Tenille Diel
 */
public class QuoteView {
    private final static String[][] choices = {
        {"S", "See the Sunday quote"},
        {"M", "See the Monday quote"},   
        {"T", "See the Tuesday quote"},
        {"W", "See the Wednesday quote"},
        {"R", "See the Thursday quote"},
        {"F", "See the Friday quote"}, 
        {"Y", "See the Saturday quote"}, 
        {"Q", "Quit Quotes Menu"}        
    };    
    
    private QuoteControl quoteMenuControl = new QuoteControl();

    public void go() {       
              
        String command;
                
        do {
            
            this.display(); // display the menu
            
            command = ConnectFour.input.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "S":
                    this.quoteMenuControl.displaySundayQuote();
                    break;
                    
                case "M":
                    this.quoteMenuControl.displayMondayQuote();
                    break;                     
                
                case "T":
                    this.quoteMenuControl.displayTuesdayQuote();
                    break;
                    
                case "W":
                    this.quoteMenuControl.displayWednesdayQuote();
                    break;                   
                    
                case "R":
                    this.quoteMenuControl.displayThursdayQuote();
                    break;
                    
                case "F":
                    this.quoteMenuControl.displayFridayQuote();
                    break;    
                    
                case "Y":
                    this.quoteMenuControl.displaySaturdayQuote();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.quoteMenuControl.displayError();
            }
        } while (!command.equals("Q"));  
    }

    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < QuoteView.choices.length; i++) {
            System.out.println("\t   " + choices[i][0] + "\t" + choices[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
   
}
