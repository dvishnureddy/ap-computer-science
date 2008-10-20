/* Ryan O'Hara
 * October 20, 2008
 *Prime Generator Tester
 */
import java.util.Scanner; 
public class PrimeGenTester
{     
  public static void main (String args[])     
  {          
    Scanner in = new Scanner (System.in);                    
    int n = in.nextInt();                    
    PrimeGenerator prime = new PrimeGenerator(n);
    
    
    boolean print = true;
      while (print)
      {
         int p = prime.newPrime();
         if (p > n)
            print = false;
         else
            System.out.println(prime.getNum());
      }
  }
}