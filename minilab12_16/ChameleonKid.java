import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 * Ryan O'Hara
 * minilab 12/16/08
 * 
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonKid extends ChameleonCritter
{
     public static final int NORTH = 0;
     public static final int SOUTH = 180;
     
     public void processActors(ArrayList<Actor> actors)
     {
          int n = actors.size();
          if (n == 0)
          {
               Color c = getColor();
               int red = (int) (c.getRed() * (1 - 0.10));
               int green = (int) (c.getGreen() * (1 - 0.10));
               int blue = (int) (c.getBlue() * (1 - 0.10));
               setColor(new Color(red, green, blue));
               return;
          }
              
          for (Actor a : actors)
          {
               if ( getLocation().getAdjacentLocation (getDirection() ).compareTo (a.getLocation()) == 0)
                    setColor(a.getColor());
               else if (getLocation().getAdjacentLocation (getDirection() + Location.HALF_CIRCLE ).compareTo (a.getLocation()) == 0)
                    setColor(a.getColor());
          }
          
     }
     
     /**
      * Turns towards the new location as it moves.
      */
     public void makeMove(Location loc)
     {
          setDirection(getLocation().getDirectionToward(loc));
          super.makeMove(loc);
     }
}