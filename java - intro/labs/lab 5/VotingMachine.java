/**
 * This simulates a voting machine.
 * @author Ryan O'Hara
 * @Version 1.0
 */

public class VotingMachine
{
     
     private double Dvotes, Rvotes, votes;
          
     /**
      * @param initVotes
      */
     
     public VotingMachine (double initVotes)
     {
          votes = initVotes;
     }// end constructer
     
     /**
      * @param initDvotes
      */
     
     public void Democrats (double initDvotes)
     {
          Dvotes = initDvotes;
     }// end Democrats method
     
     /**
      * @param initRvotes
      */
     
     public void Republicans (double initRvotes)
     {
          Rvotes = initRvotes;
     }// end Republicans method

     /**
      * @return 
      */
     
     public double checkvotes ()
     {
          votes = Dvotes + Rvotes;
          return votes;
     }//end checkvotes method
     
     /**
      * @return
      */
     
     public double checkDvotes ()
     {
          return Dvotes;
     }//end checkDvotes method
     
     /**
      * @return
      */
     
     public double checkRvotes ()
     {
          return Rvotes;
     }//end checkRvotes method 
     
}//end VotingMachine class