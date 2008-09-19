import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.applet.AudioClip; 
/**
 * Our first Applet!
 */

public class MyFirstApplet extends Applet
{
     //Declare any global variables here
     private Line2D.Double line1;
     private Line2D.Double line2;
     private Line2D.Double line3;
     
     private AudioClip gameMusic;
     
     public void init ()
     {
          gameMusic = getAudioClip (getCodeBase (), "Gbbattle.mid");
          gameMusic.loop ();
          
          //initialize any and all values for the applet
          line1 = new Line2D.Double (10, 10, 100, 100);
          line2 = new Line2D.Double (100, 100, 10, 200);
          line3 = new Line2D.Double (10, 200, 10, 10);
     }//end init method
     
     public void paint (Graphics g)
     {
          Graphics2D g2 = (Graphics2D) g;
          
          Random gen = new Random ();
          
          Color black = Color.BLACK;
          
          // Construct a rectangle and draw it
          DieGraphic die1 = new DieGraphic(150, 150, 100, 100,
                                           gen.nextInt (6)+1);
          
          die1.paint (g2);
          
          
          g2.draw (line1);
          g2.draw (line2);
          g2.draw (line3);
          
          String title = new String ("A triangle and a die.");
          g2.drawString(title, 150, 10);
     }//end paint method
     
}//end MyFirstApplet applet