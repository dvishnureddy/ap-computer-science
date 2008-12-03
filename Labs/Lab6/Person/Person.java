/* Ryan O'Hara
 * November 25, 2008
 * P9.3 a data set of quizes
 */
public class Person implements Measurable
{
     String name;
     double height;
     
     public Person (String n, double h)
     {
          name = n;
          height = h;
     }
     
     public String getName ()
     {
          return name;
     }
     
     public double getHeight()
     {
          return height;
     }
     
     public double getMeasure ()
     {
          return height;
     }
}

