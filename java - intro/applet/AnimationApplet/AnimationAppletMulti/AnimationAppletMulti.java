/**
 * Our first animation Applet!  Hooray!
 */
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class AnimationAppletMulti extends Applet implements Runnable, KeyListener
{
     //Declare any global variables here
     
     private Thread animator;//this Thread will control the animation
     private int delay; //this value will control the amount of
                             // time the Thread will sleep on each step
                             // of the animation (in milliseconds).
     
     private ArrayList <LineShape> lines = new ArrayList<LineShape>();
     
     public static int NUM_SHAPES = 40;
     
     public void init ()
     {
          Random gen = new Random ();
          
          //initialize any and all values for the Applet
          for (int i = 0; i < NUM_SHAPES; i++)
          {
               lines.add (new LineShape (gen.nextInt (this.getWidth()),
                                         gen.nextInt (this.getHeight()),
                                         gen.nextInt (this.getWidth()),
                                         gen.nextInt (this.getHeight()),
                                         gen.nextInt (5) + 1,
                                         gen.nextInt (5) + 1,
                                         gen.nextInt (5) + 1,
                                         gen.nextInt (5) + 1,
                                         1, -1, 1, -1));
          }//end for
                    
          delay = 10;
          
          this.setFocusable(true);
          this.addKeyListener (this);
     }//end init method
     
     
     public void start ()
     {
          animator = new Thread (this);
          animator.start();
     }//end start method
     
     
     public void stop ()
     {
          animator = null;
     }//end stop method
     
     
     public void paint (Graphics g)
     {
          Graphics2D g2 = (Graphics2D) g;
          
          for (int i = 0; i < NUM_SHAPES; i++)
          {
               lines.get(i).setLine ();
               g2.draw (lines.get(i).getLine ());
          }//end for
     }//end paint method
     
     
     public void run ()
     {
          while (Thread.currentThread() == animator)
          {
               for (int i = 0; i < NUM_SHAPES; i++)
               {
                    lines.get(i).setX1 (lines.get(i).getX1() +
                                 lines.get(i).getX1Run() * lines.get(i).getX1Dir());
                    lines.get(i).setY1 (lines.get(i).getY1() +
                                 lines.get(i).getY1Rise() * lines.get(i).getY1Dir());
                    lines.get(i).setX2 (lines.get(i).getX2() +
                                 lines.get(i).getX2Run() * lines.get(i).getX2Dir());
                    lines.get(i).setY2 (lines.get(i).getY2() +
                                 lines.get(i).getY2Rise() * lines.get(i).getY2Dir());
                    
                    if (lines.get(i).getX1() < 0)
                    {
                         lines.get(i).setX1(0);
                         lines.get(i).switchX1Dir();
                    }//end if
                    else if (lines.get(i).getX1() > this.getWidth())
                    {
                         lines.get(i).setX1(this.getWidth());
                         lines.get(i).switchX1Dir();
                    }//end else if
                    
                    if (lines.get(i).getY1() < 0)
                    {
                         lines.get(i).setY1(0);
                         lines.get(i).switchY1Dir();
                    }//end if
                    else if (lines.get(i).getY1() > this.getHeight())
                    {
                         lines.get(i).setY1(this.getHeight());
                         lines.get(i).switchY1Dir();
                    }//end else if
                    
                    
                    if (lines.get(i).getX2() < 0)
                    {
                         lines.get(i).setX2(0);
                         lines.get(i).switchX2Dir();
                    }//end if
                    else if (lines.get(i).getX2() > this.getWidth())
                    {
                         lines.get(i).setX2(this.getWidth());
                         lines.get(i).switchX2Dir();
                    }//end else if
                    
                    if (lines.get(i).getY2() < 0)
                    {
                         lines.get(i).setY2(0);
                         lines.get(i).switchY2Dir();
                    }//end if
                    else if (lines.get(i).getY2() > this.getHeight())
                    {
                         lines.get(i).setY2(this.getHeight());
                         lines.get(i).switchY2Dir();
                    }//end else if
               }
               
               repaint();
               
               try
               {
                    Thread.sleep (delay); //have the thread sleep for
                                          //"delay" milliseconds.
               }//end try
               catch (InterruptedException e)
               {
                    System.exit(-1);
               }//end catch
          }//end while loop
          
     }//end run method
     
     
     public void keyReleased (KeyEvent e)
     {
     }
     
     public void keyPressed (KeyEvent e)
     {
          /*if (e.getKeyCode() == KeyEvent.VK_UP)
          {
               line1.setY1Rise(line1.getY1Rise() + 1);
               if (line1.getY1Rise() >= 20)
                    line1.setY1Rise(20);
          }
          else if (e.getKeyCode() == KeyEvent.VK_DOWN)
          {
               line1.setY1Rise(line1.getY1Rise() - 1);
               if (line1.getY1Rise() <= 1)
                    line1.setY1Rise(1);
          }
          if (e.getKeyCode() == KeyEvent.VK_RIGHT)
          {
               line1.setX1Run(line1.getX1Run() + 1);
               if (line1.getX1Run() >= 20)
                    line1.setX1Run (20);
          }
          else if (e.getKeyCode() == KeyEvent.VK_LEFT)
          {
               line1.setX1Run(line1.getX1Run() - 1);
               if (line1.getX1Run() <= 1)
                    line1.setX1Run(1);
          }*/
     }//end keyPressedMethod
     
     public void keyTyped (KeyEvent e)
     {
     }
}//end MyFirstApplet applet