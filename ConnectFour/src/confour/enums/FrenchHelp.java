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
    
    FRENCH_MENU_GAME ("\tL'objectif du jeu est d'être le premier"
                    + "\n\tjoueur à connecter quatre jetons"
                    + "\n\tverticalement, horizontalement ou en diagonale."),
    FRENCH_MENU_PLAYER ("\tLes joueurs prennent chaqun leur tour"
                    + "\n\tpour placer un jeton sur le plateau"
                    + "\n\tafin de prévenir l'autre de gagner."),
    FRENCH_MENU_BOARD ("\tLe plateau de jeu consiste d'une grille"
                    + "\n\td'emplacements de 6 colonnes par 6 rangées."),
    FRENCH_MENU_COLUMN ("\tIl y a 6 colonnes de disponible."
                    + "\n\tLorsqu'un joueur sélectionne une colonne,"
                    + "\n\tle jeton est placé dans l'espace le plus bas"
                    + "\n\tqui n'est pas déjà occupé par un autre jeton."),
    FRENCH_MENU_MARKER ("\tUn jeton est une piece de jeu qui peux occuper"
                    + "\n\tun espace dans le plateau."
                    + "\n\tIl existe deux types de jeton, un pour chaque joueur."),
    FRENCH_MENU_TOP_BORDER ("        .-.     .-.     .-.     .-.     .-.     .-."
                    + "\n      .'   `._.'   `._.'   `._.'   `._.'   `._.'   `."),
    FRENCH_MENU_BOTTOM_BORDER ("      .     .-.     .-.     .-.     .-.     .-.     ."
                    + "\n       `._.'   `._.'   `._.'   `._.'   `._.'   `._.'"
                    + "\n"),
    FRENCH_MENU_ERROR ("\tCette sélection n'existe pas."
                    + "\n\tVeuillez choisir à nouveau.")
    
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
