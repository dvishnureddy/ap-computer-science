/********************************************|
  * Ryan O'Hara                              |
  * Date                                     |
  * In this program you can play Matstermind |
  *******************************************/
import java.util.Random;// imports the Random class
import java.util.Scanner;// imports the Scanner class


public class Mastermind// name of the class
{
     public static void main (String args[])
     {
          Random gen = new Random ();
          
          Scanner in = new Scanner (System.in);
          
          String name, name1;// string variable to enter into the Scanner method
          int correctPeg1, correctPeg2, correctPeg3, correctPeg4; // int variables to enter into the Random method
          int guessPeg1, guessPeg2, guessPeg3, guessPeg4;// int variables for the Scanner method
          boolean validInput = true, correctGuess = true;// boolean variables
          
          correctPeg1 = gen.nextInt (6) + 1;//generates a random number from 1 to 6
          correctPeg2 = gen.nextInt (6) + 1;//generates a random number from 1 to 6
          correctPeg3 = gen.nextInt (6) + 1;//generates a random number from 1 to 6
          correctPeg4 = gen.nextInt (6) + 1;//generates a random number from 1 to 6
          
          System.out.println ("Please enter your name: ");
          name = in.nextLine();// Scanner method called to enter a string
          name1 = name.toUpperCase();// changes the name entered to all capitals. If the player wins their name will be in all capital letters
          
          System.out.println (name +" Welcome to Mastermind!!");
          
          System.out.println ("\n\nHere are some basic rules to this java version");
          
          System.out.println ("\n1. Please type in a number instead of a color.");
          System.out.println ("\n2. There are 4 random numbers fom 1-6 that you will have to guess in order");
          
          System.out.println ("\nred = 1 : green = 2 : blue = 3 : white = 4 : yellow = 5 : orange = 6");
          System.out.println ("\nGood Luck");
          
          System.out.println ("\nPlease enter your first guess ");
          guessPeg1 = in.nextInt();// Scanner method called to enter an int for the players guesses same as in guessPeg2, guessPeg3, guessPeg4
          
          System.out.println ("\nPlease enter your second guess ");
          guessPeg2 = in.nextInt();
          
          System.out.println ("\nPlease enter your third guess ");
          guessPeg3 = in.nextInt();     
          
          System.out.println ("\nPlease enter your fourth guess ");
          guessPeg4 = in.nextInt();      
          
          if (validInput = (guessPeg1 <=6 && guessPeg1 >=1) && (guessPeg2 <= 6 && guessPeg2 >= 1) && (guessPeg3 <=6 && guessPeg3 >=1) && (guessPeg4 <= 6 && guessPeg4 >= 1))
               validInput = true; // checks to see if the int the player entered is one of the numbers corressponding with the given colors         
          else 
               validInput = false;// if one of the numbers does not corresspond with a color then the validInput is false
          
          if (validInput)// if all numbers corresspond with a color then they will go through the following statements
          {    
               
               if (guessPeg1 == correctPeg1) //will see if the players guess is the same as the random number  
                    System.out.println ("\n\nThe first Peg you entered, "+ guessPeg1 + " is right");//will print if the players guess is right same for all four guesses
               
               else
                    System.out.println ("\n\nThe first Peg you entered, "+ guessPeg1 +" is not right");//will print if the players guess is wrong same for all four guesses
               correctGuess = false;
               
               if (guessPeg2 == correctPeg2)
                    System.out.println ("\nThe second Peg you entered, "+ guessPeg2 + " is right");
               
               else
                    System.out.println ("\nThe second Peg you entered, "+ guessPeg2 +" is not right");
               correctGuess = false;
               
               if (guessPeg3 == correctPeg3)
                    System.out.println ("\nThe third Peg you entered, "+ guessPeg3 + " is right");
               
               else
                    System.out.println ("\nThe third Peg you entered, "+ guessPeg3 +" is not right");
               correctGuess = false;
               
               if (guessPeg4 == correctPeg4) 
                    System.out.println ("\nThe fourth Peg you entered, "+ guessPeg4 + " is right");
               
               else
                    System.out.println ("\nThe fourth Peg you entered, "+ guessPeg4 +" is not right");
               correctGuess = false;
               
               if (correctGuess) //if all guess are right it will print this line
                    System.out.println ("\n\nCONGRADULATIONS "+ name1 +" YOU WON!!!");//name1 is all capital letters
               else //if one or more guesses are wrong it will print this line
                    System.out.println ("\n\nSorry "+ name +" you lost. \nTry Again.");
          
          System.out.println ("\nYour guesses were "+ guessPeg1 +","+ guessPeg2 +","+ guessPeg3 +", and "+ guessPeg4 +".");//prints out the players guesses
          System.out.println ("\nThe right numbers were "+ correctPeg1 +","+ correctPeg2 +","+ correctPeg3 +", and "+ correctPeg4 +".");//prints out the random numbers
          }
          
          else 
               System.out.println ("\n\nYou entered an invalid number.");// will tell the player they did not enter a number between 1 and 6

     }//end main method
}//end Mastermind class