import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
   This program displays a SlopeComponent.
*/
public class SlopeComponentViewer
{  
   public static void main(String[] args)
   {        
      final SlopeComponent component = new SlopeComponent();

      // Add mouse click listener         

      class MouseClickListener implements MouseListener
      {  
         public void mouseClicked(MouseEvent event)
         {  
            int x = event.getX();
            int y = event.getY();
            component.setPoint(x, y);
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
