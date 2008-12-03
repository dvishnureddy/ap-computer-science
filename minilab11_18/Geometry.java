/* Ryan O'Hara
 * 11/18/2008
 * P8.5
 */
public class Geometry
{
     public static double sphereVolume (double r)
     {
          return (4.0/3.0) * Math.PI * Math.pow (r, 3);
     }
     public static double sphereSurface (double r)
     {
          return 4.0 * Math.PI * Math.pow (r, 2);
     }
     public static double cylinderVolume (double r, double h)
     {
          return Math.PI * Math.pow (r, 2) * h;
     }
     public static double cylinderSurface (double r, double h)
     {
          return 2.0 * r * Math.PI * (r + h);
     }
     public static double coneVolume (double r, double h)
     {
          return Math.PI * Math.pow (r, 2) * h / 3.0;
     }
     public static double coneSurface (double r, double h)
     {
          return Math.PI * r * (r + h);
     }
}