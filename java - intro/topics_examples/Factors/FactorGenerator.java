/**
 This class prints out all the factors of an input value.
 */
public class FactorGenerator
{
   private int num;
   private int factor;
   
   /**
    Creates a FactorGenerator object used to determine the factor of
    an input value.
    @param aNum is the input value
    */
   public FactorGenerator(int aNum)
   {
      num = aNum;
      factor = 2;
   }
   
   public void reset ()
   {
        factor = 2;
   }
   
   /**
    Determine whether or not there are more factors.
    @return true there are more factors
    */
   public boolean hasMoreFactors()
   {
      while (factor <= num/2 && num % factor != 0)
         factor++;
      return factor <= num/2;
   }
   
   /**
    Calculate the next factor of a value.
    @return factor the next factor
    */
   public int nextFactor()
   {
      if (!hasMoreFactors())
         return 0;
      int next = factor;
      factor++;
      return next;
   }
   
}