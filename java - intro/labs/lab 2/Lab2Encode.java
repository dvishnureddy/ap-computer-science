/************************************************************************
  * 
  * Introduction to Programming
  * Name: Ryan O'Hara
  * Date: September 24, 2007
  * Title: Lab2Encode.java
  * Description: Gives an example of how to encode a String.
  * Input: A String
  * Output: an encoded String.
  * 
  *************************************************************************/

import javax.swing.JOptionPane;

public class Lab2Encode
{
     public static void main (String args [])
     {
          String word;
          word = JOptionPane.showInputDialog
               ("Please enter the word you wish to encode?");
          
//Find the number of letters and print it out.
          int numLetters = word.length();
          JOptionPane.showMessageDialog
               (null, "The word you entered has " + numLetters +
                " letters.");
          
//Generate all capitals and print out the result.
          String allUpperCase = word.toUpperCase();
          JOptionPane.showMessageDialog
               (null, "Here is your word with all upper case letters: " + allUpperCase);
          String word1 = word.replace ('a','@');
          String word2 = word1.replace ('e','?');
          String word3 = word2.replace ('i','!');
          String word4 = word3.replace ('o','8');
          String word5 = word4.replace ('u','%');
          
          JOptionPane.showMessageDialog
               (null, "Here is your word with encoded letters: " + word5);
          
          /* Here is where you will add your code */
          
          
     }
}