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
          boolean simCoins = false;
          int sameCounter = 0;
          for (int i = 0; i <coins.size(); i++)
          {
               for (int j = coins.size ()-1; j > 0; j--)
               {
                    if (coins.get(i).getValue() == other.coins.get(j).getValue() && coins.get(i).getName().equals(other.coins.get(j).getName()))
                         sameCounter ++;      
               }
               if (sameCounter == coins.size () && sameCounter == other.coins.size())
                    simCoins = true;
               return simCoins;
          }
          return simCoins;
     }
     
  
     //check if two purses have the same contents in the same order
     public boolean sameContents (Purse other)
     {
          boolean sameOrder = false;
          int sameCounter = 0;
          for (int i = 0; i < coins.size(); i++)
          {
                    if (coins.get(i).getValue () == other.coins.get(i).getValue() && coins.get(i).getName().equals(other.coins.get(i).getName()))
                         sameCounter ++;
                    
                    if (sameCounter == coins.size () && sameCounter == other.coins.size())
                         sameOrder = true;
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