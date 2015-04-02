/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.enums;

/**
 *
 * @author Davy
 */
public enum FrenchHelp {
    
    FRENCH_MENU_GAME ("L'objectif du jeu est d'être le premier"
                    + " joueur à connecter quatre jetons"
                    + " verticalement, horizontalement ou en diagonale."),
    FRENCH_MENU_PLAYER ("Les joueurs prennent chaqun leur tour"
                    + " pour placer un jeton sur le plateau"
                    + " afin de prévenir l'autre de gagner."),
    FRENCH_MENU_BOARD ("Le plateau de jeu consiste d'une grille"
                    + " d'emplacements de 6 colonnes par 6 rangées."),
    FRENCH_MENU_COLUMN ("Il y a 6 colonnes de disponible."
                    + " Lorsqu'un joueur sélectionne une colonne,"
                    + " le jeton est placé dans l'espace le plus bas"
                    + " qui n'est pas déjà occupé par un autre jeton."),
    FRENCH_MENU_MARKER ("Un jeton est une piece de jeu qui peux occuper"
                    + " un espace dans le plateau."
                    + " Il existe deux types de jeton, un pour chaque joueur."),
    FRENCH_MENU_TOP_BORDER ("        .-.     .-.     .-.     .-.     .-.     .-."
                    + "\n      .'   `._.'   `._.'   `._.'   `._.'   `._.'   `."),
    FRENCH_MENU_BOTTOM_BORDER ("      .     .-.     .-.     .-.     .-.     .-.     ."
                    + "\n       `._.'   `._.'   `._.'   `._.'   `._.'   `._.'"
                    + "\n"),
    FRENCH_MENU_ERROR ("Cette sélection n'existe pas."
                    + "\nVeuillez choisir à nouveau.")
    
    ;
    
    String message;

    // Getters and Setters for each ENUM types
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
    
    // Overloaded constructors for each ENUM types
    private FrenchHelp (String message) {
        this.message = message;
    }

}
