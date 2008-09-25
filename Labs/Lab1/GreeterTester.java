/**
 * Tests the Greeter object
 * Ryan O'Hara
 * September 25, 2008
 */
public class GreeterTester
{
     
     public static void main (String args [])
     {
          Greeter world = new Greeter ("World");
          Greeter dave = new Greeter ("Dave");
          Greeter ryan = new Greeter ("Ryan");
          
          dave.sayGoodbye ();
          world.refuseHelp ();
          
          System.out.println (""+ dave.getGreeting ());
          System.out.println (""+ world.getGreeting ());
          System.out.println (""+ ryan.getGreeting ());
     }
     
     
     
}
          
          