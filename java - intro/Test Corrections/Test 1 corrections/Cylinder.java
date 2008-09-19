/**
 * This class receives data for a Cylinder object
 */
public class Cylinder
{
     //These two variables will store the radius and height.
     private double radius;
     private double height;
     
     //Here is the constructor
     public Cylinder (double r, double h)
     {
          radius = r;
          height = h;
     }//end costructor
     
     
     //This method returns the radius
     public double getRadius ()
     {
          return radius;
     }//end getRadius method
     
     
     //This method returns the height
     public double getHeight ()
     {
          return height;
     }//end getHeight method
     
}//end Cylinder class