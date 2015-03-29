/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;


import connectfour.exceptions.MoreExceptions;
import java.util.Scanner;

/**
 *
 * @author Tenille Diel
 */
public class MyExceptions {
    public static void main(String[] args) throws MoreExceptions {
    
        Scanner input = new Scanner(System.in);

        System.out.println("What number am I thinking of?");
        try {
            
            int value = input.nextInt();
            if (value == 7) {
            System.out.println("You guessed correctly!");
            } else {
                System.out.println("You got it wrong!");
            }
                
        }
        
        catch (Exception e) {
                System.out.println("That is not what I wanted!" + e);
        }
        
        finally {
                System.out.println("That was fun!");
            }
        }
    }

