public class DiscMover
{
     //Attributes to be declared:
     private int state;
     //tower to (int)
     private int to;
     //tower from (int)
     private int from;
     //num discs (int)
     private int numDiscs;
     //smaller mover (DiscMover)
     DiscMover smallerMover;
     
     //4 states (final static): BEFORE_LARGEST, LARGEST, AFTER_LARGEST, DONE
     public static final int BEFORE_LARGEST = 0;
     public static final int LARGEST = 1;
     public static final int AFTER_LARGEST = 2;
     public static final int DONE = 3;
     
     public DiscMover (int f, int t, int num)
     {
          //initialize attributes
          from = f;
          to = t;
          numDiscs = num;
          //set your state attribute
          state = BEFORE_LARGEST;
          //figure out the index of the 'other' tower (int) (other = 3 - to - from)
          int other = 3 - to - from;
          //initialize the smallerMove object using from, other & num discs - 1
          if (numDiscs > 1)
               smallerMover = new DiscMover (from, other, numDiscs - 1);
          
     }
     
     
     public boolean hasMoreMoves()
     {
          //return true or false if the state is equal to DONE
          if (state == DONE)
               return false;
          return true;
     }
     
     
     public DiscMove nextMove()
     {
          //BASE CASE: if the number of discs is one
          //Set the state to DONE
          //return a new DiscMove (from, to)
          if (numDiscs == 1)
          {
               state = DONE;
               return new DiscMove (from, to);
          }
          
          //Next: if the state is LARGEST
          //Set the state to AFTER_LARGEST
          //figure out the index of the 'other' tower (int) (other = 3 - to - from)
          //initialize the smallerMove object using other, to & num discs - 1
          //return a new DiscMove (from, to)
          if (state == LARGEST)
          {
               state = AFTER_LARGEST;
               int other = 3 - to - from;
               smallerMover = new DiscMover (other, to, numDiscs - 1);
               if (numDiscs > 1)
                    smallerMover = new DiscMover (other, to, numDiscs - 1);
               return new DiscMove (from, to);
          }
          //initialize a DiscMove and set it equal to smallerMover.nextMove()
          DiscMove dm = smallerMover.nextMove();
          
          
          //Finally: If  the 'smallerMover' DiscMover does NOT have more moves
          //if the state is BEFORE_LARGEST
          //set the state to LARGEST
          //else
          //set the state to DONE
          //return the DiscMove you initialized on line 41
          if (!smallerMover.hasMoreMoves())
          {
               if (state == BEFORE_LARGEST)
                    state = LARGEST;
               else
                    state = DONE;
          }
          return dm;
          
     }//end nextMove method
     
}//end DiscMover class   