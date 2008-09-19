import java.util.Scanner

public class BoardGame
{
     public static void main (String  args [])
     {
          boolean isPlaying = true;
          char choice = 'y';
          int currentSpace = 1, roll1 = 0, roll2 = 0, totalRoll = 0;
          
          static final NUM_SPACES = 40;
          static final NUM_SIDES = 6;
          
          Die gameDie = new Die (NUM_SIDES);
          Scanner in = new Scanner (system.in);
          
          System.out.println ("Welcome to THE GAME!");
          
          do
          {
               System.out.println ("Would you like to roll? \n 'y' for YES or 'n' for NO \nChoice: ");
               choice = Character.toLowerCase (in.next ().charAt (0));
               
               switch (choice)
               {
                    case 'y':
                         roll1 = gameDie.getRoll ();
                         roll2 = gameDie.getRoll ();
                         totalRoll = roll1 + roll2;
                         
                         System.out.println ("You rolled a "+ roll1 +" and "+ roll2 + " you can move "+ totalRoll+ " spaces.");
               }
          }
     }
}
               