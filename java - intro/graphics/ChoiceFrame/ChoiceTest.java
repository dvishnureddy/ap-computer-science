/*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*
 *
 *    Name: Mr. Dietzler
 *    Date: 5/1/07
 *    Filename: ChoiceTest.java
 *    Description: This is a driver program to test the ChoiceFrame object.
 *
 GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*/

import javax.swing.JFrame;

public class ChoiceTest
{
      public static void main (String args[])
      {
            //Declare and initialize the ChoiceFrame object
            
            JFrame frame = new ChoiceFrame (new String("Paint"));
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setResizable(false);
            
            frame.show();
      
      }//end main method
      
}//end ChoiceTest class