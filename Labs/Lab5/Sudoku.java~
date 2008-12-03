/* 
 * Ryan O'Hara
 * November 14, 2008
 * Sudoku
 */
public class Sudoku
{
     private int[][] board;
     private static final int ROWS = 9;
     private static final int COLUMNS = 9;
     
     /**
      Constructs an empty board.
      */
     public Sudoku()
     {
          board = new int[ROWS][COLUMNS];
          initializeBoard();
     }
     
     /*
      * This method resets the board to all blanks.
      */
     public void initializeBoard ()
     {
          for (int i = 0; i < ROWS; i++)
               for (int j = 0; j < COLUMNS; j++)
               board [i][j] = 0;
     } // end initializeBoard method
     
     
     /*
      * Sets the indicated piece onto the board.
      * @param row the row to check
      * @param column the column to check
      * @param num the number to put in the sudoku
      * @return returns false if the piece was not added
      * successfully.
      */
     public boolean setNumber (int r, int c, int num)
     {
          boolean open = true;
          
          if (board [r - 1][c - 1] != 0)
            open = false;
          
          for (int i = 0; i < ROWS; i++)
          {
            if (board [i][c - 1] == num)
              open = false;
          }
          for (int i = 0; i < COLUMNS; i++)
          {
            if (board [r-1][i] == num)
              open = false;
          }
          
          if (open)
            board [r-1][c-1] = num;
          
          return open;
     }//end setNumber method
     
     /**
      Creates a string representation of the board
      @return the string representation
      */
     public String toString()
     {
          String boardOutput = "\n+-----+-----+-----+";
          for (int i = 0; i < 3; i++)
          {
               boardOutput += "\n|";
               for (int j = 0; j < COLUMNS; j++)
               {
                 if (board [i][j] == 0)
                   boardOutput += " |";
                 else 
                   boardOutput += board [i][j] + "|";
               }
                 boardOutput += "\n+-----+-----+-----+";
          }
          boardOutput += "\n\n";
          
          return boardOutput;
     }//end toString method
     
     
     /*
      * This method returns the board (a 2-d array)
      * so that the player can see the row numbers.
      */
     public String getBoardOutputRows ()
     {
          String boardOutput = "\n      +-----+-----+-----+\n";
          for (int i = 0; i < ROWS; i++)
          {
               if (i == 1)
               {
                    boardOutput += "Rows ";
               }
               else
               {
                    boardOutput += "     ";
               }
               boardOutput += (i + 1) + "|";
               for (int j = 0; j < COLUMNS; j++)
               {
                    boardOutput += board [i][j] + "|\n";
               }
               boardOutput += "\n      +-----+-----+-----+\n";
          }
          return boardOutput;
          
     } // end getBoardOutputRows method
     
     
     /*
      * This method returns the board (a 2-d array)
      * so that the player can see the column numbers.
      */
     public String getBoardOutputColumns ()
     {
          String boardOutput = "\n      Columns\n       1 2 3 4 5 6 7 8 9\n";
          boardOutput += "      +-----+-----+-----+\n";
          for (int i = 0; i < ROWS; i++)
          {
               boardOutput += "      |";
               for (int j = 0; j < COLUMNS; j++)
               {
                    boardOutput += board [i][j] + "|";
               }
               boardOutput += "\n      +-----+-----+-----+\n";
          }
          
          return boardOutput;
     } // end getBoardOutputColumns method
     
}