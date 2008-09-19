/************************************************************************
 * 
 *       Introduction to Programming
 *       Name: your name
 *       Date: 1/30/08
 *       Title: Coin.java
 *       Description: A program to simulate US Coins.
 *       Input: none
 *       Output: none
 * 
 *************************************************************************/

public class Coin
{
      private double coinValue;
      private String coinName;
      
      //final variables for the Coins
     public static final String QUARTER = "Quarter";
     public static final String DIME = "Dime";
     public static final String NICKEL = "Nickel";
     public static final String PENNY = "Penny";
     public static final double QUARTER_VAL = 0.25;
     public static final double DIME_VAL = 0.1;
     public static final double NICKEL_VAL = 0.05;
     public static final double PENNY_VAL = 0.01;
     
     public Coin (double value, String name)
      {
            coinValue = value;
            coinName = name;
      }
      
      
      public double getCoinValue ()
      {
            return coinValue;
      }
      
      
      public String getCoinName ()
      {
            return coinName;
      }
}//end Coin class