/* Ryan O'Hara
 * Coin Flipper
 * October 27, 2008
 */
import java.util.*;

class CoinFlipper
{
     public String flipProbability (int numCases)
     {
          String toReturn = new String("");
          
          int n = numCases;
          
          for(int i = 1; i <= numCases; i++)
          {
               double percent = 0;
               double t = 0.0;
               
               for (int j = 0; j < 200; j++)
               {
                    Random gen = new Random ();
                    n = gen.nextInt(2);
                    if (n == 0)
                         t ++;
               }
               
               percent = (t/2);
               
               toReturn += ("Case "+ i +": The probability of flipping tails is "+percent+"%.\n");
          }
          return toReturn;
     }
}

