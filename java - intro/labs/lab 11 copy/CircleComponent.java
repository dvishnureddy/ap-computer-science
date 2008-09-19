import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
   A component that draws a cricle with the coordinates and radius given by the user.
*/
public class CircleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      Color black = Color.BLACK;
      
      String x;
      x = JOptionPane.showInputDialog ("Please enter the x coordinate: ");
      
      String y;
      y = JOptionPane.showInputDialog ("Please enter the y coordinate: ");
      
      String r;
      r = JOptionPane.showInputDialog ("Please enter the radius of the circle: ");
      
      double xDouble = Double.parseDouble (x);
      double yDouble = Double.parseDouble (y);
      double rDouble = Double.parseDouble (r);
      
      // Constructs a circle and draw it
      Ellipse2D.Double c1 = new Ellipse2D.Double (xDouble, yDouble, 2 * rDouble, 2 * rDouble);
      
      g2.draw (c1);
   }
}
