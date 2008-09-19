/**
   This program tests the Triangle class.
*/
import java.util.*;

public class TriangleTester
{
   public static void main(String[] args)
   {
        Scanner in = new Scanner (System.in);
        
        System.out.println ("Please enter the size of the triangle");
        int size = in.nextInt();
        System.out.print ("Please enter the symbol to print: ");
        String symbol = in.next();
        
        Triangle theTriangle = new Triangle(size, symbol);
        System.out.println(theTriangle);
        
   }
}
