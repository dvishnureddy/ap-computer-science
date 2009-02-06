/*
 * Ryan O'Hara
 * The layout for writing an object
 */

public class BankAccount
{
     //1. Instance fields (values) and public static variables (constants)
     private double balance;// no value assigned yet
     private int accountNumber;
     
     //2. Constructor(s)
     //default constructor
     public BankAccount (int aNum, double b)
     {
          accountNumber = aNum;
          balance = b;
     }
     
     public BankAccount (double initBalance)
     {
          balance = initBalance;
     }
     
     //3. Methods (actions) that this object can perform
     public double getBalance()
     {
          return balance;
     }//end getBalance method
     
     public int getAccountNumber ()
     {
          return accountNumber;
     }
     
     public void deposit (double amount)
     {
          balance = balance + amount;
     }//end deposit method
     
}//end BankAccount class
     