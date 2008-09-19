public class TestPoint
{
     public static void main (String args[])
     {
          Point p1 = new Point (2, 4);
          Point p2 = new Point (-1, 6);
          Point p3 = new Point (10, 0);
          
          Point farthest = findFarPoint (p1, p2, p3);
          
          System.out.println ("(" + farthest.getX() + "," + farthest.getY() + ")");
     }//end main
     
     public static Point findFarPoint (Point p1, Point p2, Point p3)
     {
          if (p1.getDistanceFromOrigin () > p2.getDistanceFromOrigin () && p1.getDistanceFromOrigin () > p3.getDistanceFromOrigin ())
               return p1;
          else if (p2.getDistanceFromOrigin () > p1.getDistanceFromOrigin () && p2.getDistanceFromOrigin () > p3.getDistanceFromOrigin ())
               return p2;
          else
               return p3;
     }
     
}
