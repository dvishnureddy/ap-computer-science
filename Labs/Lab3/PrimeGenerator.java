/* Ryan O'Hara
 * Prime Generator
 * 10/20/08
 */
public class PrimeGenerator
{
  private int numStore, num;
  
  public PrimeGenerator (int n)
  {
    numStore = n;
    num = 1;
  }
  
  public int newPrime ()
  {    
    while (num <= numStore)
    {     
      num ++;   
      boolean isPrime = true;
      for(int i = 2; i <= num/2; i ++)
      {       
        if(num <= 1 && num < numStore || (num > 2 && num % i == 0))
        {           
          isPrime = false;
        }
      }
      if(isPrime)
        return num;
      
    }   
    return num;    
  }//end newPrime
  
  public int getNum ()
  {
    return num;
  }
}