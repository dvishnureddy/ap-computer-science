/***************************
 * Ryan O'Hara
 * Date
 * Description
***************************/
public class QuadraticFormula
{
     public static void main (String args[])
     {
          double a = 2;
          double b = 8;
          double c = 5;
          
          double root = Math.sqrt (Math.pow (b,2) - 4*a*c);
          
          double x = (-1 * b + root)/(2*a);
          double x2 = (-1 * b - root)/(2*a);
               
          System.out.println ("The answers are: "+x+" and "+x2);
               
     }//end main method
}//end ClassName class