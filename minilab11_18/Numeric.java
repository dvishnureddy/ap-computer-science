/*
 * Ryan O'Hara
 * November 18, 2008
 * P8.11
 */
public class Numeric
{
     public static double intPower (double x, int n)
     {    
          if (n < 0)
               return 1 / Math.pow(x, -n);
          else if (n == 0)
               return  1;
          else
          {
               if ((n % 2) == 0)
               {
                    return Math.pow(Math.pow(x, n / 2), 2);
               }
               else
                    return Math.pow(x, n - 1) * x;
          }
     }
}
