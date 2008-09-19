/*Ryan O'Hara
 * February 6, 2008
 * Tests the purse class
 */
import java.util.ArrayList;

public class PurseTester
{
     public static void main (String args [])
     {
          ArrayList<Coin> coins = new ArrayList <Coin>  ();
          
          Purse a = new Purse ();
          
          a.addCoin (new Coin (0.25, "Quarter"));
          a.addCoin (new Coin (0.10, "Dime"));
          
          System.out.println (a);
     }
}