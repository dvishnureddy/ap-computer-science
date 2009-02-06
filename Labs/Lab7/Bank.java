/*
 * Ryan O'Hara
 * 2-6-09
 * P11.15
 */
import java.util.*;
import java.io.*;

public class Bank
{      
     public static void main(String[] args)
     {
          ArrayList<BankAccount> accounts = new ArrayList<BankAccount> ();
          
          Scanner in = new Scanner (System.in);
          System.out.println("How many bank accounts do you want to enter: ");
          int nb = in.nextInt();
          double bal = 0;
          if (nb > 0)
          {
               for (int i = 0; i < nb; i++)
               {
                    try
                    {
                         System.out.println("Please enter your balance for account number "+(i+1)+": ");
                         bal = in.nextDouble();
                    }
                    catch (Exception e)
                    {
                         System.out.println ("You did not enter a valid balance number.");
                    }
                    
                    accounts.add (new BankAccount ((i+1), bal));
               }
          }
          double biggestAccount = 0;
          int accNumHigh = 0;
          for (int i = 0; i < accounts.size(); i++)
          {
                    if (accounts.get(i).getBalance() >= biggestAccount)
                    {
                         biggestAccount = accounts.get(i).getBalance();
                         accNumHigh = i;
                    }
          }
         System.out.println("Bank Account "+accounts.get(accNumHigh).getAccountNumber()+" has the highest balance of "+accounts.get(accNumHigh).getBalance());
     }
}