/************************************************************************
  *
  * Introduction to Programming
  * Name: Ryan O'Hara
  * Date: October 10,2007
  * Title: Lab3CashRegister.java
  * Description: Write the code to simulate a cash register.
  *
  *************************************************************************/

import java.util.Scanner;

public class Lab3CashRegister
{
     public static final double QUARTER_AMOUNT = 0.25;
     public static final double DIME_AMOUNT = 0.1;
     public static final double NICKEL_AMOUNT = 0.05;
     public static final double PENNY_AMOUNT = 0.01;
     
     public static void main (String args [])
     {
          Scanner in = new Scanner (System.in);
          
          double purchaseAmount, cashAmount, changeAmount = 0.0;
          int dollarPay, quarterPay, dimePay, nickelPay, pennyPay;
          
          System.out.print ("\nWelcome to the Java Cash Register\n");
          
          System.out.print ("\nHow much is the product you are purchasing?\nPrice: ");
          purchaseAmount = in.nextDouble ();
       
          /**************************************************************
            * Below you need to add 3 things:
            * 
            *     1. Code to allow the user to enter an int for each of the
            *        coins listed above (store these values in dollarPay,
            *        quarterPay, dimePay, etc.
            *     2. Calculate the cash amount by totaling up the number of
            *        each dollar or coin times the coin's amount.
            *     3. Calculate the change about by subtracting the cashAmount
            *        minus the purchase amount.
            **************************************************************/
          //BEGIN CODE HERE
          
                    System.out.println ("Now please enter the number of Dollars you are using to pay with:");
          dollarPay = in.nextInt ();
          
          System.out.println ("Now please enter the number of Quarters you are using to pay with:");
          quarterPay = in.nextInt ();
          
          System.out.println ("Now please enter the number of Dimes you are using to pay with:");
          dimePay = in.nextInt ();
          
          System.out.println ("Now please enter the number of Nickels you are using to pay with:");
          nickelPay = in.nextInt ();
          
          System.out.println ("Now please enter the number of Pennies you are using to pay with:");
          pennyPay = in.nextInt ();   
          
          cashAmount = (dollarPay + quarterPay * QUARTER_AMOUNT + dimePay * DIME_AMOUNT + nickelPay * NICKEL_AMOUNT + pennyPay * PENNY_AMOUNT); 
          
          changeAmount = cashAmount - purchaseAmount;
          
          //KEEP THIS LINE
          System.out.println ("You will receive $" + changeAmount);
                    
          
     }// end main method
}// end Lab3CashRegister class