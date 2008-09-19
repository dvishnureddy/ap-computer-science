/*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*
 *
 *    Name: Ryan O'Hara
 *    Date: 4/11/08
 *    Filename: CalcuulatorGUITest.java
 *    Description: This is a driver program to test the CalculatorGUI object.
 *
 GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*GUIs*/

import javax.swing.JFrame;

public class CalculatorGUITest
{
      public static void main (String args[])
      {
            //Declare and initialize the CalculatorGUI object
            
            JFrame frame = new CalculatorGUI(new String("Calculator"));
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.setResizable(false);
            
            frame.setVisible(true);
      
      }//end main method
      
}//end ChoiceTest class