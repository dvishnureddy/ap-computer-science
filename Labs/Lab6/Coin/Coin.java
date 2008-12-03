/*
 * Ryan O'Hara
 * 12/3/08
 * A class to simulate a coin which implements comparable
 */
public class Coin implements Comparable<Coin>
{
     private String name;
     private double value;
     
     public Coin (String newName, double newValue)
     {
          name = newName;
          value = newValue;
     }
     
     public String getName ()
     {
          return name; 
     }
     
     public double getValue ()
     {
          return value;
     }
     
     public int compareTo (Coin other)
     {
          int result = 0;
          if (value > other.getValue())
               result = 1;
          else if (value < other.getValue())
               result = -1;
          return result;
     }
     
}
          