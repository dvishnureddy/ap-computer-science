/***********************************************************
  * 
  * Description: AllAboutStrings.java takes you through a series of
  *           things you can do with the String class.
  * 
  **********************************************************/
import java.util.Scanner;

public class AllAboutStrings
{
     public static void main (String args[])
     {
          Scanner in = new Scanner (System.in);
          
          
          System.out.println ("\n\nString example 1");
          System.out.println ("\nStrings can be initialized three different valid ways:");
          
          String s1 = new String ("hi");
          
          System.out.println ("\nFirst way:");
          System.out.println ("s1 was initialized by saying 'String s1 = new String ()'");
          System.out.println ("\tNOTE s1 does not yet have a values so it is empty\ns1 = " + s1);
          
          String s2 = new String ("Cool!");
          
          System.out.println ("\nSecond way:");
          System.out.println ("s2 was initialized by saying 'String s2 = new String (\"Cool!\")'");
          System.out.println ("\ts2 initially is set to an initial value\ns2 = " + s2);
          
          String s3 = "Neat!";
          
          System.out.println ("\nThird way:");
          System.out.println ("s3 was initialized by saying 'String s3 = \"Neat!\"'");
          System.out.println ("\ts3 is easily set to a Literal String\ns3 = " + s3);
          
          System.out.print ("\n\nHit Return to continue:");
          in.nextLine();
          
          System.out.println ("\n\nString example 2");
          System.out.println ("\nHere are some examples to check String equality:");
          
          String name_1 = new String("Henry");
          String name_2 = new String("Henry");
          String name_3 = new String ("HENRY");
          
          System.out.println ("\nname_1 = " + name_1);
          System.out.println ("name_2 = " + name_2);
          System.out.println ("name_3 = " + name_3);
          
          System.out.println ("\nThe result of 'name_1 == name_2' is " + (name_1 == name_2));
          System.out.println ("\nThe result of 'name_1 == name_3' is " + (name_1 == name_3));
          System.out.println ("\n\tNOTE: THE VARIABLE NAMES POINT NOT TO STRING VALUES, BUT MEMORY ADDRESS VALUES!");
          System.out.println ("\nThe result of 'name_1.equals(name_2)' is " + (name_1.equals(name_2)));
          System.out.println ("\nThe result of 'name_1.equals(name_3)' is " + (name_1.equals(name_3)));
          System.out.println ("\nThe result of 'name_1.equalsIgnoreCase(name_3)' is " + (name_1.equalsIgnoreCase(name_3)));
          System.out.println ("\nThe result of 'name_1.compareTo(name_2)' is " + (name_1.compareTo(name_2)));
          System.out.println ("\nThe result of 'name_1.compareTo(name_3)' is " + (name_1.compareTo(name_3)));
          System.out.println ("\nThe result of 'name_3.compareTo(name_1)' is " + (name_3.compareTo(name_1)));
          
          String lowercase_a = "a";
          String lowercase_b = "b";
          String lowercase_g = "g";
          
          System.out.print ("\n\nHit Return to continue:");
          in.nextLine();
          
          System.out.println ("\n\nCheck this out:\n'a' has the numerical value " + Character.getNumericValue ('a'));
          System.out.println ("'A' has the numerical value " + Character.getNumericValue ('A'));
          System.out.println ("'g' has the numerical value " + Character.getNumericValue ('g'));
          
          System.out.println ("\nThe result of 'lowercase_a.compareTo(lowercase_b)' is " +
                              (lowercase_a.compareTo(lowercase_b)));
          System.out.println ("\nThe result of 'lowercase_b.compareTo(lowercase_a)' is " +
                              (lowercase_b.compareTo(lowercase_a)));
          System.out.println ("\nThe result of 'lowercase_a.compareTo(lowercase_g)' is " +
                              (lowercase_a.compareTo(lowercase_g)));
          System.out.println ("\nThe result of 'lowercase_g.compareTo(lowercase_a)' is " +
                              (lowercase_g.compareTo(lowercase_a)));
          
          
          System.out.print ("\n\nHit Return to continue:");
          in.nextLine();
          
          System.out.println ("\n\nString example 3");
          System.out.println ("\nHere are some examples looking at String methods" +
                              " length, charAt and indexOf:");
          
          String String_1 = new String("abcdefg");
          
          System.out.println ("\n\nLet's look at 'String String_1 = new String(\"" + String_1 + "\")' first using the charAt method:");
          System.out.println ("\tindex:    0 1 2 3 4 5 6");
          System.out.println ("\tString_1: a b c d e f g");
          
          System.out.println ("\n'String_1.indexOf ('a')' = " + String_1.indexOf ('a'));
          System.out.println ("'String_1.indexOf ('d')' = " + String_1.indexOf ('d'));
          System.out.println ("'String_1.indexOf ('g')' = " + String_1.indexOf ('g'));
          System.out.println ("'String_1.indexOf ('x')' = " + String_1.indexOf ('x'));
          System.out.println ("'String_1.indexOf ('A')' = " + String_1.indexOf ('A'));
          
          System.out.print ("\n\nHit Return to continue:");
          in.nextLine();
          
          String String_2 = new String("Encyclopedia");
          
          System.out.println ("\n\nNow let's look at 'String String_2 = new String(\"" + String_2 + "\")' using the length and charAt methods:");
          System.out.println ("\tindex:    0 1 2 3 4 5 6 7 8 9 10 11");
          System.out.println ("\tString_2: E n c y c l o p e d i  a");
          System.out.println ("\nNow we will us the charAt method to see the letter at each index..");
          
          System.out.println ("'String_2.charAt (0)' is " + String_2.charAt (0));
          System.out.println ("'String_2.charAt (1)' is " + String_2.charAt (1));
          System.out.println ("'String_2.charAt (2)' is " + String_2.charAt (2));
          System.out.println ("'String_2.charAt (3)' is " + String_2.charAt (3));
          System.out.println ("'String_2.charAt (4)' is " + String_2.charAt (4));
          System.out.println ("'String_2.charAt (5)' is " + String_2.charAt (5));
          System.out.println ("'String_2.charAt (6)' is " + String_2.charAt (6));
          System.out.println ("'String_2.charAt (7)' is " + String_2.charAt (7));
          System.out.println ("'String_2.charAt (8)' is " + String_2.charAt (8));
          System.out.println ("'String_2.charAt (9)' is " + String_2.charAt (9));
          System.out.println ("'String_2.charAt (10)' is " + String_2.charAt (10));
          System.out.println ("'String_2.charAt (11)' is " + String_2.charAt (11));
          
          System.out.println ("\nAlso, 'String_2.charAt (-1)' = StringIndexOutOfBoundsException");
          System.out.println ("  and 'String_2.charAt (12)' = StringIndexOutOfBoundsException");
          //String_2.charAt (12);
          
          System.out.print ("\n\nHit Return to continue:");
          in.nextLine();
          
          System.out.println ("\n\nWe can also use the substring method to\n" +
                              "chop up a String into smaller parts.  The important\n" +
                              "thing to remember is that there are two versions of\n"+
                              "substring.");
          
          System.out.println ("\n\nVersion 1: .substring(int start, int end)");
          System.out.println ("\nFor this version, the start index tells us\n"+
                              "where to begin the cut and end tells us where to\n" +
                              "stop although the ending index is NOT included in the" +
                              "substring.");
          
          String word = "Saint Joe's Prep";
          System.out.println ("\nExample: \tString word = \"Saint Joe's Prep\";");
          System.out.println ("\n\t\tString sub1 = word.substring (0, 4); //will be \"" +
                              word.substring (0, 4) +"\"");
          System.out.println ("\n\t\tString sub2 = word.substring (2, 6); //will be \"" +
                              word.substring (2, 6) +"\"");
          System.out.println ("\n\t\tString sub3 = word.substring (6, word.length()); //will be \"" +
                              word.substring (6, word.length()) +"\"");
          
          System.out.println ("\n\nVersion 2: .substring(int start)");
          System.out.println ("\nFor this version, the start index tells us\n"+
                              "where to begin the cut and the substring goes to\n"+
                              "the end of the String.");
          
          String 
               word2 = "Mrs. Kettinger";
          System.out.println ("\nExample: \tString word2 = \"Mrs. Kettinger\";");
          System.out.println ("\n\t\tString sub4 = word2.substring (6); //will be \"" +
                              word2.substring (6) +"\"");
          
          System.out.println ("\n\nGood luck with the assignment!");
          
     }//end main method
     
}//end AllAboutStrings class