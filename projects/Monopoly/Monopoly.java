/* Ryan O'Hara
 * * play Monopoly!!! 
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
      while (menu != 2);
    } 
  } 
  
  
  public static void takeTurn (Die d1, Player p1) 
  {  
    int roll1 = d1.getRoll ();   
    int roll2 = d1.getRoll ();  
    int rollSum = roll1 + roll2;
    boolean arrested = false;
    int rollsLeft = 1;
    
    if (roll1 == roll2) 
    { 
      System.out.println ("You rolled double "+ (rollSum/2)+"'s"); 
      p1.addDoubles (); 
      rollsLeft++;
    } 
    if (p1.getDoubles() == 3) 
    {   
      Jail(d1, p1);
      arrested = true; 
      p1.setInJail (arrested);  
    }        
    else
    {    
      p1.resetDoubles ();
    }  
    while (p1.isInJail() == false && rollsLeft > 0)  
    {   
      p1.movePiece(rollSum); 
      System.out.println ("Your roll was a "+rollSum); 
      System.out.println ("The "+ p1.getPiece() + " landed on space "+ p1.getSpace());  
      rollsLeft --;
    } 
  }//end takeTurn  
  
  
  public static void Jail (Die d1, Player p1)    
  { 
    Scanner in = new Scanner (System.in);      
    p1.resetDoubles ();  
    boolean arrested = true;  
    System.out.println ("Type 1 to roll and 2 to pay the $50 fine");   
    int choice = in.nextInt ();    
    switch (choice)       
    { 
      case 1: 
      { 
        p1.setSpace (10);
        p1.resetDoubles ();  
        int jailRoll1 = d1.getRoll ();
        int jailRoll2 = d1.getRoll ();   
        int jailSum = jailRoll1 + jailRoll2;
        int jailRoll = 0;
        if (jailRoll1 == jailRoll2)  
        {    
          System.out.println ("You rolled double "+ (jailSum/2) +"'s"); 
          p1.addDoubles ();   
          p1.movePiece (jailSum);
          arrested = true;      
          p1.setInJail (arrested);    
        }               
        else
        {                      
          jailRoll ++;    
          System.out.println ("You did not roll doubles");    
          if (jailRoll == 3)  
          {   
            System.out.println ("You had three chances to roll doubles now you have to pay the fine to get out.");  
            p1.setMoney (-50); 
            p1.setInJail (arrested);    
          }      
        }          
      }  
      case 2: 
      {  
        p1.setMoney (-50);    
        arrested = true; 
        p1.setInJail (arrested); 
        System.out.println ("Thanks for paying the fine the "+ p1.getPiece() +" now has $"+p1.getMoney ());  
      } 
    }
  }//end Jail
}