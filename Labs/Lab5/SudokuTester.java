import java.util.Scanner;

class SudokuTester
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    
    //initialize the board
    Sudoku game = new Sudoku();
    
    int row;
    int column;
    int number;
    boolean spaceAvailable;
    boolean gameOver = false;
    System.out.println ("WELCOME TO SUDOKU\n"+game.toString());
    
    while (!gameOver)
    {
      do
      {
        System.out.println ("Please enter the row: ");
        row = in.nextInt ();
        System.out.println ("Please enter the column: ");
        column = in.nextInt ();
        System.out.println ("Please enter the number to put in row "+ row +" and column "+column+": ");
        number = in.nextInt ();
      }while (row > 9 || row < 1 || column > 9 || column < 1 || number > 9 || number < 1);
      
      spaceAvailable = game.setNumber (row, column, number);
      
      if (!spaceAvailable)
        System.out.println ("\nCannot do that.  Please try again.");
      
      System.out.print (game.toString ());
    }
  }
} // end main method
