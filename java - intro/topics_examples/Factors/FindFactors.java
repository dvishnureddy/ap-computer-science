public class FindFactors
{
     public static void main (String args [])
     {
          FactorGenerator gen = new FactorGenerator (126000);
          
          int numFactors = 0;
          
          while (gen.hasMoreFactors ())
          {
               numFactors ++;
               gen.nextFactor();
          }//end while
          
          int [] factors = new int [numFactors];
          
          gen.reset ();
          
          System.out.println ("There are " + numFactors + " factors.");
          
          for (int i = 0; i < factors.length; i++)
          {
               factors[i] = gen.nextFactor ();
          }
          
          for (int val : factors)
               System.out.println (val);
          
          int counter = 0;
          
          for (int i = 0; i < factors.length; i++)
          {
               for (int j = (i + 1); j < factors.length; j++)
               {
                    if (findLCM (factors [i], factors [j]) == 126000)
                    {
                         counter ++;
                         System.out.println ("The LCM of " + factors [i] +" and "+ factors [j] +" is 126000");
                    }
                    
               }
          }
          System.out.println ("There are "+ counter +" pairs of LCM for 126000");
          
          System.out.println ("The LCM of 2 and 3 is "+ findLCM (2, 3));
          
     }//end main
     
     public static int findLCM (int A, int B)
     {
          int lcmA = A;
          int lcmB = B;
          
          while (lcmA != lcmB)
          {
               if (lcmA < lcmB)
                    lcmA += A;
               else 
                    lcmB += B;
          }
          return lcmA;
     }
               
               
}//end FindFactors