/* Ryan O'Hara
 * greeter
 * September 25, 2008
 */
public class Greeter
{
     private String name;
     private String greeting;
     private int s;
     
     public Greeter (String n)
     {
          name = n;
          String g = greeting;
          s = 1;
          
          if (s==1)
          {
               greeting = ("Hello "+ name);
          }
     }
     
     public void sayGoodbye ()
     {
          s *= -1;
          if (s==-1)
          {
               greeting = ("Goodbye "+ name);
          }
     }
     
     public void refuseHelp ()
     {
          s *= 0;
          if (s==0)
          {
               greeting = ("I'm sorry "+ name +" I can't do that.");
          }
     }
     
     public String getGreeting ()
     {
         return greeting;
     }
     
}
     
     
          