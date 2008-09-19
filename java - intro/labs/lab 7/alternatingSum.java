/*Ryan O'Hara
 * February 6, 2008
 * Finds the alternating sum of numbers in an array
 */
import java.util.Scanner;

public class alternatingSum
{
     public static void main (String[] args)
     {
          Scanner in = new Scanner (System.in);
          
          System.out.println ("How many numbers do you want to enter: ");
          int numInts = in.nextInt ();
          
          double [] integers = new double [numInts];
          double sum = 0.0;
          
          for (int i = 0; i < integers.length; i++)
          {
               System.out.print ("Please enter integer #"+ (i+1) +": ");
               integers [i] = in.nextDouble ();
               
               if (i % 2 == 0)
               {
                    sum += integers [i];
               }
               
               else
                    sum -= integers [i];
               
               System.out.println (sum);
          }
          System.out.print ("The final sum is "+ sum + "\n");
     }
}
               