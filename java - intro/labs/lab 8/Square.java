/*Ryan O'Hara
 * MagicSquare
 * 
 * Will be used to create a 2D, nxn array that will store
 * a Magic Square with values 1, 2, 3, ..., n^2
 */

public class Square
{
     private int[][] square;
     private int rowIndex, columnIndex;
     private int size;
     
     public Square (int n)
     {
          square = new int[n][n];
          rowIndex = 0;
          columnIndex = 0;
          size = n;
     }//end constructor
     
     
     public void add (int i)
     {
          square[rowIndex][columnIndex] = i;
          
          if (columnIndex >= (size - 1))
          {
               columnIndex = 0;
               rowIndex++;
          }
          else
               columnIndex++;
     }//end add method
          

     public boolean isMagic()
     {
          //1. Check if the square is full.  Return false
          //    if not.
          
          for (int i = 0; i < rowIndex; i++)
          {
               for (int j = 0; j < columnIndex; j++)
               {
                    if (square [i][j] == 0)
                         return false;
               }
          }
          //2. Make sure that the numbers 1 through n^2 each
          //    appear EXACTLY once.  Return false if not.
          
          for (int i = 0; i < square.length; i++)
          {
               
               for (int j = 0; j < i; j++)
               {
                    if (square [j].equals (square [i]))
                    {
                         System.out.println ("This number has already been used.");
                         i -= 1;
                    }
               }    
          }
          //3. Devise a way to calculate the sums of the rows,
          //   columns and diagonals to see if they are all 
          //   equals.  Return false if not.
          

          int checkSum = 0, rowSum = 0;
          int diagonalSum1 = square [0][0], diagonalSum2 = square[0][(square[0].length) - 1];
          int [] colSums = new int [square[0].length];
          for (int j = 0; j < square[0].length; j++)
          {
               checkSum += square [0][j];
               colSums [j] = square [0][j];
          }
          
          for (int i = 0; i < square.length; i++)
          {
               for (int j = 0; j < square[i].length; j++);
               {
                    int j = 0;
                    rowSum += square [i][j];
                    colSums[j] += square [i][j];
                    
                    if (i == j)
                    {
                         diagonalSum1 += square [i][j];
                    }
                    if (i == ((square[i].length - 1) - j))
                    {
                         diagonalSum2 += square [i][j];
                    }
                    j ++;
               }
          
               if (rowSum != checkSum)
                    return false;
          }//end outside loop
          if (diagonalSum1 != checkSum || diagonalSum2 != checkSum)
               return false;
          
          for (int j = 0; j < square.length; j++)
          {
               if (colSums [j] != checkSum)
                    return true;
          }
          return true;
     }
     
     
     public String toString()
     {
          String squareOutput = "\n+-----+\n";
          for (int i = 0; i < rowIndex; i++)
          {
               squareOutput += "|";
               for (int j = 0; j < columnIndex; j++)
               {
                    squareOutput += square [i][j] + "|";
               }
               squareOutput += "\n+-----+\n";
          }
          squareOutput += "\n\n";
          return squareOutput;
     }
}//end Square class