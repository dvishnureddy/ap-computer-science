/**
   This class describes triangle objects that can be displayed
   as shapes like this:
   []
   [][]
   [][][]
*/
public class Triangle
{
     
     private int width;
     private String symbol; 

   /**
      Constructs a triangle.
      @param aWidth the number of [] in the last row of the triangle.
   */
   public Triangle(int aWidth, String aSymbol)
   {
      width = aWidth;
      symbol = aSymbol;
   }

   /**
      Computes a string representing the triangle.
      @return a string consisting of [] and newline characters
   */
   public String toString()
   {
      String r = "";
      for (int i = 1; i <= width; i++)
      {  
         // Make triangle row
         for (int j = 1; j <= i; j++)
            r = r + symbol;
         r = r + "\n";
      }
      return r;
   }


}
