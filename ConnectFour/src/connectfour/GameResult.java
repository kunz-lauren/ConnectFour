/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author laurenkunz
 */
public class GameResult {
    //instance variables
    String name="winner";
    String winner="Great job!";
 
      void displayWinner() {
        System.out.println("The winner is"+ this.name );

      }
}
