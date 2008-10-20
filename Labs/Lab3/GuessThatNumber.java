/* Ryan O'Hara
 * October 20, 2008
 * Guess a number between 1 and 100
 */
import java.util.Random;
import java.util.Scanner;

public class GuessThatNumber
{
     public static void main (String args [])
     {
          int mysteryNumber;
          
          Random gen = new Random ();
          Scanner in = new Scanner (System.in);
          
          int guess;
          
          mysteryNumber = gen.nextInt (100) + 1;
          
          System.out.println ("Welcome to \" The Best Game Ever\"");
          System.out.println ("\n\nThe mystery number has been chosen!");
          
          do
          {
          System.out.print ("\n\nPlease guess a number from 1 to 100: ");
          
          guess = in.nextInt ();    
          
          if (guess == mysteryNumber)
               System.out.println ("GOT IT!");
          
          else if (guess > mysteryNumber)
               System.out.println ("Too high");
          else if (guess < mysteryNumber)
               System.out.println ("Too low");
                                        
          else
               System.out.println ("Sorry you lose");
          }
          while (guess != mysteryNumber);
          
          
     }// end main method
}//end GuessThatNumber class