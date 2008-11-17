/* Ryan O'Hara
 * play Monopoly!!!
 */
import java.util.Scanner;
import javax.swing.*;

public class Monopoly
{
     public static void main (String args [])
     {
          Scanner in = new Scanner (System.in);
          
          
          Die d1 = new Die (6);
          
          boolean gameOver = false;
   
          while (gameOver == false)
          {
               System.out.println ("Welcome to MONOPOLY!");
               System.out.println (" ==============="
                                        + "\n[M|O|N|O|P|O|L|Y]");
               
               System.out.println ("\nPlayer 1 enter your name: ");
               String name = in.nextLine ();
               System.out.println ("\nThere are 9 pieces: Thimble, Bag of Money, Cannon, Top Hat, Boot, Dog, Car, Iron and Wheelbarrow");
               System.out.println ("Player 1 enter your piece: ");
               String piece = in.nextLine ();
               
               Player p1 = new Player (name, piece);
          
               int menu = 0;
               do
               {
                    
                    System.out.println ("\nEnter 1 to roll or 2 to quit: ");
                    menu = in.nextInt ();
                    switch (menu)
                    {
                         case 1:
                              takeTurn(d1, p1);
                              break;
                         
                         case 2:
                              System.out.println ("Quitting game");
                              gameOver = true;
                              break;
                         
                    }
               }
               while (menu == 1);
          }
     }
     
     public static void takeTurn (Die d1, Player p1)
     {
          int roll1 = d1.getRoll ();
          int roll2 = d1.getRoll ();
          int rollSum = roll1 + roll2;
          System.out.println ("Your roll was a "+rollSum);
          
          if (roll1 == roll2)
          {
               System.out.println ("You rolled double "+ (rollSum/2)+"'s");
               p1.addDoubles ();
          }
          
          if (p1.getDoubles() == 3)
          {
               inJail(d1, p1);
          }
     }
}
          