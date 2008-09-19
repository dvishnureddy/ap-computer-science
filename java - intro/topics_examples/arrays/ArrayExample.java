/*
 * Example of arrays
 */

import java.util.Scanner;

public class ArrayExample
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          System.out.print ("How many grades do you want to enter?\n");
          int numGrades = in.nextInt ();
          
          double [] grades = new double [numGrades];
          double sum = 0.0, average;
          
          for (int i = 0; i < grades.length; i++)
          {
               System.out.print ("Please enter grade # " + (i + 1) + ": ");
               grades [i] = in.nextDouble ();
               sum += grades [i];
          }//end for
          
          System.out.println ("\n\nBelow are the grades you entered: \n\n");
          
          for (int i = 0; i < grades.length; i++)
          {
               System.out.println ("Grade " + (i + 1) + ": " +
                                   grades[i]);
               System.out.println ("--------------------");
          }
          
          average = sum / grades.length;
          
          System.out.println ("\n\nThe average grade is " + 
                              average);
          
          //ERROR
          //System.out.println (grades [grades.length]);
          
          //ERROR
          /*
          for (int i = 1; i <= grades.length; i++)
          {
               System.out.println (grades[i]);
          }
          */
          
          //ERROR
          /*
          String [] words = new String [-1];
          words[0] = new String ("Happy Feet");
          words[1] = new String ("Unhappy Feet");
          */
          
          double GPA_markers [] = {93.0, 89.0, 85.0, 81.0, 77.0, 73.0, 69.0};
          System.out.println ("\n\nThere are "+ GPA_markers.length + " values in the array.");
          
          for (int i = 0; i < args.length; i++)
          {
               System.out.println ("args[" + i +"] = " + args[i]);
          }
     }//end main
}//end class