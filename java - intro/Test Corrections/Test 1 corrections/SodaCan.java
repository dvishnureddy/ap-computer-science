/*Ryan O'Hara
 * October 23, 2007
 * Test 1 Corrections
 */

public class SodaCan
 {
      public static void main (String args [])
      {
           //the first value is the radius and the second value is the height
           Cylinder can = new Cylinder (3.0, 10.0);
           
           double surfaceArea, volume;
           
           surfaceArea = (2 * can.getRadius () * can.getHeight () * Math.PI) + (2 * Math.PI * Math.pow (can.getRadius(),2));
           System.out.println ("The surface area of a soda can is "+surfaceArea);
           
           volume = Math.PI * Math.pow (can.getRadius(), 2);
           System.out.println ("The volume of a soda can is "+ volume);
           
      }//ends main method
 }//ends SodaCan class