import java.util.ArrayList;

public class ArrayListPractice
{
     public static void main (String args [])
     {
          ArrayList words = new ArrayList ();// []
          
          System.out.println ("Current status:\n" + words);
          
          words.add (new String ("Apple"));// [Apple]
          
          System.out.println ("Current status:\n" + words);
          
          words.add (new String ("Banana"));// [Apple, Banana]
          
          System.out.println ("Current status:\n" + words);
          
          words.add (new String ("Cantaloupe"));// [Apple, Banana, Cantaloupe]
          
          System.out.println ("Current status:\n" + words);
          
          words.add (1, new String ("Dates"));// [Apple, Dates, Banana, Cantaloupe]
          
          System.out.println ("Current status:\n" + words);
          
          words.add (1, new String ("Eggfruit"));// [Apple, Eggfruit, Dates, Banana, Cantaloupe]
          
          //[current status?]
          
          System.out.println ("Current status:\n" + words);
          
          String replacedWord = (String) words.set (0, new String ("Fig"));
          System.out.println ("We just replaced " + replacedWord);
          //[Fig, Eggfruit, Dates, Banana, Cantaloupe]
          //"We just replaced Apple
          
          System.out.println ("Current status:\n" + words);
          
          words.add (words.size (), new String ("Grape"));
                                                            // 0      1        2       3          4        5
          System.out.println ("Current status:\n" + words);//[Fig, Eggfruit, Dates, Banana, Cantaloupe, Grape]
          
          words.add (new String ("Honeydew"));//[Fig, Eggfruit, Dates, Banana, Cantaloupe, Grape, Honeydew]
          
          String removedWord = (String) words.remove (3);//[Fig, Eggfruit, Dates, Cantaloupe, Grape, Honeydew]
          System.out.println ("We just removed " + removedWord);// "We just removed Banana
          
          System.out.println ("The last word in the list is " + words.get (words.size () - 1)); // Honeydew
          //current status is?
          //last word is?
          
          System.out.println ("Final status:\n" + words);//[Fig, Eggfruit, Dates, Cantaloupe, Grape, Honeydew]
          
          
     }//end main method
}//end ArrayListPractice class
