import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

/**
   This program demonstrates how to install an action listener.
*/
public class ButtonTester
{  
   public static void main(String[] args)
   {  
      JFrame frame = new JFrame();
      JPanel panel1 = new JPanel();
      JButton button = new JButton("Save");
      JButton button2 = new JButton("Cancel");
      
      panel1.setLayout (new FlowLayout(FlowLayout.LEFT));
      frame.setLayout (new BorderLayout());
      
      panel1.add(button);
      panel1.add(button2);
      frame.add(panel1, BorderLayout.NORTH);
      
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      ActionListener listener2 = new CancelListner();
      button2.addActionListener(listener2);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }

   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
}
