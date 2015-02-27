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
public class FrenchHelpControl {
    public void afficheAideJeu() { // display game help
        System.out.println();
        afficheAideBordureSupérieure();     
        System.out.println( 
                 "\tL'objectif du jeu est d'être le premier"
                + "\n\tjoueur à connecter quatre jetons"
                + "\n\tverticalement, horizontalement ou en diagonale."
                ); 
        afficheAideBordureInférieure();
    }

    public void afficheAideJoueur() { // display player help
        System.out.println();
        afficheAideBordureSupérieure();     
        System.out.println( 
                "\tLes joueurs prennent chaqun leur tour"
                + "\n\tpour placer un jeton sur le plateau"
                + "\n\tafin de prévenir l'autre de gagner."
                ); 
        afficheAideBordureInférieure();
    }
    
    public void afficheAidePlateau() { // display board help
        System.out.println();
        afficheAideBordureSupérieure();             
        System.out.println( 
                "\tLe plateau de jeu consiste d'une grille"
                + "\n\td'emplacements de 6 colonnes par 6 rangées.");
        afficheAideBordureInférieure();
    }
    
    public void afficheAideColonne() { // display column help
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
        
    public void afficheAideJeton() { // display marker help
        System.out.println();
        afficheAideBordureSupérieure();     
        System.out.println( 
               "\tUn jeton est une piece de jeu qui peux occuper"
                + "\n\tun espace dans le plateau."
                + "\n\tIl existe deux types de jeton, un pour chaque joueur."
                ); 
        afficheAideBordureInférieure();
    }
            
    public void afficheAideBordureSupérieure() { // display top border help
        System.out.println(
        "        .-.     .-.     .-.     .-.     .-.     .-."
        + "\n      .'   `._.'   `._.'   `._.'   `._.'   `._.'   `.");
        
    }
    
    public void afficheAideBordureInférieure() { // display bottom border help
        System.out.println(
        "      .     .-.     .-.     .-.     .-.     .-.     ."
        + "\n       `._.'   `._.'   `._.'   `._.'   `._.'   `._.'"
        + "\n");
        
    } 

    public void afficheErreur() { // display error    
        System.out.println();
        afficheAideBordureSupérieure();              
        System.out.println("\tCette sélection n'existe pas."
                + "\n\tVeuillez choisir à nouveau.");
        afficheAideBordureInférieure();             
    }
}
