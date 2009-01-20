/*Ryan O'Hara
 * Property class for Monopoly
 */

public class Property
{
     private String name;
     private int owner;
     private int type;
     private String color;
     private int cost;
     private int rent;
     private int morgage;
     private int space; 
          
     public Property (String n, int o, int t, String col, int cos, int r, int m, int s)
     {
          name = n;
          owner = o;
          type = t;
          color = col;
          cost = cos;
          rent = r;
          morgage = m;
          space = s;
        
          
     }
     
     public String getName()
     {
          return name;
     }
     
     public int getOwner()
     {
          return owner;
     }
     
     public void setOwner(int manager)
     {
          owner = manager;
     }
     public int getType() 
     {
          return type;
     }
     
     public String getColor()
     {
          return color;
     }
     
     public int getCost()
     {
          return cost;
     }
     
     public int getRent()
     {
          return rent;
     }
     
     public int getMorgage()
     {
          return morgage;
     }
     
     public int getSpace()
     {
          return space;
     }
     
     public String toString()
     {
          return new String ("name: " + name + "\nowner: " + owner + "\ntype: " + type + "\ncolor: " + color + "\ncost: " + cost + "\nrent: " + rent + "\nspace: " + space);
     }
     
     }
     
     