import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * an action listner that prints a message.
 */
public class CancelListner implements ActionListener
{
     public void actionPerformed (ActionEvent event)
     {
          System.exit (-1);
     }
}