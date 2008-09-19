/**
 * Ryan O'Hara
 * Description: This object will be used to random numbers from 1-100
 */
import java.util.Random;

public class RandomGenerator
{
     public static void main (String Args [])
     {
          Random gen = new Random ();
          
          int num;
          double sum;
          double max;
          double average;
          
          max = 0.0;
          sum = 0.0;
          
          for (int i = 0; i < 100; i++)
          {
               num = gen.nextInt(1000) + 1;
               if (num > max)
                    max = num;
               sum += num;
          }
          average = sum / 100.0;
          
          System.out.println ("The maximum number is "+ max +", the average is "+ average+".");  
     }
}