/*******************************************************************************
 *
 *    Name: 
 *    Date: 
 *    Filename: DrawingPanel.java
 *    Description: This is a Panel one which shapes can be drawn.
 *
 *******************************************************************************/

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener
{
      //How can we use shapes below to store all the shapes that have been added to the screen?
      private ArrayList shapes;
      //This variable will store the current shape to be added to the ArrayList shapes
      private RectangularShape currentShape;
      
      private Rectangle2D.Double rectangle;
      private Ellipse2D.Double ellipse;
      private Color currentOutlineColor;
      private Color currentFillColor;

      private int width;
      private int height;
      
      private int draw_point_x;
      private int draw_point_y;
      
      private int click_point_x;
      private int click_point_y;
      
      private boolean isRectangle;
      private char fill_type;
      
      private static final int PANEL_WIDTH = 400;
      private static final int PANEL_HEIGHT = 350;
      
      public DrawingPanel()
      {
            shapes = new ArrayList();
            setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
            currentOutlineColor = Color.BLACK;
            currentFillColor = Color.BLACK;
            isRectangle = true;
            
            width = 0;
            height = 0;
            
            draw_point_x = 0;
            draw_point_y = 0;
            
            click_point_x = 0;
            click_point_y = 0;
            
            fill_type = 'o';
            rectangle = new Rectangle2D.Double(draw_point_x, draw_point_y, width, height);
            ellipse = new Ellipse2D.Double(draw_point_x, draw_point_y, width, height);
            
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
            
      }//end Constructor
      
      
      public void changeOutlineColor(Color c)
      {
            currentOutlineColor=c;
      }//end changeOutlineColor method
      
      
      public void changeFillColor(Color c)
      {
            currentFillColor=c;
      }//end changeFillColor method
      
      
      public void setRectangle()
      {
            isRectangle = true;
      }//end isRectangle method
      
      
      public void setEllipse()
      {
            isRectangle = false;
      }//end isEllipse method
      
      
      public void setFillType(char type)
      {
            fill_type = type;
      }//end setFillType method
      
      
      public void setDrawPoint (int x, int y)
      {
            click_point_x = x;
            click_point_y = y;
            draw_point_x = click_point_x;
            draw_point_y = click_point_y;
      }//end setDrawPoint method
      
      
      public void setDimension (int current_x, int current_y)
      {
            width = Math.abs(click_point_x - current_x);
            height = Math.abs(click_point_y - current_y);
            
            if(current_x < draw_point_x)
                  draw_point_x = current_x;
            else
                  draw_point_x = click_point_x;
            
            if(current_y < draw_point_y)
                  draw_point_y = current_y;
            else
                  draw_point_y = click_point_y;
            
            
      }//end setDimension method
      
      
      public void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            g2.setColor(currentOutlineColor);
           
            rectangle.setRect(draw_point_x, draw_point_y, width, height);
            ellipse.setFrame(draw_point_x, draw_point_y, width, height);
                       
            switch(fill_type)
            {
                  case 'o':
                        if(isRectangle)
                        {
                              g2.setColor(currentOutlineColor);
                              g2.draw(rectangle);
                        }
                        else
                        {      
                              g2.setColor(currentOutlineColor);
                              g2.draw(ellipse);
                        }
                        break;
                  case 'f':
                        if(isRectangle)
                        {      
                              g2.setColor(currentFillColor);
                              g2.fill(rectangle);
                        }
                        else
                        {      
                              g2.setColor(currentFillColor);
                              g2.fill(ellipse);
                        }
                        break;
                  case 'b':
                        if(isRectangle)
                        {
                              g2.setColor(currentOutlineColor);
                              g2.draw(new Rectangle2D.Double(draw_point_x - 1, draw_point_y - 1, width + 1, height + 1));
                              g2.setColor(currentFillColor);
                              g2.fill(rectangle);
                        }
                        else
                        {
                              g2.setColor(currentOutlineColor);
                              g2.draw(new Ellipse2D.Double(draw_point_x - 1, draw_point_y - 1, width + 1, height + 1));
                              g2.setColor(currentFillColor);
                              g2.fill(ellipse);
                        }
                       break;
            }//end switch
                  
      }//end paintComponent method
      
      
      public void mouseClicked (MouseEvent e)
      {
      }//end mouseClicked method
      
      
      public void mouseEntered (MouseEvent e)
      {
      }//end mouseEntered method
      
      
      public void mouseExited (MouseEvent e)
      {
      }//end mouseExited method
      
      
      public void mousePressed (MouseEvent e)
      {
            setDrawPoint (e.getX(), e.getY());
      }//end mousePressed method
      
      
      public void mouseReleased (MouseEvent e)
      {
            setDimension(e.getX(), e.getY());
            ellipse.setFrame(draw_point_x, draw_point_y, width, height);
            if(isRectangle)
            {
                  rectangle.setRect(draw_point_x, draw_point_y, width, height);
                  shapes.add(new DrawableShape(rectangle, fill_type, draw_point_x,
                                               draw_point_y, width, height, currentOutlineColor, currentFillColor));
            }
            else
            {
                  ellipse.setFrame(draw_point_x, draw_point_y, width, height);
                  shapes.add(new DrawableShape(ellipse, fill_type, draw_point_x,
                                               draw_point_y, width, height, currentOutlineColor, currentFillColor));
            }
                  repaint();
      }//end mouseReleased method
      
      
      public void mouseDragged (MouseEvent e)
      {
            setDimension (e.getX(), e.getY());
            repaint();
      }//end mouseDragged method
      
      
      public void mouseMoved (MouseEvent e)
      {
      }//end mouseMoved method
      
      
      public int getNumShapes()
      {
            return shapes.size();
      }//end getNumShapes
      
      
      public void removeShape()
      {
            shapes.remove(0);
      }//end removeShape
      
}//end DrawingPanel class