/*
 * Ryan O'Hara
 * 11/5/08
 * A class to simulate a purse that stores coins
 */
import java.util.ArrayList;

public class Purse
{
     private ArrayList<Coin> coins;
     
     public Purse ()
     {
          coins = new ArrayList<Coin> ();
     }
     
     public Purse (ArrayList<Coin> newCoins)
     {
          coins = (ArrayList<Coin>) newCoins.clone();
     }
     
     public void addCoin (Coin newCoin)
     {
          coins.add (newCoin);
     }
     
     public void reverse ()
     {
          int numCoins = coins.size();
          for (int i = 0; i < numCoins; i++)
          {
               coins.add (i, coins.remove (coins.size()-1));
          }
     }
     
     //transfer the coins in one purse to anoter purse
     public void transfer (Purse other)
     {
          int numTransfer = other.coins.size();
          for (int i = 0; i < numTransfer; i++)
          {
               coins.add (other.coins.remove (0));
          }
     }
     
     //check if two purses have the same contents but not in the same order
     public boolean sameCoins (Purse other)
     {
          int qP1Counter = 0;
          int qP2Counter = 0;
          int dP1Counter = 0;
          int dP2Counter = 0;
          int nP1Counter = 0;
          int nP2Counter = 0;
          int pP1Counter = 0;
          int pP2Counter = 0;
          boolean sameCoins = false;
          
          if (coins.size () == other.coins.size ())
          {
               for (int i = 0; i < coins.size (); i++)
               {
                    if (coins.get(i).getValue() == 0.25)
                         qP1Counter ++;
                    if (other.coins.get(i).getValue() == 0.25)
                         qP2Counter ++;
                    if (coins.get(i).getValue() == 0.10)
                         dP1Counter ++;
                    if (other.coins.get(i).getValue() == 0.10)
                         dP2Counter ++;
                    if (coins.get(i).getValue() == 0.05)
                         nP1Counter ++;
                    if (other.coins.get(i).getValue() == 0.05)
                         nP2Counter ++;
                    if (coins.get(i).getValue() == 0.01)
                         pP1Counter ++;
                    if (other.coins.get(i).getValue() == 0.01)
                         pP2Counter ++;
               }
               if (qP1Counter == qP2Counter && dP1Counter == dP2Counter && nP1Counter == nP2Counter && pP1Counter == pP2Counter)
                    sameCoins = true;
                    
          }
          return sameCoins;
     }
     
     //check if two purses have the same contents in the same order
     public boolean sameContents (Purse other)
     {
          boolean sameOrder = false;
          int sameCounter = 0;
          
          if (coins.size () == other.coins.size())
          {
            for (int i = 0; i < coins.size(); i++)
            {
              if (coins.get(i).getValue () == other.coins.get(i).getValue() && coins.get(i).getName().equals(other.coins.get(i).getName()))
                sameCounter ++;               
            }
          }
          return sameOrder;
     }
                                 
          public String toString ()
     {
          String result = "Purse contents: [ ";
          
          for (Coin currentCoin : coins)
               result += currentCoin.getName()+" ";
          result += "]";
          return result; 
     }
     
}