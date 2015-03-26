/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import connectfour.exceptions.connectFourExceptions;

/**
 *
 * @author Daniel
 */
public class ExceptionTesting{
    public static void main(String[] args) throws connectFourExceptions{
       ExceptionTesting test = new ExceptionTesting();
       test.testingGrounds();
    }
    
    private void testingGrounds() throws connectFourExceptions{
        int i = 0;
        String practice = "1";
        while( i != -1){
            try{
                int j = 0;
                j = Integer.parseInt(practice);
                if(j == 6){
                    practice = "a";
                }else{
                    practice = "" + j++;
                }
                i = j;
                
            } catch(Exception e){
                throw new connectFourExceptions("Error");
            } finally{
                testingGrounds();
            }
        }
    }
}
