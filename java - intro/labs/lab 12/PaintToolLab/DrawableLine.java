/*******************************************************************************
 *
 *    Name: Ryan O'Hara
 *    Date: 4/11/08
 *    Filename: Drawable Shape.java
 *    Delcription: This is a special Shape to store additional info about how a line is to be
 *                   drawn on the screen.
 *
 *******************************************************************************/

import java.awt.*;
import java.awt.geom.*;

public class DrawableLine
{
      private Line2D.Double line;
      private Color color;
      
      private int x1;
      private int y1;
      private int x2;
      private int y2;
      
      DrawableLine (Line2D.Double l, int x_1, int y_1, int x_2, int y_2, Color c)
      {
            line = l;
            color = c;
            x1 = x_1;
            y1 = y_1;
            x2 = x_2;
            y2 = y_2;
      }//end constructor
      
      
      public Line2D.Double getLine ()
      {
            return line;
      }//end constructor
      
      
      public Color getColor()
      {
            return color;
      }//end getOutlineColor
        
      public int getX1()
      {
            return x1;
      }//end getX1
      
      
      public int getY1()
      {
            return y1;
      }//end getY1
      
      
      public int getX2()
      {
            return x2;
      }//end getX2
      
      
      public int getY2()
      {
            return y2;
      }//end getY2
      
      public void setCoordinate (int x1New, int y1New, int x2New, int y2New)
      {
            x1 = x1New;
            y1 = y1New;
            x2 = x2New;
            y2 = y2New;           
           line.setLine (x1New, y1New, x2New, y2New);
      }//end setCoordinate
      
      public void setColor (Color cNew)
      {
           color = cNew;
      }//end setColor
      
}//end DrawableShape class