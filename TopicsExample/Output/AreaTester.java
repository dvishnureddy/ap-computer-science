import java.awt.Rectangle;

public class AreaTester
{
     public static void main (String args[])
     {
          Rectangle r = new Rectangle (5, 10, 20, 30);
          System.out.println ("The area of the rectangle is " + r.getWidth() * r.getHeight());
     }
}