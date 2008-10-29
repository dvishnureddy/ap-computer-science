/*Ryan O'Hara
 */
public class DieTester
{
     public static void main(String [] args)
     { 
          Die roll = new Die (6);
          Die second = new Die (6);
          
          System.out.println ("There are "+roll.getNumSides()+" sides.");
          System.out.println ("There are "+second.getNumSides()+" sides.");
          System.out.println ("You rolled a " +roll.getRoll());
          System.out.println ("You rolled a " +second.getRoll());
     }
}
               