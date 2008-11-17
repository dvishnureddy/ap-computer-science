/*
 * Ryan O'Hara
 * 11/5/08
 * A class to simulate a coin
 */
public class Coin
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
     
}
          