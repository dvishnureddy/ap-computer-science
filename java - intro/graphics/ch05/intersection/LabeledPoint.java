import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
   A point with a label showing the point's coordinates.
*/
public class LabeledPoint
{
   /**
      Construct a labeled point.
      @param anX the x coordinate
      @param aY the y coordinate
   */
   public LabeledPoint(double anX, double aY)
   {
      x = anX;
      y = aY;
   }

   /**
      Draws the point as a small circle with a coordinate label.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      // Draw a small circle centered around (x, y)

      Ellipse2D.Double circle = new Ellipse2D.Double(
            x - SMALL_CIRCLE_RADIUS,
            y - SMALL_CIRCLE_RADIUS,
            2 * SMALL_CIRCLE_RADIUS,
            2 * SMALL_CIRCLE_RADIUS);

      g2.draw(circle);
    
      // Draw the label

      String label = "(" + x + "," + y + ")";

      g2.drawString(label, (float) x, (float) y);
   }

   private static final double SMALL_CIRCLE_RADIUS = 2;

   private double x;
   private double y;
}
