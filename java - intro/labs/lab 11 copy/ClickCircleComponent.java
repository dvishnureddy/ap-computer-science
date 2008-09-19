import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.*;

/**
   This component lets the user connect two points with a line and prints the slope of the line on the screen.
*/
public class ClickCircleComponent extends JComponent
{  
     
     private Point2D.Double point1;
     private Point2D.Double point2;
     private Ellipse2D.Double circle;
     
     private boolean whichPoint; //true for point1 and false for point2
   public ClickCircleComponent()
   {  
        point1 = null;
        point2 = null;
        circle = null;
        
        whichPoint = true;
   }

   public void paintComponent(Graphics g)
   {  
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;

      if (circle != null)
           g2.draw(circle);
      
      int x = (int) point1.getX();
      int y = (int) point1.getY();      
      


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
           circle = new Ellipse2D.Double (point1, 2 * radius, 2 * radius);
      
      repaint();      
   }
} 
