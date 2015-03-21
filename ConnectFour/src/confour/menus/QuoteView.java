/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.menus;

import confour.ConnectFour;
import confour.QuoteControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tenille Diel
 */
public class QuoteView extends Menu implements Serializable{
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

  public QuoteView(){
  super(QuoteView.choices);
  }

    public QuoteControl getQuoteMenuControl() {
        return quoteMenuControl;
    }

    public void setQuoteMenuControl(QuoteControl quoteMenuControl) {
        this.quoteMenuControl = quoteMenuControl;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.quoteMenuControl);
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
        final QuoteView other = (QuoteView) obj;
        if (!Objects.equals(this.quoteMenuControl, other.quoteMenuControl)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuoteView{" + "quoteMenuControl=" + quoteMenuControl + '}';
    }
   
}
