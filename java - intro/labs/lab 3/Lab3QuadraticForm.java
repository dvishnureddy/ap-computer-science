/************************************************************************
  * 
  * Introduction to Programming
  * Name: Ryan O'Hara
  * Date: October 3, 2007
  * Title: Lab3QuadraticForm.java
  * Description: Write the code to solve the Quadratic Formula
  * 
  *************************************************************************/

import java.util.Scanner;

public class Lab3QuadraticForm
{
     public static void main (String args [])
     {
          Scanner in = new Scanner (System.in);
          
          double a, b, c;//the input variables
          double x1, x2; //the solutions
          
          System.out.print ("\nQuadratic Formula");
          
          System.out.println ("Please enter the a: ");
          a = in.nextDouble (); 
             
          System.out.println ("Please enter the b: ");
          b = in.nextDouble ();
          
          System.out.println ("Please enter the c: ");
          c = in.nextDouble ();
          
          x1 = -b + Math.sqrt(Math.pow(b,2) - 4 * a * c);
          x2 = -b - Math.sqrt(Math.pow(b,2) - 4 * a * c);
          
          System.out.println ("The answers are "+ x1 +", " + x2);
          
          
//Fill in code below to prompt the user to input a, b and c.
// Then calculate the two solutions x1 & x2 and finally print them
// out to the user.
          
          
          
          
          
     }// end main
}// end Lab3QuadraticForm class

