/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

/**
 *
 * @author laurenkorpacz
 */
// This program outputs a calender.
// For lauren's individual assignment week 6
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class DaysInMonth
{
   public static void main(String[] pArgs) throws IOException
   {


       final BufferedReader tKeyboard =  new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Type in the number of days in the month (0-31)");
       System.out.flush();
       String tLine = tKeyboard.readLine();
       int tDays = new Integer(tLine).intValue();

       
       
      System.out.print("Which day of the week does the month start? (0-6)");
      System.out.flush();
      String tLine2 = tKeyboard.readLine();
      final int tStartDay = new Integer(tLine2).intValue();
      

      int D1 = 0;
       

      System.out.println("S  M  T  W  Th F  S" );
      

      
          for (int tSpaces = 0; tSpaces<tStartDay; tSpaces++)
              {
                  System.out.print("   ");
              }

          int tEndFirst = 7-tStartDay;
          
          
          for (D1 = 1; D1<=tEndFirst; D1++)
              {
                     System.out.print(D1/10);
                     System.out.print(D1%10 + " ");
              }

          int tDayNumber = D1;

          
          for (int tRows = 0; tRows<5; tRows++)
          {
              System.out.println("");
              

              for (int tColumns = 0; tColumns<7; tColumns++)
              {
                  if (tDayNumber<=tDays)
                  {
                      System.out.print(tDayNumber/10);
                      System.out.print(tDayNumber%10 + " ");
                      
                      tDayNumber++;
                  }
                  

              }
          }

     System.out.println();

    
   }
}

