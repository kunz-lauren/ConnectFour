/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour.menus;

import connectfour.ConnectFour;
import connectfour.FrenchHelpMenuControl;

/**
 *
 * @author Davy Garaix
 */
public class FrenchHelpMenuView {
    
    String elementsAide = "\tJ: Le Jeu" // Game
            + "\tR: Joueur" // Player
            + "\tP: Plateau" // Board
            + "\n\tC: Colonne" // Column
            + "\tT: Jeton" // Marker
            + "\tQ: Quitter"; // Quit French Menu
    
    // Creates an instance of the frenchHelpMenuControl class
    FrenchHelpMenuControl frenchHelpMenuControl = new FrenchHelpMenuControl();

    // default constructor
    public FrenchHelpMenuView() {
        
    }
    
    public void getInput() {       
              
        String selection;
        
        do {
            
            this.affiche(); // display the french menu
            
            // get commaned entered
            selection = ConnectFour.input.nextLine();
            selection = selection.trim().toUpperCase();
            
            switch (selection) {
                case "J":
                    this.frenchHelpMenuControl.afficheAideJeu();
                    break;
                    
                case "R":
                    this.frenchHelpMenuControl.afficheAideJoueur();
                    break;                     
                
                case "P":
                    this.frenchHelpMenuControl.afficheAidePlateau();
                    break;
                    
                case "C":
                    this.frenchHelpMenuControl.afficheAideColonne();
                    break;                   
                    
                case "T":
                    this.frenchHelpMenuControl.afficheAideJeton();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.frenchHelpMenuControl.afficheErreur();
                    continue;
            }
        } while (!selection.equals("Q"));  
        
         return;
    }
    
    public final void affiche() {
        this.frenchHelpMenuControl.afficheAideBordureSupérieure();
        System.out.println(elementsAide);
        System.out.println("\tEntrez la lettre indiquant votre sélection");
        this.frenchHelpMenuControl.afficheAideBordureInférieure();
    }
    
}
