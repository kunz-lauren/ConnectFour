/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Random;

/**
 *
 * @author Daniel
 */
public class Computer {
    public int easyMode(){
        Random num = new Random();
        return num.nextInt(6)+1;
    }
}
