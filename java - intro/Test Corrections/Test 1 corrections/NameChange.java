/*Ryan O'Hara
 * October 23, 2007
 * Test 1 Corrections
 */

import java.util.Scanner;

public class NameChange
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          String firstName, lastName;
          
          System.out.println ("Please enter your first name: ");
          firstName = in.nextLine ();
          
          System.out.println ("Please enter your last name: ");
          lastName = in.nextLine ();
          
          int length1 = firstName.length ();
          int length2 = lastName.length ();
          int total = length1 + length2;
               
               System.out.println ("Your full name has " + total +" letters.");
          
         String name3 = firstName.toUpperCase ();
         System.out.println (name3);
         
          char letter = lastName.charAt (length2 - 1);
          System.out.println ("The last letter is "+ letter);
              
          
          
     }//ends main method
}// ends NameChange class
               
             