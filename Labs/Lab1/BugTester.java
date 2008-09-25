/*
 * Ryan O'Hara
 * Tests the Bug object
 * September 24, 2008
 */
public class BugTester
{
     public static void main (String args [])
     {
          Bug ant = new Bug (5);
          Bug fly = new Bug (10);
          
          ant.move ();// move 1 right
          ant.turn ();// turn and move 1 left
          ant.move ();// move 1 left
          ant.move ();// move 1 left
          ant.turn ();//turn and move 1 right
          ant.move ();// move 1 right
          
          fly.move ();// move 1 right
          fly.turn ();// turn and move 1 left
          fly.move ();// move 1 left
          fly.move ();// move 1 left
          
          System.out.println ("The ant is at: "+ ant.getPosition());
          System.out.println ("The fly is at: "+ fly.getPosition());
     }
}
               