/*Author: Ryan O'Hara
 * 9/21/07
 *Description: Generates a rando seequemce of numbers 
 * for the Pennsylvania lottery match 6 game.
 */

import java.util.Random; 

public class LotteryNumbers
{
     public static void main (String args[])
     {
          Random gen = new Random ();
          
          int num1, num2, num3, num4, num5, num6;
          
          //Generate 6 random integer values from 1 to 49
          
          /*
           * The Random object has 2 methods to generate random values
           * For integer values
           * nextInt (#) --> generate a random int from 0 up to one less than #
           * fro double values:
           *      nextDouble () --> generates a random double 0.0 <= x < 1.0 
           */
          num1 = gen.nextInt (49) + 1;
          num2 = gen.nextInt (49) + 1;
          num3 = gen.nextInt (49) + 1;
          num4 = gen.nextInt (49) + 1;
          num5 = gen.nextInt (49) + 1;
          num6 = gen.nextInt (49) + 1;
          
          System.out.println ( "Hey buddy, wanna win the Match 6 lotto try these numbers out "+ num1 +" "+ num2 +" "+ num3 +" "+ num4 +" "+ num5 +" "+ num6 +".");
     }//end main
}//end class

