import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

/**
   A component that draws two rectangles.
*/
public class DieComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Random gen = new Random ();
      
      Color newColor = new Color (gen.nextInt (256),  //Amount of red
                                  gen.nextInt (256),  //Amount of green
                                  gen.nextInt (256)); //Amount of blue
      Color black = Color.BLACK;
      
      // Construct a rectangle and draw it
      DieGraphic die1 = new DieGraphic(50, 50, 100, 100,
                                            gen.nextInt (6)+1);
      
      die1.paint (g2);
      
      DieGraphic die2 = new DieGraphic(160, 50, 100, 100,
                                       gen.nextInt (6)+1);
      
      die2.paint (g2);
      
      if (die1.getNumDots () == die2.getNumDots ())
      {
           g2.drawString ("Doubles!", 100.0F, 200.0F);
      }
           
   }
}
