/*Ryan O'Hara
 * October 23, 2007
 * Test 1 Corrections
 */
import java.util.Random;
     
     class DiceRoller
     
{
     public static void main (String args [])
     {
          Random roller = new Random ();
          
          int num1, num2;
          
          num1 = roller.nextInt (5) + 1;
          num2 = roller.nextInt (5) + 1;
          
          System.out.println ("The two numbers are "+num1+" and "+num2+".");
          
     }//ends main
     }//ends DiceRoller class