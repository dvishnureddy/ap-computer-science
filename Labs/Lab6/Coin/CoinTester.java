/*
 * Ryan O'Hara
 * December 3, 2008
 * Tests Purse
 */
public class CoinTester
{     
     public static void main (String args[])     
     {
          Coin q = new Coin("quarter", 0.25);
          Coin d = new Coin("dime", 0.10);
          Coin n = new Coin("nickel", 0.05);
          Coin q1 = new Coin("quarter", 0.25);
          
          if (q.compareTo(q1) == 0)
               System.out.println ("They are they same coin\n");
          else if (q.compareTo(q1) == 1)
               System.out.println ("The "+q.getName()+" is greater than the "+q1.getName()+"\n");
          else
               System.out.println ("The "+q.getName()+" is less than the "+q1.getName()+"\n");

          if (d.compareTo(n) == 0)
               System.out.println ("They are they same coin\n");
          else if (d.compareTo(n) == 1)
               System.out.println ("The "+d.getName()+" is greater than the "+n.getName()+"\n");
          else
               System.out.println ("The "+d.getName()+" is less than the "+n.getName()+"\n");
     }
}

            