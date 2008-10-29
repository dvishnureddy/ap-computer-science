/*Ryan O'Hara
 * prints an ArrayList of 10 random numbers from 1 to 100 no duplicate numbers
 * October 30, 2008
 */
import java.util.ArrayList;
import java.util.Random;

public class RandomInts2
{
   public static void main (String args [])
     {
     ArrayList nums = new ArrayList ();
     
     Random gen = new Random ();
     int n; 
     
     for (int i = 0; i < 10; i++)
     {
       n = gen.nextInt (100) + 1;
       nums.add (i, n);
       
       for (int j = 1; j < i; j++)
       {
         if (n == nums.get(j))
         {
              System.out.println (n +" was a double");
              nums.remove (i);
              i -= 1;
         }
       }
       
     }
     
     System.out.print (nums);
   }
}
     
     