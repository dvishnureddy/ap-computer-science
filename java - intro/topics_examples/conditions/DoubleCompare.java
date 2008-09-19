/*Ryan O'Hara
 * Date
 * Description
*/
public class DoubleCompare
{
     public static void main (String args[])
     {
          double x = Math.sqrt (2);
          double result = x * x - 2;
         final double EPSILON = 1E-14;
          
          if (Math.abs (result - 0) <= EPSILON)
               System.out.println ("sqrt(2) squared minus 2 is 0");
          else
               System.out.println ("sqrt(2) squared minus 2 is not 0 but "+ result);
               
     }//end main method
}//end DoubleCompare class