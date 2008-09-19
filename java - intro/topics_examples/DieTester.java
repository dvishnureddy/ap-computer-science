/*Ryan O'Hara
 */
public class DieTester
{
     public static void main(String [] args)
     { 
          Die Roll = new Die (10);
          
          System.out.println ("There are "+Roll.getNumSides()+" sides.");
          
          System.out.println ("You rolled a " +Roll.getRoll());
          
     }
}
               