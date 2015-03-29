/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import connectfour.exceptions.connectFourExceptions;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Davy
 */
public class ExceptionFunDavy {

    public static void main(String[] args) throws connectFourExceptions {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a character");

        try {
            while (input.nextInt() != -1);
        }
        
        catch (InputMismatchException e) {
                System.out.println("Oh, I'm sorry. I meant please enter a number");
        }   
        
        catch (Exception e) {
                System.out.println("This is an exception I wasn't expecting");
                System.out.println(e);
        }
        
        finally {
                System.out.println("Thanks for playing!");
            }
        }
    }