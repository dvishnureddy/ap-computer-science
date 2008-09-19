/*Ryan O'Hara
 */
import java.util.ArrayList;

public class Purse
{
     private ArrayList<Coin> coins;
     
     public Purse ()
     {
          coins = new ArrayList<Coin>();
     }
     
     public Purse (ArrayList<Coin> newCoins)
     {
          coins = new ArrayList<Coin> ();
          while (newCoins.size () >= 0)
               coins.add (newCoins.remove (0));
     }
     
     public void addCoin (Coin aCoin)
     {
          coins.add (aCoin);
     }//end add coin method
     
          public String toString()
          {
               String output = new String();
               output += (this.getClass ().getName() + "[");
               
               for (int i = 0; i < coins.size(); i ++)
               {
                    output += (coins.get(i).getCoinName() + ", ");
               }//end for
               
               output += "]";
               return output;
          }
     
     /*public void reverse ()
     {
          
     }
           
     public void transfer (Purse other)
     {
     
     }*/
          
}
     