import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

/**
   A component that draws two rectangles.
*/
public class OHaraComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Random gen = new Random ();
      
      Color newColor = new Color (gen.nextInt (256),
                                  gen.nextInt (256),
                                  gen.nextInt (256));
      Color black = Color.BLACK;
      
      // Construct a rectangle and draw it
      Rectangle box = new Rectangle(30, 130, 80, 80);
      g2.setColor (newColor);
      g2.fill (box);
      g2.setColor (black);
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(gen.nextInt(150), gen.nextInt (250));
      
      newColor = new Color (gen.nextInt (256),
                                  gen.nextInt (256),
                                  gen.nextInt (256));

      // Draw moved rectangle
      g2.setColor (newColor);
      g2.fill (box);
      g2.setColor (black);
      g2.draw(box);  
   }
}
