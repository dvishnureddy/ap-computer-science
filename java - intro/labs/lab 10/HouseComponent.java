/*
 * Ryan O'Hara
 * House
 */

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

/**
   A component that draws two rectangles.
*/
public class Connect4Component extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Random gen = new Random ();
      
      Color black = Color.BLACK;
      g2.setColor (black);

      //draws garage 
      Rectangle2D.Double garage = new Rectangle2D.Double (60, 260, 160, 160);
      g2.draw (garage);
      
      //garage roof
      Line2D.Double garageRoof1 = new Line2D.Double (60, 260, 100, 210);
      Line2D.Double garageRoof2 = new Line2D.Double (100, 210, 180, 210);
      Line2D.Double garageRoof3 = new Line2D.Double (180, 210, 220, 260);
      g2.draw (garageRoof1);
      g2.draw (garageRoof2);
      g2.draw (garageRoof3);
      
      //front of house
      Rectangle2D.Double front = new Rectangle2D.Double (220, 140, 280, 280);
      g2.draw (front);
      
      //Roof for front of house
      Line2D.Double frontRoof1 = new Line2D.Double (220, 140, 260, 80);
      Line2D.Double frontRoof2 = new Line2D.Double (260, 80, 440, 80);
      Line2D.Double frontRoof3 = new Line2D.Double (440, 80, 500, 140);
      g2.draw (frontRoof1);
      g2.draw (frontRoof2);
      g2.draw (frontRoof3);
      
      //door for house
      Rectangle2D.Double door = new Rectangle2D.Double (340, 360, 40, 60);
      g2.draw (door);
      
      //windows
      Rectangle2D.Double window1 = new Rectangle2D.Double (260, 340, 50, 50);
      g2.draw (window1);
      Rectangle2D.Double window2 = new Rectangle2D.Double (420, 340, 50, 50);
      g2.draw (window2);
      Rectangle2D.Double window3 = new Rectangle2D.Double (260, 180, 50, 50);
      g2.draw (window3);
      Rectangle2D.Double window4 = new Rectangle2D.Double (340, 180, 50, 50);
      g2.draw (window4);
      Rectangle2D.Double window5 = new Rectangle2D.Double (420, 180, 50, 50);
      g2.draw (window5);
   }
}
   
   
      