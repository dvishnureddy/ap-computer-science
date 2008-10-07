/*
 * Ryan O'Hara
 * 10/7/08
 * The basic structure of a tic-tac-toe game
 */
import java.util.Scanner;

public class Menus
{
     public static void main (String args [])
     {
          int choice = 0;
          Scanner in = new Scanner(System.in);
          
          do
          {
               System.out.println ("Enter 1 to continue and 2 to quit: ");
               choice = in.nextInt ();
               
               switch (choice)
               {
                    case 1:
                         System.out.println ("Continuing...");
                         break;
                    case 2:
                         System.out.println ("Quitting...");
                         break; 
               }
          }
          while (choice == 1);
     }
}
