/**
 * A Simple while loop example
 */

import java.util.Scanner;

public class DoWhileLoops
{
     public static void main (String [] args)
     {
          Scanner in = new Scanner (System.in);
          
          int choice = 2;
          
          // This is guarenteed to execute EVEN THOUGH the value for choice (2) does not meet the while condition (false)
          
        do
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
          while (choice != 2);
          
     }// end main method
}// end WhileLoops Class