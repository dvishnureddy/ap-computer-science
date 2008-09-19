import javax.swing.JFrame;

public class OlympicRingViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 300;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Olympic Rings");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicRingComponent component = new OlympicRingComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
