import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;
/**
 * Our first Animation Applet
 */

public class AnimationApplet extends Applet implements Runnable, KeyListener
{
     //Declare any global variables here
     public LineShape line;
     
     
     private Thread animator;// this Thread will control the animation 
     private int delay = 10;// this value will control the amount of tme the Thread will sleep on each step of the animation (in milliseconds).
     
     private int x1, x2, y1, y2;
     
     private int x1Run, x1Dir, y1Rise, y1Dir, x2Run, x2Dir, y2Rise, y2Dir;
     
     public void init ()
     {
          //initialize any and all values for the applet
          line = new LineShape (50, 100, 150, 65, 1, 1, 1, 1, 1, -1, 1, -1);
          
          delay = 10;
          
          this.setFocusable (true);
          this.addKeyListener (this);
     }//end init method
     
     public void start ()
     {
          animator = new Thread (this);
          animator.start ();
     }//end start method
     
     public void stop ()
     {
          animator = null;
     }//end stop method
     
     public void paint (Graphics g)
     {
          Graphics2D g2 = (Graphics2D) g;
          
          line.setLine ();
          g2.draw (line.getLine());
     }//end paint method
     
     public void run ()
     {
          while (Thread.currentThread() == animator)
          {
               line.setX1 (line.getX1() + line.getX1Run() * line.getX1Dir());
               line.setY1 (line.getY1() + line.getY1Rise() * line.getY1Dir());
               line.setX2 (line.getX2() + line.getX2Run() * line.getX2Dir());
               line.setY2 (line.getY2() + line.getY2Rise() * line.getY2Dir());
               
               if (line.getX1 () < 0)
               {
                    line.setX1 (0);
                    line.switchX1Dir();
               }//end if
               else if (line.getX1() > this.getWidth ())
               {
                    line.setX1 (this.getWidth());
                    line.switchX1Dir();
               }// end else if 
               
               if (line.getY1() < 0)
               {
                    line.setY1(0);
                    line.switchY1Dir();
               }//end if
               else if (line.getY1() > this.getHeight())
               {
                    line.setY1(this.getHeight());
                    line.switchY1Dir();
               }//end else if
               
               
               if (line.getX2() < 0)
               {
                    line.setX2(0);
                    line.switchX2Dir();
               }//end if
               else if (line.getX2() > this.getWidth())
               {
                    line.setX2(this.getWidth());
                    line.switchX2Dir();
               }//end else if
               
               if (line.getY2() < 0)
               {
                    line.setY2(0);
                    line.switchY2Dir();
               }//end if
               else if (line.getY2() > this.getHeight())
               {
                    line.setY2(this.getHeight());
                    line.switchY2Dir();
               }//end else if
          }
          
          repaint();
          
          try 
          {
               Thread.sleep (delay); // have the thread sleep for "delay" milliseconds
          }//end try
          catch (InterruptedException e)
          {
               System.exit (-1);
          }//end catch
     }//end run method
     
     public void keyReleased (KeyEvent e)
     {
     }
     
     public void keyPressed (KeyEvent e)
     {
          if (e.getKeyCode() == KeyEvent.VK_UP)
          {
               y1Rise++;
               if (y1Rise >= 20)
                    y1Rise = 20;
          }
          else if (e.getKeyCode() == KeyEvent.VK_DOWN)
          {
               y1Rise--;
               if (y1Rise >= 20)
                    y1Rise = 20;
          }
     }
     
     public void keyTyped (KeyEvent e)
     {
     }
     
}//end AnimationApplet applet