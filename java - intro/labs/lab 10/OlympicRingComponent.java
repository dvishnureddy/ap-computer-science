import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * Ryan O'Hara
   A component that draws Olympic Rings.
*/
public class OlympicRingComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      
      Color black = Color.BLACK;
      Color blue = Color.BLUE;
      Color red = Color.RED;
      Color green = Color.GREEN;
      Color yellow = Color.YELLOW;
      Color white = Color.WHITE;
      
      Rectangle2D.Double box = new Rectangle2D.Double (0, 0, 350, 200);
      g2.setColor (white);
      g2.fill (box);
      
      Ellipse2D.Double blueRing = new Ellipse2D.Double (10, 10, 100, 100);
      Ellipse2D.Double blueRing1 = new Ellipse2D.Double (11, 11, 100, 100);
      Ellipse2D.Double blueRing2 = new Ellipse2D.Double (9, 9, 100, 100);
      Ellipse2D.Double blueRing3 = new Ellipse2D.Double (12, 12, 100, 100);
      g2.setColor (blue);
      g2.draw (blueRing);
      g2.draw (blueRing1);
      g2.draw (blueRing2);
      g2.draw (blueRing3);
      
      Ellipse2D.Double yellowRing = new Ellipse2D.Double (70, 70, 100, 100);
      Ellipse2D.Double yellowRing1 = new Ellipse2D.Double (69, 69, 100, 100);
      Ellipse2D.Double yellowRing2 = new Ellipse2D.Double (71, 71, 100, 100);
      Ellipse2D.Double yellowRing3 = new Ellipse2D.Double (72, 72, 100, 100);
      g2.setColor (yellow);
      g2.draw (yellowRing);
      g2.draw (yellowRing1);
      g2.draw (yellowRing2);
      g2.draw (yellowRing3);

      Ellipse2D.Double blackRing = new Ellipse2D.Double (120, 10, 100, 100);
      Ellipse2D.Double blackRing1 = new Ellipse2D.Double (119, 9, 100, 100);
      Ellipse2D.Double blackRing2 = new Ellipse2D.Double (121, 11, 100, 100);
      Ellipse2D.Double blackRing3 = new Ellipse2D.Double (122, 12, 100, 100);
      g2.setColor (black);
      g2.draw (blackRing);
      g2.draw (blackRing1);
      g2.draw (blackRing2);
      g2.draw (blackRing3);
      
      Ellipse2D.Double greenRing = new Ellipse2D.Double (180, 70, 100, 100);
      Ellipse2D.Double greenRing1 = new Ellipse2D.Double (179, 69, 100, 100);
      Ellipse2D.Double greenRing2 = new Ellipse2D.Double (181, 71, 100, 100);
      Ellipse2D.Double greenRing3 = new Ellipse2D.Double (182, 72, 100, 100);
      g2.setColor (green);
      g2.draw (greenRing);
      g2.draw (greenRing1);
      g2.draw (greenRing2);
      g2.draw (greenRing3);
      
      Ellipse2D.Double redRing = new Ellipse2D.Double (230, 10, 100, 100);
      Ellipse2D.Double redRing1 = new Ellipse2D.Double (229, 9, 100, 100);
      Ellipse2D.Double redRing2 = new Ellipse2D.Double (231, 11, 100, 100);
      Ellipse2D.Double redRing3 = new Ellipse2D.Double (232, 12, 100, 100);
      g2.setColor (red);
      g2.draw (redRing);
      g2.draw (redRing1);
      g2.draw (redRing2);
      g2.draw (redRing3);
      
   }
}
