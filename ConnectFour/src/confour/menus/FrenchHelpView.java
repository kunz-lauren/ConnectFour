/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.menus;

import confour.ConnectFour;
import java.io.Serializable;
import java.util.Objects;

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
    class FrenchHelpControl {

        private void afficheAideJeu() { // display game help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(
                    "\tL'objectif du jeu est d'être le premier"
                    + "\n\tjoueur à connecter quatre jetons"
                    + "\n\tverticalement, horizontalement ou en diagonale."
            );
            afficheAideBordureInférieure();
        }

        private void afficheAideJoueur() { // display player help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(
                    "\tLes joueurs prennent chaqun leur tour"
                    + "\n\tpour placer un jeton sur le plateau"
                    + "\n\tafin de prévenir l'autre de gagner."
            );
            afficheAideBordureInférieure();
        }

        private void afficheAidePlateau() { // display board help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(
                    "\tLe plateau de jeu consiste d'une grille"
                    + "\n\td'emplacements de 6 colonnes par 6 rangées.");
            afficheAideBordureInférieure();
        }

        private void afficheAideColonne() { // display column help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(
                    "\tIl y a 6 colonnes de disponible."
                    + "\n\tLorsqu'un joueur sélectionne une colonne,"
                    + "\n\tle jeton est placé dans l'espace le plus bas"
                    + "\n\tqui n'est pas déjà occupé par un autre jeton."
            );
            afficheAideBordureInférieure();
        }

        private void afficheAideJeton() { // display marker help
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println(
                    "\tUn jeton est une piece de jeu qui peux occuper"
                    + "\n\tun espace dans le plateau."
                    + "\n\tIl existe deux types de jeton, un pour chaque joueur."
            );
            afficheAideBordureInférieure();
        }

        private void afficheAideBordureSupérieure() { // display top border help
            System.out.println(
                    "        .-.     .-.     .-.     .-.     .-.     .-."
                    + "\n      .'   `._.'   `._.'   `._.'   `._.'   `._.'   `.");

        }

        private void afficheAideBordureInférieure() { // display bottom border help
            System.out.println(
                    "      .     .-.     .-.     .-.     .-.     .-.     ."
                    + "\n       `._.'   `._.'   `._.'   `._.'   `._.'   `._.'"
                    + "\n");

        }

        private void afficheErreur() { // display error    
            System.out.println();
            afficheAideBordureSupérieure();
            System.out.println("\tCette sélection n'existe pas."
                    + "\n\tVeuillez choisir à nouveau.");
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
