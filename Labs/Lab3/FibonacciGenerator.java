/* Ryan O'Hara
 * Fibonacci Generator
 * 10-8-08
 */


public class FibonacciGenerator
{
     private double fold1;
     private double fold2;
     private double fnew;
     private double numStore;
     
     public FibonacciGenerator (double num)
     {
          numStore = num;
          fold1 = 1;
          fold2 = 0;
     }
     
     
     public double nextNumber()
     {
          fnew = fold1 + fold2;
          fold1 = fold2;
          fold2 = fnew;
          numStore--;
          return fnew;
     }
     
     public double toGen()
     {
          return numStore;
     }
} 



     
          