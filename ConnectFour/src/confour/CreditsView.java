/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import confour.interfaces.ErrorMessage;
import java.io.Serializable;

/**
 *
 * @author 
 */
public class CreditsView extends Menu implements Serializable {
    
    
    private final static String[][] choices = {
        {"L", "Lauren Kunz"},
        {"T", "Tenille Diel"},   
        {"D", "Davy Garaix"},
        {"R", "Lauren \"Ren\" Korpacz"},
        {"B", "Daniel Barton"}, 
        {"K", "Keoni Aledo"},
        {"Q", "Quit Help"}        
    };    
     private enum Message{
        Lauren("\tLauren Kunz is a web design major from Rexburg, Idaho. She is "
                         + "\n\tcurrently living in Provo while her husband attends BYU"
                         + "\n\t and she stays at home watching her one-year-old "
                         + "\n\tTommy and does lots and lots of Web Design Homework."),
        Tenille("\tTenille is a hard working mother of five currently living in "
                        + "\n\tUtah. She started out in the Pathway program and "
                        + "\n\t now she is thriving as a web development major."),
        Davy( "\tDavy, our French speaking team member was living in Las Vegas"
                 + "\n\t at the beginning of the semester but relocated to"
                 + "\n\tFrance the beginning of February! We were worried "
                 + "\n\t about how this might affect our team because Davy has been "
                 + "\n\ta huge help to us all but we are figuring "
                 + "\n\t it out through late nights on our part and"
                 + "\n\tearly mornings on his part."),
        Ren(   "\t Lauren Korpacz or as we call her, \"Ren \" is the newest member  "
                + "\n\tof our team. We are still getting to know her but we enjoy "
                + "\n\ther presence at our meetings and seeing her bright smiling face."),
        Daniel( "\tDaniel is a smart, valuable member of our team. Not only does he"
                       + "\n\thave Java experience, he has actually programmed a "
                       + "\n\tgame before. We love learning from Daniel and hope "
                       + "\n\t some of his knowledge rubs off on us. He also plays"
                       + "\n\t a mean game of Quidditch."),
        Keoni(    "\tKeoni is currently in Rexburg at BYU-Idaho but was raised in "
                        + "\n\tCalifornia. That's why you will see him pull knives"
                        + "\n\tout of nowhere. Don't worry, they're just for self"
                        + "\n\tdefense. In Keoni's free time he enjoys eating "
                        + "\n\tother people's bagels and speaking the native Hawaiian"
                        + "\n\tlanguage\'Pigeon\"");
        
        String message;
        Message(String message){
            this.message=message;
        }
        
    }
    // Create instance of the HelpMenuControl (action) class
    private CreditsControl creditsMenuControl = new CreditsControl();
    
    public CreditsView(){
        super(CreditsView.choices);
    }
    
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
                    this.creditsMenuControl.displayLauren(Message.Lauren);
                    break;
                    
                case "T":
                    this.creditsMenuControl.displayTenille(Message.Tenille);
                    break;                     
                
                case "D":
                    this.creditsMenuControl.displayDavy(Message.Davy);
                    break;
                    
                case "R":
                    this.creditsMenuControl.displayRen(Message.Ren);
                    break;                   
                    
                case "B":
                    this.creditsMenuControl.displayDaniel(Message.Daniel);
                    break;
                    
                case "K":
                    this.creditsMenuControl.displayKeoni(Message.Keoni);
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.creditsMenuControl.displayError();
            }
        } while (!command.equals("Q"));
    }

        // displays the help menu
   
  class CreditsControl implements ErrorMessage{
   
    private void displayLauren(Message message) {
        System.out.println();
        displayCreditsBorder();     
        System.out.println(message); 
        displayCreditsBorder();
    }
    

    private void displayTenille(Message message) {
        System.out.println();
        displayCreditsBorder();     
        System.out.println(message); 
        displayCreditsBorder();
    }
    
    private void displayDavy(Message message) {
        System.out.println();
        displayCreditsBorder();             
        System.out.println(message);
        displayCreditsBorder();
    }
    
    private void displayRen(Message message) {
        System.out.println();
        displayCreditsBorder();     
        System.out.println(message);
        displayCreditsBorder();
    }    
        
    private void displayDaniel(Message message) {
        System.out.println();
        displayCreditsBorder();     
        System.out.println(message); 
        displayCreditsBorder();
    }
      
    private void displayKeoni(Message message){
        System.out.println();
        displayCreditsBorder();
        System.out.println(message);}
    private void displayCreditsBorder() {       
        System.out.println(
        "\t********************************************************************");
    }
    @Override
    public Object displayError() {       
        System.out.println();
        displayCreditsBorder();                     
        System.out.println("\tThis is an invalid selection. Please choose again.");
        displayCreditsBorder();         
        return null;
   
    }

        private CreditsControl() {
        }

        @Override
        public String toString() {
            return "CreditsControl{" + '}';
        }
        
       
        
    
}
}
