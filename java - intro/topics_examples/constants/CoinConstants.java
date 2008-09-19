/*
 * An example of constant values in a program
 */
import java.util.Scanner; 
{
          public static final double Quarter_Val = 0.25;
          public static final double Dime_Val = 0.10;
          public static final double Nickel_Val = 0.05;
          public static final double Penny_Val = 0.01;

public class CoinConstants
{
     public static void main (String args[])
     {

          Scanner in = new Scanner (System.in);
          
          int numDollars, numQuarters, numDimes, numNickels, numPennies;
          
          System.out.println ("Enter the number of Dollars: ");
          numDollars = in.nextInt ();
          
          System.out.println ("Enter the number of Quarters: ");
          numQuarters = in.nextInt ();
          
          System.out.println ("Enter the number of Dimes: ");
          numDimes = in.nextInt ();
          
          System.out.println ("Enter the number of Nickels: ");
          numNickels = in.nextInt ();
          
          System.out.println ("Enter the number of Pennies: ");
          numPennies = in.nextInt ();
          
          double total = computeTotal ( numDollars, numQuarters, numDimes, numNickels, numPennies);
          System.out.println ("You have $ "+ total); 
     }//end main method

     /*
      * This method will compute the total value for a set of coins
      */
     public static double computeTotal (int nDol, int nQ, int nD, int nN, int nP)
     {
          
          return nDol + ( Quarter_Val * nQ) + (Dime_Val * nD) + (Nickel_Val * nN) + (Penny_Val * nP);
     }//end computeTotal method
}//end class 
      