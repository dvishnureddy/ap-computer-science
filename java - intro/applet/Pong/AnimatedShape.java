/********************************************************************************
 *
 *    Name: Ryan O'Hara
 *    Date: 5/1/07
 *    Filename: AnimatedShape.java
 *    Description: This object contains all the necessary variables and
 *                   methods so that an RectangularShape object can be
 *                   animated in an Applet
 *********************************************************************************/

import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class AnimatedShape
{
   //This RectangularShape will be our animated object.
   private RectangularShape shape;
   
   //These variables will give us the coordinates and   
   // the dimensions of the shape each step in the
   // animation.
   private int xCoord;
   private int yCoord;
   private int width;
   private int height;
   
   //These variables will control the direction the shape
   // is moving. They either store a 1 or -1.
   private int leftRight;
   private int upDown;
   
   //These variables will control the slope on which the shape
   // moves.  This ends up determining the speed as well (higher
   // rise & run equals faster shape).
   private int run;
   private int rise;
   
   private Color outlineColor;
   private Color fillColor;
   
   public AnimatedShape (RectangularShape s, int x, int y,
                         int w, int h, int l_r, int u_d,
                         int rn, int rs, Color o, Color f)
   {
      shape = s;
      
      xCoord = x;
      yCoord = y;
      width = w;
      height = h;
      
      shape.setFrame(xCoord, yCoord, width, height);
      
      leftRight = l_r;
      upDown = u_d;
      
      run = rn;
      rise = rs;
      
      outlineColor = o;
      fillColor = f;
   }//end constructor
   
   
   //Get the shape to draw it
   public RectangularShape getShape()
   {
      return shape;
   }//end getShape method
   
   
   public void moveShape()
   {
      xCoord += leftRight * run/1.5;
      yCoord += upDown * rise/1.5;
      shape.setFrame(xCoord, yCoord, width, height);
   }//end moveShape method
   
   
   public int getX()
   {
      return xCoord;
   }//end getX method
   
   
   public void setX(int val)
   {
      xCoord = val;
   }//end setX method
   
   
   public int getY()
   {
      return yCoord;
   }//end getY method
   
   
   public void setY(int val)
   {
      yCoord = val;
   }//end setY method
   
   
   public int getWidth()
   {
      return width;
   }//end getWidth method
   
   
   public int getHeight()
   {
      return height;
   }//end getHeight method
   
   
   public int getHorizontalDirection()
   {
      return leftRight;
   }//end getHorizontalDirection method
   
   
   public void changeHorizontalDirection()
   {
      leftRight *= -1;
   }//end changeHorizontalDirection method
   
   
   public int getVerticalDirection()
   {
      return upDown;
   }//end getVerticalDirection method
   
   
   public void changeVerticalDirection()
   {
      upDown *= -1;
   }//end changeVerticalDirection method
   
   
   public int getRun()
   {
      return run;
   }//end getRun method
   
   
   public void changeRun(int amount)
   {
      run += amount;
      if (run < 0)
         run = 0;
   }//end changeRun method
   
   
   public int getRise()
   {
      return rise;
   }//end getRise method
   
   
   public void changeRise(int amount)
   {
      rise += amount;
      if (rise < 0)
         rise = 0;
   }//end changeRise method
   
   
   public Color getOutlineColor()
   {
      return outlineColor;
   }//end getOutlineColor method
   
   
   public void setOutlineColor(Color newOut)
   {
      outlineColor = newOut;
   }//end setOutlineColor method
   
   
   public Color getFillColor()
   {
      return fillColor;
   }//end getFillColor method
   
   
   public void setFillColor(Color newFill)
   {
      fillColor = newFill;
   }//end setFillColor method
   
   
   public Point2D.Double getTopLeftPoint()
   {
      return new Point2D.Double (xCoord, yCoord);
   }//end getTopLeftPoint method
   
   
   public Point2D.Double getTopRightPoint()
   {
      return new Point2D.Double (xCoord + width, yCoord);
   }//end getTopRightPoint method
   
   
   public Point2D.Double getBottomLeftPoint()
   {
      return new Point2D.Double (xCoord, yCoord + height);
   }//end getBottomLeftPoint method
   
   
   public Point2D.Double getBottomRightPoint()
   {
      return new Point2D.Double (xCoord + width, yCoord + height);
   }//end getBottomRightPoint method
   
   
}//end AnimatedShape class