/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;
import connectfour.ManyExceptions;
import static connectfour.ConnectFour.input;
import java.util.Scanner;

/**
 *
 * @author laurenkorpacz
 */
public class RensException {
  public static void main(String[] args) throws ManyExceptions {
 
    try {
      long data[] = new long[1000000000]; 
    }
    catch (Exception e) {
      System.out.println(e);
    }
 
    finally {
      System.out.println("finally block will execute always.");
    }
  }
}
