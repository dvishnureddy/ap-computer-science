/*****************************************************
 * Ryan O'Hara
 * Bullseye
 *****************************************************/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class BullseyeGraphic extends Ellipse2D.Double
{
     private int numRings;
     private ArrayList<Ellipse2D.Double> innerRings;
     
     /*
      * Constructor
      */
     public BullseyeGraphic (double x, double y, double w, double h, int nR)
     {
          super ((x - w/2), (y - h/2), w, h);
          innerRings = new ArrayList<Ellipse2D.Double> ();
          numRings = nR;
          setRings ();
          
     }//end constructor
     
     public void paint (Graphics2D g2)
     {
          g2.setColor (Color.WHITE);
          g2.fill (this);
          
          g2.setColor (Color.BLACK);
          g2.draw (this);
          
          for (int i = 0; i < numRings; i++)
          {
               Ellipse2D.Double nextRing = (Ellipse2D.Double)innerRings.get (i);
               
               if (i % 2 == 0)
               {
                    g2.setColor (Color.BLACK);
                    g2.fill (nextRing);
               }
               
               else
               {
                    g2.setColor (Color.WHITE);
                    g2.fill (nextRing);
               }
          }//end for
     }// end paint method
     
     public void setRings ()
     {
          innerRings = new ArrayList<Ellipse2D.Double> ();
          
          double ringDifference = getWidth () / (2 * numRings);
          
          double currentDiameter = getWidth ();
          double currentX = getX ();
          double currentY = getY ();
          
          for (int i = 0; i < numRings - 1; i++)
          {
               currentDiameter -= (2 * ringDifference);
               currentX += ringDifference;
               currentY += ringDifference;
               
               innerRings.add (new Ellipse2D.Double (currentX, currentY, currentDiameter, currentDiameter));
          }//end for loop

          return;
          
     }//end setRings method
     
}//end DieGraphics method          