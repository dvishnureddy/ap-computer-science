/* Ryan O'Hara
 * October 20, 2008
 *Card Tester
 */
import java.util.Scanner; 
public class CardTester
{     
  public static void main (String args[])     
  {          
    Scanner in = new Scanner (System.in);                    
    String n = in.nextLine();                    
    Card deck1 = new Card(n);
    
    System.out.println (deck1.getDescription());
  }
}