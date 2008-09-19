/**
 * Tests the BankAccount object
 * 
 * Last test: 11/5/07
 */
public class BankAccountTester
{
     /**
      * The main method
      * 
      * @param args String arguments for the main method
      */
     public static void main (String args [])
     {
          //If you are testing an object, you should do 3 main things:
          
          // 1. Construct one or more objects of the class being tested
          
          BankAccount myAccount = new BankAccount (1000);
          BankAccount yourAccount = new BankAccount (0);
          
          // 2. Call each of the methods you wrote at least once
          myAccount.withdraw (50);
          yourAccount.deposit (1);
          myAccount.deposit (1.01);
          yourAccount.withdraw (1000);
          
          // 3. Print out any results
          System.out.println ("My Account has $"+ myAccount.checkBalance ());
          System.out.println ("Your Account has $"+ yourAccount.checkBalance ());
          
          // This is what the code would look like if we had publc access to instance fields
          
          //myAccount.balance = 1000;
          //System.out.println ("The balance was reset to "+ myAccount.balance);
          //will produce an error because the balance is private 
          
     }// end main method
}// end TestBankAccount class