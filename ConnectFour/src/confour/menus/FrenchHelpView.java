/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.menus;

import confour.ConnectFour;
import confour.Menu;
import java.io.Serializable;
import java.util.Objects;

import confour.enums.FrenchHelp;

/**
 *
 * @author Davy
 */
public class FrenchHelpView extends Menu implements Serializable {

    private final static String[][] choices = {
        {"J: ", "Le Jeu"},  // Game
        {"R: ", "Joueur"},  // Player
        {"P: ", "Plateau"}, // Board
        {"C: ", "Colonne"}, // Column
        {"T: ", "Jeton"},   // Marker
        {"Q: ", "Quitter"}  // Quit French Menu
    };

    // Creates an instance of the frenchHelpMenuControl class
    FrenchHelpControl frenchHelpControl = new FrenchHelpControl();

    public FrenchHelpView() {
        super(FrenchHelpView.choices);
    }

    public void go() {

        String selection;

        do {

            this.display(); // display the french menu

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

     // Inner class
    class FrenchHelpControl implements connectfour.interfaces.HelpMenu {
        
        @Override
        public void afficheAideJeu() { // display game help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_GAME.getMessage());
            afficheAideBordureInférieure();
        }

        @Override
        public void afficheAideJoueur() { // display player help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_PLAYER.getMessage());
            afficheAideBordureInférieure();
        }

        @Override
        public void afficheAidePlateau() { // display board help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_COLUMN.getMessage());
            afficheAideBordureInférieure();
        }

        @Override
        public void afficheAideColonne() { // display column help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_MARKER.getMessage());
            afficheAideBordureInférieure();
        }

        @Override
        public void afficheAideJeton() { // display marker help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_MARKER.getMessage());
            afficheAideBordureInférieure();
        }

        @Override
        public void afficheAideBordureSupérieure() { // display top border help
            System.out.println(FrenchHelp.FRENCH_MENU_TOP_BORDER.getMessage());

        }

        @Override
        public void afficheAideBordureInférieure() { // display bottom border help
            System.out.println(FrenchHelp.FRENCH_MENU_BOTTOM_BORDER.getMessage());

        }

        @Override
        public void afficheErreur() { // display error    
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(FrenchHelp.FRENCH_MENU_ERROR.getMessage());
            afficheAideBordureInférieure();
        }
    }

    // Getters and Setters

    public FrenchHelpControl getFrenchHelpControl() {
        return frenchHelpControl;
    }

    public void setFrenchHelpControl(FrenchHelpControl frenchHelpControl) {
        this.frenchHelpControl = frenchHelpControl;
    }


    // equals function

    @Override
    public int hashCode() {
        int hash = 7;
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
        final FrenchHelpView other = (FrenchHelpView) obj;
        if (!Objects.equals(this.frenchHelpControl, other.frenchHelpControl)) {
            return false;
        }
        return true;
    }


    // toString function
    @Override
    public String toString() {
        return "FrenchHelpView{" + "choices=" + choices + ", frenchHelpControl=" + frenchHelpControl + '}';
    }

}
