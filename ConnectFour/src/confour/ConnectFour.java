/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ConnectFour {
    public static Scanner input = new Scanner(System.in);
        
    /***************Add all views here*********************/
    GameView game = new GameView();
    RulesView rules = new RulesView();
    HelpView help = new HelpView();
    FrenchHelpView aider = new FrenchHelpView();
    GameModeView gameMode = new GameModeView();
    QuoteView quote = new QuoteView();
    CreditsView credits = new CreditsView();
    DisclaimerView disclamer = new DisclaimerView();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.mainMenu();
    }
    
    public void mainMenu(){
        String menuOption = "";
        while(!menuOption.equals("10")){
            System.out.println("Select an option:");
            System.out.println("1) Single player game"
                            +"\n2) 2 player game"
                            +"\n3) Rules"
                            +"\n4) Help"
                            +"\n5) Help-French"
                            +"\n6) Game-Mode"
                            +"\n7) Quote of the Day"
                            +"\n8) Credit"
                            +"\n9) Disclamer"
                            +"\n10) Exit");
            System.out.print(">");
            menuOption = input.nextLine();
            switch (menuOption){
                case "1":
                    game.play(1);
                    break;
                case "2":
                    game.play(2);
                    break;
                case "3":
                    rules.go();
                    break;
                case "4":
                    help.go();
                    break;
                case "5":
                    aider.go();
                    break;
                case "6":
                    gameMode.go();
                    break;
                case "7":
                    quote.go();
                    break;
                case "8":
                    credits.go();
                    break;
                case "9":
                    disclamer.go();
                    break;
            }
        }
    }
}
