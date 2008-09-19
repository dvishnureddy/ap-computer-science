/* Author: Ryan O'Hara
 * Date modified: September 26, 2007
 * description: This class will give the distance from a time and rate
 */


import java.util.Scanner;

public class DistanceRateTime
{
     public static void main (String args[])
     {
                    Scanner in = new Scanner (System.in);
          
          String input;
          Double time, rate, distance;
          
          System.out.println ("Please enter a time (hrs): ");
          time = in.nextDouble();
          
          System.out.println ("The time you entered was " + time);
          
          System.out.println ("Please enter a rate (Mph): ");

          rate = in.nextDouble();
          
          System.out.println ("The rate you entered was " + rate);          
        
          distance = rate*time; 
          
          System.out.println ("A car traveling for "+ time +" hours and going "+ rate +" mph went "+ distance +" miles.");
     }// end main method
}// end class