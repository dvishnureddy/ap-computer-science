/*
 * Ryan O'Hara
 * Lab 7 P11.2
 * Feburary 6, 2009
 */
import java.io.*;
import java.util.*;

public class floatingPointException
{      
     public static void main(String[] args)
     {
          Scanner in = new Scanner (System.in);
          double total = 0.0;
          int i = 1;
          boolean done = false;
          while (!done)
          {
               try
               {
                    System.out.println("Please enter a number: ");
                    total += Double.parseDouble(in.next());
                    System.out.println ("The total is "+total);
                    
               }
               catch (Exception e)
               {
                    if (i > 1)
                    {
                         System.out.println("You did not enter a valid number for the second time the program must close.");
                         done = true;
                    }
                    else
                    {
                         System.out.println("You did not enter a valid number please try again.");
                         done = false;
                         i++;
                    }
               }
          }
     }
}