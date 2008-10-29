/*Ryan O'Hara
 * prints an ArrayList of 10 random numbers from 1 to 100
 * October 30, 2008
 */
import java.util.ArrayList;
import java.util.Random;

public class RandomInts1
{
   public static void main (String args [])
     {
     ArrayList nums = new ArrayList ();
     
     Random gen = new Random ();
     int n; 
     
     for (int i = 0; i < 10; i++)
     {
       n = gen.nextInt (100) + 1;
       nums.add (n);
     }
     
     System.out.print (nums);
   }
}