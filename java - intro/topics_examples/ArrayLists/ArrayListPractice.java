import java.util.ArrayList;

public class ArrayListPractice
{
     public static void main (String args [])
     {
          ArrayList words = new ArrayList ();
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (new String ("Apple"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (new String ("Banana"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (new String ("Cantaloupe"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (1, new String ("Date"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (1, new String ("Eggfruit"));
          
          //[Date, EggFruit, Apple, Banana, Cantaloupe]

          System.out.println ("Current statis:\n" + words);
          
          words.set (0, new String ("Fig"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.add (words.size (), new String ("Grape"));
          
          System.out.println ("Current statis:\n" + words);
          
          words.remove (3, new String ("Honneydew"));
          
          System.out.println ("The last word in the list is "+ words.get (words.size () - 1));
          
          //[Fig, Date, Eggfruit, Apple, Banana, Cantaloupe, Grape]
          // last word is Grape
     }
}