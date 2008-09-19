/**
  *Connect 4 
  *Ryan O'Hara
  */

import java.util.Random;
import java.util.Scanner;

class Connect4Tester
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          //initialize the board
          Connect4 game = new Connect4();
          
          // These two ints will help determine who will go first.
          int headTail, goFirst = -1;
          
          // These String handle the game playing process.
          String winner, turn = "-", playAgain = "-";
          
          boolean whoseTurn; //true means it is player 1's turn
          // and false means player 2
          
          boolean stillPlay = true; //controls when to leave the
          // game
          
          // Random number generator to determine who goes first.
          Random gen = new Random ();
          
          
          // Here's where the game begins.  Loop until the player
          // chooses to leave the game.
          while (stillPlay)
          {
               TwoPlayers players = new TwoPlayers ();
               
               // Print the welcome board.
               System.out.println ("\n\n\n Welcome to Connect 4\n");
               
               // Get the players' names.
               System.out.print ("Player 1 please enter your first name: ");
               players.setP1Name (in.next());
               
               System.out.print ("Player 2 please enter your first name: ");
               players.setP2Name (in.next());
               
               
               // Determine who will go first.
               System.out.print ("\n\nWe will flip a binary-coin to see who will " +
                                 "go first.\n" + players.getP1Name () + ", enter 0 " +
                                 "for heads or 1 for tails: ");
               headTail = gen.nextInt (2);
               
               
               goFirst = -1;
               while (goFirst < 0 || goFirst > 1)
               {
                    goFirst = in.nextInt ();
                    
                    if (goFirst < 0 || goFirst > 1)
                         System.out.print ("Invalid entry.\n" + players.getP1Name () + ", enter 0" +
                                           " for heads or 1 for tails: ");
               }
               
               System.out.println (getHeadsOrTails (headTail) +
                                   " was flipped. ");
               if (goFirst == headTail)
               {
                    System.out.println (players.getP1Name () + " will go first and " +
                                        "will be Rs.");
                    players.setP1Piece ();
                    whoseTurn = true;
               }
               else
               {
                    System.out.println (players.getP2Name () + " will go first and " +
                                        "will be Bs");
                    players.setP2Piece ();
                    whoseTurn = false;
               }
               
               //loop until a player wins
               do 
               {
                    System.out.println ("Please hit enter to continue...");
                    in.nextLine();
                    
                    if (whoseTurn)
                    {
                         //call the takeTurn method based on whose turn it is.
                         takeTurn (players.getP1Name(), players.getP1Piece(), game);
                         whoseTurn = false;
                    }
                    else
                    {
                         takeTurn (players.getP2Name(), players.getP2Piece(), game);
                         whoseTurn = true;
                    }
                    
                    System.out.println ("\n\nHere is how the board currently looks:\n" + game);
                    
                    
                    winner = game.checkBoard();
               }//end do to keep entering pieces
               while (winner.equals("N"));
               
               if (winner.equals(players.getP1Piece()))
                    System.out.println (players.getP1Name () + " is the winner");
               else if (winner.equals(players.getP2Piece()))
                    System.out.println (players.getP2Name() + " is the winner");
               else
                    System.out.println ("It's a tie.");
               
               playAgain = "-";
               while (!playAgain.equals("y") && !playAgain.equals("n"))
               {
                    System.out.print ("Would you like to play again? (y or n):");
                    playAgain = in.next().toLowerCase ();
                    
                    if (!playAgain.equals("y") && !playAgain.equals("n"))
                         System.out.println ("Invalid input.  Please try again");
               } // end while
               
               if (playAgain.equals("y"))
                    stillPlay = true;
               else
                    stillPlay = false;
               
          }//end do
          while (stillPlay);
          
     } //end main method
     
     
     public static void takeTurn (String name, String piece, Connect4 game)
     {
          Scanner in = new Scanner (System.in);
          
          int row = -1, column = -1;
          boolean spaceAvailable = true;
          
          //Loop until the player chooses a valid space on the board
          do
          {
               row = -1;
               column = -1;
               System.out.println ("\n\n" + name + ", it is your turn.");
               System.out.println ("What column would you like to place your " + piece +
                                   " in?");
               
               while (column < 1 || column > 7)
               {
                    System.out.print (game.getBoardOutputColumns () + 
                                      "\n\nColumn: ");
                    column = in.nextInt ();
                    if (column < 1 || column > 6)
                         System.out.println ("You have entered an invalid number of columns." + 
                                             " Please enter again.");
                    if (row < 1)
                         System.out.println ("This column is full.  Please enter again.");
               
               }
               
               
               
               spaceAvailable = game.setPiece (piece, row, column);
               
               if (!spaceAvailable)
                    System.out.println ("That space is taken.  Please try again.");
          } // end do
          while (!spaceAvailable);
          
     } // end takeTurn method
     
     
     
     public static String getHeadsOrTails (int ht)
     {
          if (ht == 0)
          {
               return "Heads";
          }
          else
          {
               return "Tails";
          }
     } // end getHeadsOrTails method
     
} // end TicTacToe method