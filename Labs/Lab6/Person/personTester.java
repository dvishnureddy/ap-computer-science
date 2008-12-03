/*
 * Ryan O'Hara
 * November 24, 2008
 * tests quiz
 */

public class personTester
{
     public static void main(String[] args)
     {
          class PersonMeasurer implements Measurer
          {
               public double measure(Object o)
               {
                    Person p = (Person) o;
                    double tallest = p.getHeight();
                    return tallest;
               }
          }
          DataSet personData = new DataSet();
          Measurer pm = new PersonMeasurer();
          
          personData.add(new Person("Ryan", 140.0));
          personData.add(new Person("Jim", 150.0));
          personData.add(new Person("Sean", 120.0));
          personData.add(new Person("Greg", 135.0));
          
          double average =  (personData.getAverage());
          
          Measurable max = personData.getMaximum();
          
          Person m = (Person) personData.getMaximum();
          
          System.out.println("Average height: " + average+ " cm");
          System.out.println("Expected: 136.25 cm");
         
          
          System.out.println("Tallest person is: " + m.getName());
          System.out.println("Expected: Jim");
     }
}
          
