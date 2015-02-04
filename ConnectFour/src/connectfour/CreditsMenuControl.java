/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author Davy
 */
public class CreditsMenuControl {
    
    public CreditsMenuControl() {
        
    } 

    public void displayLauren() {
        System.out.println();
        displayCreditsBorder();     
        System.out.println( 
                 "\tLauren Kunz is a web design major from Rexburg, Idaho. She is "
                         + "\n\tcurrently living in Provo while her husband attends BYU"
                         + "\n\t and she stays at home watching her one-year-old "
                         + "\n\tTommy and does lots and lots of Web Design Homework."
                ); 
        displayCreditsBorder();
    }

    public void displayTenille() {
        System.out.println();
        displayCreditsBorder();     
        System.out.println( 
                "\tTenille is a hard working mother of five currently living in "
                        + "\n\tUtah. She started out in the Pathway program and "
                        + "\n\t now she is thriving as a web development major."
                ); 
        displayCreditsBorder();
    }
    
    public void displayDavy() {
        System.out.println();
        displayCreditsBorder();             
        System.out.println( 
               "\tDavy, our French speaking team member was living in Las Vegas"
                 + "\n\t at the beginning of the semester but relocated to"
                 + "\n\tFrance the beginning of February! We were worried "
                 + "\n\t about how this might affect our team because Davy has been "
                 + "\n\ta huge help to us all but we are figuring "
                 + "\n\t it out through late nights on our part and"
                 + "\n\tearly mornings on his part.");
        displayCreditsBorder();
    }
    
    public void displayRen() {
        System.out.println();
        displayCreditsBorder();     
        System.out.println( 
               "\t Lauren Korpacz or as we call her, \"Ren \" is the newest member  "
                + "\n\tof our team. We are still getting to know her but we enjoy "
                + "\n\ther presence at our meetings and seeing her bright smiling face."
                );
        displayCreditsBorder();
    }    
        
    public void displayDaniel() {
        System.out.println();
        displayCreditsBorder();     
        System.out.println( 
               "\tDaniel is a smart, valuable member of our team. Not only does he"
                       + "\n\thave Java experience, he has actually programmed a "
                       + "\n\tgame before. We love learning from Daniel and hope "
                       + "\n\t some of his knowledge rubs off on us. He also plays"
                       + "\n\t a mean game of Quidditch."
                
              
                ); 
        displayCreditsBorder();
    }
      
    public void displayKeoni(){
        System.out.println();
        displayCreditsBorder();
        System.out.println(
                "\tKeoni is currently in Rexburg at BYU-Idaho but was raised in "
                        + "\n\tCalifornia. That's why you will see him pull knives"
                        + "\n\tout of nowhere. Don't worry, they're just for self"
                        + "\n\tdefense. In Keoni's free time he enjoys eating "
                        + "\n\tother people's bagels and speaking the native Hawaiian"
                        + "\n\tlanguage\'Pigeon\"");}
    public void displayCreditsBorder() {       
        System.out.println(
        "\t********************************************************************");
    }

    public void displayError() {       
        System.out.println();
        displayCreditsBorder();                     
        System.out.println("\tThis is an invalid selection. Please choose again.");
        displayCreditsBorder();             
    }
    
}
