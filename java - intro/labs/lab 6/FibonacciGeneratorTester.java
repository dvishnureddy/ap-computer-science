public class FibonacciGeneratorTester
{
     public static void main(String[] args)
     {
          FibonacciGenerator fGen = new FibonacciGenerator (20);
          
          while (fGen.toGen() > 0)
               
               System.out.println (fGen.nextNumber());
     }
     
}