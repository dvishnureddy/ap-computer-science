/*Ryan O'Hara
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 This class tests the Square class.
 */
public class MagicSquareTester
{
     //This is the value for n in an n x n Square
     public static final int SIZE = 3;
     
     public static void main(String[] args)
     {  
          //This object will be used to receive the values
          //     row by row.
          Square potentialMagicSquare = new Square(SIZE);
          Scanner in = new Scanner(System.in);
          boolean more = true;
          
          while (more)
          {
               System.out.print("Enter the next integer, or 0 when done: ");
               int nextValue = in.nextInt();
               if (nextValue == 0 )
                    more = false;
               else
                    potentialMagicSquare.add(nextValue);
          }//end while
          
          //When you write a toString method, this will print out
          //  the Square in a nice format.
          System.out.print(potentialMagicSquare);
          
          if(potentialMagicSquare.isMagic())
               System.out.println("It's a magic square!");

          else
               System.out.println("It's not a magic square!");             
          
     }//end main method
}//end MagicSquareTester class