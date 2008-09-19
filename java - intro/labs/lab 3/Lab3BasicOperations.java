/************************************************************************
  * 
  * Introduction to Programming
  * Name: Ryan O'Hara
  * Date: October 2, 2007
  * Title: Lab3BasicOperations.java
  * Description: Performs basic operations on two int values
  * 
  *************************************************************************/

import java.util.Scanner;

public class Lab3BasicOperations
{
     public static void main (String args [])
     {
          Scanner in = new Scanner (System.in);
          
          int num1, num2;//the input variables
          int result; //the result
          
          System.out.println ("Please enter your first number: ");
          num1 = in.nextInt();
          
          System.out.println ("Please enter your second number: ");
          num2 = in.nextInt();
          
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 +" = " + result);
          
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 +" = " + result);
          
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 +" = " + result);
          
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 +" = " + result);
          
          result = num1 % num2;
          System.out.println(num1 + " % " + num2 +" = " + result);
          
//Fill in code below to prompt the user to input num1 and num2.
// Then calculate use result to store and print each operation
// including addition, subtraction, multiplication, division and
// mod (%). Make sure you print the operation and result as you go.
          
          
          
          
          
     }// end main
}// end Lab3BasicOperations class


