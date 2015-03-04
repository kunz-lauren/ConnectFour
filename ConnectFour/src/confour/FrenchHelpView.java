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
public class FrenchHelpView {
    String elementsAide = "\tJ: Le Jeu" // Game
            + "\tR: Joueur" // Player
            + "\tP: Plateau" // Board
            + "\n\tC: Colonne" // Column
            + "\tT: Jeton" // Marker
            + "\tQ: Quitter"; // Quit French Menu
    
    // Creates an instance of the frenchHelpMenuControl class
    FrenchHelpControl frenchHelpControl = new FrenchHelpControl();
    
    public void go() {       
              
        String selection;
        
        do {
            
            this.affiche(); // display the french menu
            
            // get commaned entered
            selection = ConnectFour.input.nextLine();
            selection = selection.trim().toUpperCase();
            
            switch (selection) {
                case "J":
                    this.frenchHelpControl.afficheAideJeu();
                    break;
                    
                case "R":
                    this.frenchHelpControl.afficheAideJoueur();
                    break;                     
                
                case "P":
                    this.frenchHelpControl.afficheAidePlateau();
                    break;
                    
                case "C":
                    this.frenchHelpControl.afficheAideColonne();
                    break;                   
                    
                case "T":
                    this.frenchHelpControl.afficheAideJeton();
                    break;
                    
                case "Q": 
                    break;
                    
                default: 
                    this.frenchHelpControl.afficheErreur();
            }
        } while (!selection.equals("Q"));
    }
    
    private final void affiche() {
        this.frenchHelpControl.afficheAideBordureSupérieure();
        System.out.println(elementsAide);
        System.out.println("\tEntrez la lettre indiquant votre sélection");
        this.frenchHelpControl.afficheAideBordureInférieure();
    }
}
