import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
   This program displays a SlopeComponent.
*/
public class ClickCircleComponentViewer
{  
   public static void main(String[] args)
   {        
      final ClickCircleComponent component = new ClickCircleComponent();

      // Add mouse click listener         

      class MouseClickListener implements MouseListener
      {  
         public void mouseClicked(MouseEvent event)
         {  
            int x = event.getX();
            int y = event.getY();
            int radius = (int) Math.sqrt(Math.pow(x - point2.getX(), 2) + Math.pow(y - point2.getY(), 2)); 
            component.setPoint(x, y);
            component.setPositionAndSize(x, y, radius);
         }

         // Do-nothing methods
         public void mouseReleased(MouseEvent event) {}
         public void mousePressed(MouseEvent event) {}
         public void mouseEntered(MouseEvent event) {}
         public void mouseExited(MouseEvent event) {}
      }
         
      MouseListener listener = new MouseClickListener();
      component.addMouseListener(listener);

      JFrame frame = new JFrame();
      frame.add(component);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

   private static final int FRAME_WIDTH = 500;
   private static final int FRAME_HEIGHT = 500;
} 
