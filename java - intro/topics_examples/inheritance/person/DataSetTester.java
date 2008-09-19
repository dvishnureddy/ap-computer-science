import java.util.*;

/**
   This program tests the DataSet class.
*/
public class DataSetTester implements measurable
{
   public static void main(String[] args)
   {
      person p1 = new person ("John", "Doe", 24);
      measurable p2 = new person ("Kay", "Dee", 50);
      measurable c1 = new Coin (0.25, "Quarter");
      measurable s1 = new Student ("bob", "johnson", 16, 11, 3.1);
      
      ArrayList<measurable> list = new ArrayList<measurable> ();
      list.add (p2);
      list.add (s1);
      list.add (c1);//NOTE: these are initialized as completely different things, but they have one important thing in common,
      //they are both Measurable objects
      
      p1.getFirstName ();// p1 was declared as a person so no worries here
      ((person)p2).getFirstName ();//
        
      DataSet bankData = new DataSet();

      bankData.add(new person("Jim", "Smith", 34));
      bankData.add(new person("Kevin", "Cop", 10));
      bankData.add(new person("Courtney", "Thompson", 21));

      System.out.println("Average age = " 
            + bankData.getAverage());
      //Measurable max = bankData.getMaximum();
      person max = new person ("temp", "temp", 0);
      if (bankData.getMaximum() instanceof person)
      {
           max = (person) bankData.getMaximum();
      }
      System.out.println("Oldest person = "+ ((person)max).getFirstName () +" at " 
         + max.getMeasure());

      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.25, "quarter"));
      coinData.add(new Coin(0.1, "dime"));
      coinData.add(new Coin(0.05, "nickel"));

      System.out.println("Average coin value = " 
            + coinData.getAverage());
      //max = coinData.getMaximum();
      Coin max2 = (Coin) coinData.getMaximum();
      System.out.println("Highest coin value = " 
            + max2.getMeasure());
   }
}
