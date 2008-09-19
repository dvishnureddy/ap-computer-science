/*
 * Ryan O'Hara
 * January 25, 2008
 */
import java.util.Scanner;

public class NameDatabase
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          System.out.print ("How many names do you want to enter? \n Enter number: ");
          int numNames = in.nextInt ();
          
          String [] names = new String [numNames];
          
          for (int i = 0; i < names.length; i++)
          {
               System.out.print ("Please enter name "+ (i + 1) +": ");
               names [i] = in.next ();
               
               for (int j = 0; j < i; j++)
               {
                    if (names [j].equalsIgnoreCase (names [i]))
                    {
                         System.out.println ("This name has already been entered please enter another: ");
                         i -= 1;
                    }
               }

          } 
          
          for (int i = 0; i < names.length; i++)
          {
               System.out.println ("Name "+ (i + 1) +" is: "+ names[i] +"\n");
          }
          
     }
}
                           
     