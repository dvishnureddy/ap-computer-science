import java.util.Scanner;

/*
 * Ryan O'Hara
 * November 18, 2008
 * Tests geometry
 */
public class GeometryTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a radius: ");
      double r = in.nextDouble();
      
      System.out.println("Enter a height: ");
      double h = in.nextDouble();

      System.out.println("The Volume of the sphere with radius "+r+" is: "+ Geometry.sphereVolume(r));
      System.out.println("The Surface Area of the sphere with radius "+r+" is: "+ Geometry.sphereSurface(r));
      
      System.out.println("The Volume of the cylinder with radius "+r+" and height "+h+ " is: "+ Geometry.cylinderVolume(r, h));
      System.out.println("The Surface Area of the cylinder with radius "+r+" and height "+h+ " is: "+ Geometry.cylinderSurface(r, h));
      
      System.out.println("The Volume of the cone with radius "+r+" and height "+h+ " is: "+ Geometry.coneVolume(r, h));
      System.out.println("The Surface Area of the cone with radius "+r+" and height "+h+ " is: "+ Geometry.coneSurface(r, h));
   }
}
