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
       q.addCoin (new Coin("nickel", 0.05));
       q.addCoin (new Coin("quarter", 0.25));
       q.addCoin (new Coin("dime", 0.10));
       
       
       System.out.println (""+p.toString ());
       System.out.println (""+q.toString ());
       
       if (q.sameCoins(p) == true)
            System.out.println ("The purses have the same coins in it");
       if (q.sameContents(p) == true)
            System.out.println ("and in the same order");
       
       //p.transfer(q);
       //System.out.println ("The purses now look like this "+p.toString() +"\n" + q.toString ());
  }
}
            
            