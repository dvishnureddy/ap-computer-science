/**
 * A Simple while loop example
 */

import java.util.Scanner;

public class WhileLoops
{
     public static void main (String [] args)
     {
          Scanner in = new Scanner (System.in);
          
          int choice = 1;
          
          while (choice != 2)
          {
          
          System.out.println ("Enter 1 to continue or 2 to quit");
          choice = in.nextInt ();
          
          if (choice == 1)
               System.out.println ("\n\nContinuing...\n");
          else if (choice == 2)
               System.out.println ("\nQuitting...\n");
          else
               System.out.println ("\nInvalid input! Try again.\n");
          }//end while
          
     }// end main method
}// end WhileLoops Class