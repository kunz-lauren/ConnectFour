/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;
import java.io.*;
import java.util.logging.*;

/**
 *
 * @author laurenkorpacz
 */

public final class NestedFinally {
  
  public static void main(String... aArgs) {
    nestedFinally("C:\\Temp\\test.txt");
  }
  
  private static void nestedFinally(String aFileName) {
    try {
      //If the constructor throws an exception, the finally block will NOT execute
      BufferedReader reader = new BufferedReader(new FileReader(aFileName));
      try {
        String line = null;
        while ((line = reader.readLine()) != null) {
          //process the line...
        }
      }
      finally {
        //no need to check for null
        //any exceptions thrown here will be caught by 
        //the outer catch block
        reader.close();
      }
    }
    catch(IOException ex){
      fLogger.severe("Problem occured : " + ex.getMessage());
    }
  }
  
  private static final Logger fLogger =
    Logger.getLogger(NestedFinally.class.getPackage().getName())
  ;
}
 