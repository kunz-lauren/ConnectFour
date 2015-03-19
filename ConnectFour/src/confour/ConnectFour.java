/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour;

import confour.enums.GameVariables;
import confour.menus.RulesView;
import confour.menus.QuoteView;
import confour.menus.HelpView;
import confour.menus.FrenchHelpView;
import confour.menus.DisclaimerView;
import confour.menus.CreditsView;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Daniel
 */
public class ConnectFour implements Serializable {
    public static Scanner input = new Scanner(System.in);
        
    /***************Add all views here*********************/
    private GameView game = new GameView();
    private RulesView rules = new RulesView();
    private HelpView help = new HelpView();
    private FrenchHelpView aider = new FrenchHelpView();
    private GameModeView gameMode = new GameModeView();
    private QuoteView quote = new QuoteView();
    private CreditsView credits = new CreditsView();
    private DisclaimerView disclamer = new DisclaimerView();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.mainMenu();
    }
    
    private void mainMenu(){
        String menuOption = "";
        while(!menuOption.equals("10")){
            System.out.println("Select an option:");
            System.out.println("1) Single player game"
                            +"\n2) Two player game"
                            +"\n3) Rules"
                            +"\n4) Help"
                            +"\n5) Help-French"
                            +"\n6) Game-Mode"
                            +"\n7) Quote of the Day"
                            +"\n8) Credit"
                            +"\n9) Disclaimer"
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
    public ConnectFour(){
    
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        ConnectFour.input = input;
    }

    public GameView getGame() {
        return game;
    }

    public void setGame(GameView game) {
        this.game = game;
    }

    public RulesView getRules() {
        return rules;
    }

    public void setRules(RulesView rules) {
        this.rules = rules;
    }

    public HelpView getHelp() {
        return help;
    }

    public void setHelp(HelpView help) {
        this.help = help;
    }

    public FrenchHelpView getAider() {
        return aider;
    }

    public void setAider(FrenchHelpView aider) {
        this.aider = aider;
    }

    public GameModeView getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameModeView gameMode) {
        this.gameMode = gameMode;
    }

    public QuoteView getQuote() {
        return quote;
    }

    public void setQuote(QuoteView quote) {
        this.quote = quote;
    }

    public CreditsView getCredits() {
        return credits;
    }

    public void setCredits(CreditsView credits) {
        this.credits = credits;
    }

    public DisclaimerView getDisclamer() {
        return disclamer;
    }

    public void setDisclamer(DisclaimerView disclamer) {
        this.disclamer = disclamer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.game);
        hash = 41 * hash + Objects.hashCode(this.rules);
        hash = 41 * hash + Objects.hashCode(this.help);
        hash = 41 * hash + Objects.hashCode(this.aider);
        hash = 41 * hash + Objects.hashCode(this.gameMode);
        hash = 41 * hash + Objects.hashCode(this.quote);
        hash = 41 * hash + Objects.hashCode(this.credits);
        hash = 41 * hash + Objects.hashCode(this.disclamer);
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
        final ConnectFour other = (ConnectFour) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.rules, other.rules)) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        if (!Objects.equals(this.aider, other.aider)) {
            return false;
        }
        if (!Objects.equals(this.gameMode, other.gameMode)) {
            return false;
        }
        if (!Objects.equals(this.quote, other.quote)) {
            return false;
        }
        if (!Objects.equals(this.credits, other.credits)) {
            return false;
        }
        if (!Objects.equals(this.disclamer, other.disclamer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConnectFour{" + "game=" + game + ", rules=" + rules + ", help=" + help + ", aider=" + aider + ", gameMode=" + gameMode + ", quote=" + quote + ", credits=" + credits + ", disclamer=" + disclamer + '}';
    }
    
}
