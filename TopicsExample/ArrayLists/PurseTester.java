/*
 * Ryan O'Hara
 * November 6, 2008
 * Tests Purse
 */
public class PurseTester
{     
  public static void main (String args[])     
  {
       Purse p = new Purse ();
       p.addCoin (new Coin("quarter", 0.25));
       p.addCoin (new Coin("dime", 0.10));
       p.addCoin (new Coin("nickel", 0.05));
       
       Purse q = new Purse ();
       //q.transfer(p);
       q.addCoin (new Coin("quarter", 0.25));
       q.addCoin (new Coin("nickel", 0.05));
       q.addCoin (new Coin("dime", 0.10));
       
       System.out.println (""+p.toString ());
       System.out.println (""+q.toString ());
       
       if (q.sameContents(p) == true)
            System.out.println ("The purses have the same coins in it in the same order");
       if (q.sameCoins(p) == true)
            System.out.println ("The purses have the same coins in it but in a different order");
  }
}
            
            