/*Ryan O'Hara
 * Test Corrections prints number of sevens in a number
 * October 27, 2008
 */
public class Digits
{
     public int numberOfSevens (double number)
     {
          double n = number;
          int numOfSevens = 0;
          
          String line = Double.toString(number);
          
          for (int i = 0; i < line.length(); i++)
          {
               if (line.charAt (i) == '7')
                    numOfSevens ++;
          }
          return numOfSevens;
     }
}
          
          