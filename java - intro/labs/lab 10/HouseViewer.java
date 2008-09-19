import javax.swing.JFrame;

public class HouseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 700;
      final int FRAME_HEIGHT = 600;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("My House");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HouseComponent component = new HouseComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
