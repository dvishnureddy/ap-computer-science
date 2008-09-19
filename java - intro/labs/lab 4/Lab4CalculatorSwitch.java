/***************************
  * Ryan O'Hara
  * October 29. 2007
  * This program will simulate a calculator
  ***************************/
import java.util.Scanner;

public class Lab4CalculatorSwitch
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          char sign;
          
          double number1, number2, answer;
          
          System.out.println ("Instead of using the nomral mathmatical signs use: A for addition, S for subtraction, D for division, M for multiplication, and O for modular division");
          
          System.out.println ("\nPlease enter your first number: ");
          number1 = in.nextDouble ();
          
          System.out.println ("\nPlease enter the sign you want to use: ");
          sign = Character.toUpperCase (in.next ().charAt (0));
          
          System.out.println ("\nPlease enter your second number: ");
          number2 = in.nextDouble ();
          
          switch (sign)
          {
               case 'A':
                    answer = number1 + number2;
                    System.out.println (number1 +" + "+ number2 +" = "+ answer);
                    break;
               case 'S':
                    answer = number1 - number2;
                    System.out.println (number1 +" - "+ number2 +" = "+ answer);
                    break;
               case 'M':
                    answer = number1 * number2;
                    System.out.println (number1 +" * "+ number2 +" = "+ answer);
                    break;
               case 'D':
                    answer = number1 / number2;
                    System.out.println (number1 +" / "+ number2 +" = "+ answer);
                    break;
               case 'O':
                    answer = number1 % number2;
                    System.out.println (number1 +" % "+ number2 +" = "+ answer);
                    break;
               default:
                    System.out.println ("You did not type a correct letter.");
                    break;     
          }
          
     }//end main method
}//end Lab4CalculatorSwitch class