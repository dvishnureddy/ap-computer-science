import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.*;

/**
   This component lets the user connect two points with a line and prints the slope of the line on the screen.
*/
public class SlopeComponent extends JComponent
{  
     
     private Point2D.Double point1;
     private Point2D.Double point2;
     private Line2D.Double line;
     
     private boolean whichPoint; //true for point1 and false for point2
   public SlopeComponent()
   {  
        point1 = null;
        point2 = null;
        line = null;
        
        whichPoint = true;
   }

   public void paintComponent(Graphics g)
   {  
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;

      if (line != null)
           g2.draw(line);
      
      double x1 = point1.getX();
      double y1 = point1.getY();
      double x2 = point2.getX();
      double y2 = point2.getY();
      
      double slope = ((y1 - y2)/(x1 - x2)); //slope formula 
      
      double mx = (x1 + x2) / 2;
      double my = (y1 + y2) / 2;
      
      g2.drawString ("slope = "+ slope, (float) mx, (float) my);
   }

   /**
      Sets the next point of the component.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   public void setPoint(int x, int y)
   {
      if (whichPoint) //if it's true then set point1
           point1 = new Point2D.Double (x, y);
      else
           point2 = new Point2D.Double (x, y);
      
      whichPoint = !whichPoint;
      
      if (point1 != null && point2 != null)
           line = new Line2D.Double (point1, point2);
      
      repaint();      
   }
} 
