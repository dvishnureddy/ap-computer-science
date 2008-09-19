import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 An action listener that prints a message.
 */
public class ClickListener implements ActionListener
{
     private int numTimes;
     
     public ClickListener ()
     {
          numTimes = 0;
     }
     
     
     public void actionPerformed(ActionEvent event)
     {
          Date currentTime = new Date ();
          
          numTimes ++;
          
          System.out.println(event.getActionCommand () + " was clicked " + currentTime + ".\n" +
                             "It has been clicked a total of " + numTimes + 
                             " time(s)");
          
     }            
}
