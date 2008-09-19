/*****************************************************
 * Ryan O'Hara
 * A die shape that inherits from Rectangle2D.Double 
 * It can be positioned anywhere within a panel
 *****************************************************/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class DieGraphic extends Rectangle2D.Double
{
     private int numDots;
     private ArrayList<Ellipse2D.Double> dots;
     private double dotRadius;
     
     /*
      * Constructor
      */
     public DieGraphic (double x, double y, double w, double h, int nD)
     {
          super (x, y, w, h);
          dots = new ArrayList<Ellipse2D.Double> ();
          numDots = nD;
          dotRadius = w / 10;
          setDots ();
          
     }//end constructor
     
     public void paint (Graphics2D g2)
     {
          g2.setColor (Color.WHITE);
          g2.fill (this);
          
          g2.setColor (Color.BLACK);
          g2.draw (this);
          
          for (Ellipse2D.Double nextDot : dots)
          {
               g2.fill (nextDot);
          }
     }
     
     public int getNumDots ()
     {
          return numDots;
     }
     
     public void setDots ()
     {
          dots = new ArrayList<Ellipse2D.Double> ();
          
          switch (numDots)
          {
               case 0:
                    return;
               case 5:
                    dots.add (centerSmall ());
               case 4:
                    dots.add (topRight ());
                    dots.add (bottomLeft ());
               case 2:
                    dots.add (topLeft ());
                    dots.add (bottomRight ());
                    break;
               case 1:
                    dots.add (centerLarge ());
                    break;
               case 3:
                    dots.add (topRight ());
                    dots.add (bottomLeft ());
                    dots.add (centerSmall ());
                    break;
               case 6:
                    dots.add (topLeft ());
                    dots.add (topRight ());
                    dots.add (bottomRight ());
                    dots.add (bottomLeft ());
                    dots.add (leftCenter ());
                    dots.add (rightCenter ());
                    break;
                    
          }//end switch
          return;
          
     }//end setDots method
     
     //Return an Elipse2D.Double to go in the top left of the Die.
     
     private Ellipse2D.Double topLeft ()
     {
          return new Ellipse2D.Double ((getWidth() /4 - dotRadius)+ x, (getHeight () /4 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end topLeft
     
     private Ellipse2D.Double topRight ()
     {
          return new Ellipse2D.Double ((3 * getWidth() /4 - dotRadius)+ x, (getHeight () /4 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end topRight
     
     private Ellipse2D.Double bottomLeft ()
     {
          return new Ellipse2D.Double ((getWidth() /4 - dotRadius)+ x, (3 * getHeight () /4 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end bottomLeft
     
     private Ellipse2D.Double bottomRight ()
     {
          return new Ellipse2D.Double ((3 * getWidth() /4 - dotRadius)+ x, (3 * getHeight () /4 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end bottomRight
     
     private Ellipse2D.Double centerSmall ()
     {
          return new Ellipse2D.Double ((getWidth() /2 - dotRadius)+ x, (getHeight () /2 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end centerSmall
     
     private Ellipse2D.Double centerLarge ()
     {
          return new Ellipse2D.Double ((getWidth() /2 - dotRadius)+ x, (getHeight () /2 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }//end centerLarge
     
     private Ellipse2D.Double leftCenter ()
     {
          return new Ellipse2D.Double ((getWidth() /4 - dotRadius)+ x, (getHeight () /2 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }
      
     private Ellipse2D.Double rightCenter ()
     {
          return new Ellipse2D.Double ((3 * getWidth() /4 - dotRadius)+ x, (getHeight () /2 - dotRadius)+ y, dotRadius * 2, dotRadius * 2);
     }
     
}//end DieGraphics method          