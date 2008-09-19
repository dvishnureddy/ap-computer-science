/****************************************************************
  * 
  * author: Mr. Dietzler
  * date modified: 9/26/07
  * description: This class illustrates the Scanner object and its
  *                uses.
  * 
  ***************************************************************/

//First we must import the Scanner class from java.util so we can use it
import java.util.Scanner;

public class TestScanner
{
     public static void main (String args[])
     {
          /*
           * Declare and initialize the object.  Please note that the name
           * "in" can change and be whatever you want to call the variable.
           * Also, we send "System.in" as an implicit parameter when
           * constructing the Scanner object.  This is the opposite of
           * "System.out" and allows the user to enter Strings and numbers.
           */
          Scanner in = new Scanner (System.in);
          
          //Test the Scanner object by creating a String variable to enter.
          String input;
          
          System.out.println ("Please enter your name: ");
          input = in.nextLine();//THIS IS THE METHOD YOU CALL TO ENTER A STRING
          
          System.out.println ("The name you entered was " + input);
          
          
          System.out.println ("Press enter to continue");
          //Call the nextLine method by itself to pause the program, until the
          // user hits return.
          in.nextLine();
          
          
          //See if you can follow what's happening next:
          double value1, value2, sum;
          
          System.out.println ("\n\nPlease enter the first number: ");
          value1 = in.nextDouble(); //Scanner method!
          System.out.println ("Please enter the second number: ");
          value2 = in.nextDouble();// Scanner method!
          
          sum = value1 + value2;
          
          System.out.println ("\n\nThe sum of " + value1 + " + " + value2 +
                              " = " + sum);
          
          //Other methods include nextInt(), nextLong(), nextBoolean(), etc.
          //There is no "nextChar()" although nextLine().charAt(0) does the trick.

     }//end main method
}//end class