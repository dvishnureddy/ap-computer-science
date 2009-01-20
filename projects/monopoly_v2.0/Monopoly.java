/* Ryan O'Hara
 * play Monopoly!!!
 */
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Monopoly
{
  
  public static ArrayList<Player> players;
  public static ArrayList<Property> properties;
  public static Die roller;
  public static Token tokens;
  public static MonopVars vars;
  public static Scanner in;
  
  /**
   * This is the main method of the program.
   * 
   * @param args this is the necessary String array (not used).
   */
  public static void main (String args[]) throws IOException, BadDataException
  {
    boolean quitGame = false;
    int whoseTurn = 0;
    
    initializeData ();
    
    Die d1 = new Die (6);
    
    boolean gameOver = false;
    
    Player p1 = new Player ("Ryan", "Thimble");
    Player p2 = new Player ("Tim", "Money Bag");
    
    players.add(p1);
    players.add(p2);
    
    while (gameOver == false)
    {
      System.out.println ("Welcome to MONOPOLY!");
      System.out.println (" ==============="
                            + "\n[M|O|N|O|P|O|L|Y]");
      
      
      
      //loop until a player chooses to quit the game
      int menu = 0;  
      do 
      {
           Player curPlayer = players.get(whoseTurn);
           System.out.print ("\n\n*************************************" +
                          "\n     * * * * * * * * * * * * * *     " +
                          "\n*************************************\n");
           System.out.println ("\n"+curPlayer.getName()+" it is your turn enter 1 to roll or 2 to quit: ");  
           menu = in.nextInt ();   
           switch (menu) 
           { 
                case 1:
                {
                     if (curPlayer.isInJail() == false)
                     {
                     takeTurn(d1, curPlayer);
                     whoseTurn++;
                     if (whoseTurn == players.size())
                          whoseTurn = 0;
                     }
                     else
                          Jail(d1, curPlayer);
                }
                     break;  
                case 2:
                     System.out.println ("Quitting game");  
                     quitGame = true; 
                     break;    
           }   
      } 
      while (!quitGame);
      
    }
  }
  
  public static void takeTurn (Die d1, Player p1)
  {
    int roll1 = d1.getRoll ();
    int roll2 = d1.getRoll ();
    int rollSum = roll1 + roll2;
    boolean arrested = false;
    int rollsLeft = 1;
    
    while (p1.isInJail() == false && rollsLeft > 0)
    {
      p1.movePiece(rollSum);
      
      System.out.println ("\nYour roll was a "+rollSum);
      
      Property current = properties.get (p1.getSpace());
      
      System.out.println ("The "+ p1.getPiece() + " landed on space "+ p1.getSpace());
      
      rollsLeft --;
    }
    
    if (p1.getSpace() == 30)
    {
         //Jail (d1, p1);
         p1.setSpace (10);
         System.out.println ("You have to go to jail (space 10)");
         arrested = true;
         p1.setInJail(arrested);
    }
    
     if (roll1 == roll2)
    {
      System.out.println ("\nYou rolled double "+ (rollSum/2)+"'s");    
      p1.addDoubles ();
      int doubleRoll1 = d1.getRoll ();
      int doubleRoll2 = d1.getRoll ();
      int doubleRollSum = doubleRoll1 + doubleRoll2;
      p1.movePiece(doubleRollSum);
      
      System.out.println ("\nYou rolled again and it was a "+doubleRollSum);
      
      Property current = properties.get (p1.getSpace());
      
      System.out.println ("The "+ p1.getPiece() + " landed on space "+ p1.getSpace());
      
      if (doubleRoll1 == doubleRoll2)
      {
           System.out.println ("\nYou rolled doubles again it was double "+ (doubleRollSum/2)+"'s");
           p1.addDoubles ();
           int doubleRoll3 = d1.getRoll ();
           int doubleRoll4 = d1.getRoll ();
           int doubleRollSum2 = doubleRoll3 + doubleRoll4;
           p1.movePiece(doubleRollSum2);
           
           System.out.println ("\nYou rolled again and it was a "+doubleRollSum2);
           
           current = properties.get (p1.getSpace());
           
           System.out.println ("The "+ p1.getPiece() + " landed on space "+ p1.getSpace());
           
           if (doubleRoll3 == doubleRoll4)
           {
                System.out.println ("\nYou rolled doubles again it was double "+ (doubleRollSum2/2)+"'s");
                p1.addDoubles ();
                int doubleRoll5 = d1.getRoll ();
                int doubleRoll6 = d1.getRoll ();
                int doubleRollSum3 = doubleRoll5 + doubleRoll6;
                p1.movePiece(doubleRollSum3);
                
                System.out.println ("\nYou rolled again and it was a "+doubleRollSum3);
                
                current = properties.get (p1.getSpace());
                
                System.out.println ("The "+ p1.getPiece() + " landed on space "+ p1.getSpace());
           }
      }
     }
     
     if (p1.getDoubles() == 3)
    {
      System.out.println ("You rolled too many doubles you have to go to jail");
      //Jail(d1, p1);
      arrested = true;
      p1.setInJail (arrested);
    }
    else
    {
      p1.resetDoubles ();
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
  
  public static void initializeData () throws IOException, BadDataException
  {
    boolean fileFound = false;
    
    //Initialize the objects
    in = new Scanner (System.in);
    players = new ArrayList<Player>();
    properties = new ArrayList<Property>();
    tokens = new Token();
    vars = new MonopVars();
    MonopolyDataReader reader = new MonopolyDataReader();
    
    do
    {
      //try to obtain a valid file
      try
      {
        reader.readMonopolyFile (chooseFile(), vars, tokens, properties);
        fileFound = true;
      }//end try
      catch (FileNotFoundException e)
      {
        System.out.println ("\n\nFile not found.  Please try again.");
      }//end catch
    }//end do
    while (!fileFound);
    
    roller = new Die (vars.getNumDiceSides());
    
  }// end of initializeData method
  
  
  /*
   * This method uses a JFileChooser to locate the data file
   * to be used in this version of Monopoly.
   * 
   * @return the name of the file to be used for this game
   */
  
  public static String chooseFile ()
  {
    String filename = new String();
    boolean fileChosen = false;
    
    //This window is the parent for the JFileChooser
    JWindow window = new JWindow();
    
    //YOU CAN CHANGE THE INITIAL PATH FOR THE JFileChooser TO LOOK IN!
    //Perhaps the Desktop?
    JFileChooser chooser = new JFileChooser ("/users/admin/java/ap/monopoly/monopoly_v3/MonopolyData.txt");
    
    do
    {
      try
      {
        //Opens the JFileChooser
        chooser.showOpenDialog(window);
        
        //Returns the name of the file that was chosen.
        filename = chooser.getName (chooser.getSelectedFile());
        fileChosen = true;
      }//end try
      catch (NullPointerException e)
      {
        System.out.println ("Please choose a file before continuing.");
      }//end catch
    }
    while (!fileChosen);
    
    return filename;
  }// end of chooseFile method
  
     /**
    * This method returns the suffix of the given number.
    * 
    * @param number the number to find the suffix for
    * @return returns the suffix of the number as a String.
    */
   public static String getSuffix (int number)
   {
      if ((number % 10) == 1 && ((number / 10) % 10) != 1)
         return new String ("st");
      else if ((number % 10) == 2 && ((number / 10) % 10) != 2)
         return new String ("nd");
      else if ((number % 10) == 3 && ((number / 10) % 10) != 3)
         return new String ("rd");
      else
         return new String ("th");
      
   }//end getSuffix method
  
}
