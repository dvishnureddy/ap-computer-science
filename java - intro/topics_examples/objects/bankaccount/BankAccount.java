/**
 * The BankAccount object simulates the baisic features of a normal bank account.
 * @author Ryan O'Hara
 * @Version 1.0
 */

public class BankAccount
{
     //Create an instance field for the balance of the account
     // This variable is global and can be accessed or modified in any method or constructor
     private double balance;
     
     /**
      * Create a BankAccount with an initial balance
      * 
      * @param initBalance the initial balance of the account
      */
     
     public BankAccount (double initBalance)
     {
          balance = initBalance;
     }// end BankAccount constructer 
     
     /**
      * Dposits a specified amount into the bank account
      * 
      * @param amount the amount to deposit 
      */
    
     public void deposit (double amount)
     {
          balance += amount;
     }//end  deposit method 
     
     
     /**
      * Withdraws a specified amount from the bank account
      * 
      * @param amount the amount to withdraw 
      */
     
     public void withdraw (double amount)
     {
          balance -= amount;
     }//end  withdraw method 
     
     
     /**
      * Returns the current balance in the bank account
      * 
      * @return the current balance 
      */
     
     public double checkBalance ()
     {
     return balance;
     }//end checkBalance method 
     
}//end bankAccount class