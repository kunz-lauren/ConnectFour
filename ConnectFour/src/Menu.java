


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Menu implements confour.interfaces.DisplayInfo, confour.interfaces.EnterInfo{
    private String[][] choices = null;
    
    public Menu(){}
    
    public Menu(String[][] choices){
        this.choices = choices;
    }
    
    public void display(){
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < choices.length; i++) {
            System.out.println("\t   " + choices[i][0] + "\t" + choices[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
