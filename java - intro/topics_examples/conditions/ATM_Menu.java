/***************************
 * Ryan O'Hara
 * Date
 * Simulates the menu of an ATM machine using a switch statement 
***************************/
import java.util.Scanner;

public class ATM_Menu
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          char choice;
          
          System.out.print ("Welcome to the Java ATM.\n\n" + 
                            "What would you like to do today?\n" +
                            "\t (W)ithdrawl: Make a withdrawl. \n" +
                            "\t (D)eposit: Deposit money. \n" +
                            "\t (C)heck Balance: Check your balance. \n\n" +
                            "Enter your choice here: ");
         
         choice = Character.toUpperCase (in.nextLine ().charAt (0));
         
         switch (choice)
         {
              case 'W'://if (choice == 'W')
                   System.out.println ("How much would you like to withdrawl?");
                   break;// if missing will keep going until it breaks because it doesn't know when to stop
         
              case 'D':// else if (choice == 'D')
                   System.out.println ("How much would you like to deposit?");
                   break;   
              case 'C'://else if (choice == 'C')
                   System.out.println ("Your balance is: $0");
                   break;     
              default://else
                   System.out.println ("You did not type a correct letter.");
                   break;     
         }
     }//end main method
}//end ATM_Menu class