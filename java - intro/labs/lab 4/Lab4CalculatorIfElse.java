/***************************
  * Ryan O'Hara
  * October 29. 2007
  * This program will simulate a calculator
  ***************************/
import java.util.Scanner;

public class Lab4CalculatorIfElse
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          char sign;
          
          double number1, number2, answer;
          
          System.out.println ("Instead of using the nomral mathmatical signs use: + for addition, - for subtraction, / for division, * for multiplication, and % for mod");
          
          System.out.println ("\nPlease enter your first number: ");
          number1 = in.nextDouble ();
          
          System.out.println ("\nPlease enter the sign you want to use: ");
          sign = Character.toUpperCase (in.next ().charAt (0));
          
          System.out.println ("\nPlease enter your second number: ");
          number2 = in.nextDouble ();           
          
          if (sign == '+')
          {
               answer = number1 + number2;
          System.out.println (number1 +" + "+ number2 +" = "+ answer);
          }
          
          else if (sign == '-')
          {
               answer = number1 - number2;
          System.out.println (number1 +" - "+ number2 +" = "+ answer);
          }
          
          else if (sign == '/')
          {
               answer = number1 / number2;
          System.out.println (number1 +" / "+ number2 +" = "+ answer);
          }
          
          else if (sign == '*')
          {
               answer = number1 * number2;
          System.out.println (number1 +" * "+ number2 +" = "+answer);
          }
          
          else if (sign == '%')
          {
               answer = number1 % number2;
          System.out.println (number1 +" % "+ number2 +" = "+ answer);
          }
          
          else
               System.out.println ("You did not enter a correct sign.");
          
     }//end main method
}//end Lab4CalculatorIfElse class