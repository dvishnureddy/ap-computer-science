/*Ryan O'Hara
 * Spetember 20,2007
 * Period 8
 * last modified 9/19/2007
 * This program will ask yoor name
 */
import javax.swing.JOptionPane;

public class DialogTester
{
     public static void main(String[] args) 
     {
          String name = JOptionPane.showInputDialog("What is your name?");
          System.out.println("hello " + name); 
          //System.exit(0);
     }//end of main mthod
}//end of the class 