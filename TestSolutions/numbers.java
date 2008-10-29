//Ryan O'Hara
//Test Makeup
//October 27, 2008

public class numbers
{   
  private int sum;

  public int mult3Sum (int a, int b)
    {
      sum = 0;
      
      for (int i = a; i <= b; i++)
      {
        if ((i % 3) == 0)
        {
          sum += i;
        }
      }
      return sum;
    }
}
    