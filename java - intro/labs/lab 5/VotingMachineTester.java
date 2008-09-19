/**
 * Tests the VotingMachine object
 * 
 * Last test: 11/5/07
 */
public class VotingMachineTester
{
     /**
      * @param args String arguments for the main method
      */
     public static void main (String args [])
     {
          
          VotingMachine localVotingMachine = new VotingMachine (0);
          

          localVotingMachine.Democrats (150);
          localVotingMachine.Republicans (151);
          
          System.out.println (localVotingMachine.checkvotes () +" votes have been casted, Democrats have recieved "+ localVotingMachine.checkDvotes ()+
          " votes and Republicans have recieved "+ localVotingMachine.checkRvotes () +" votes.");
          
          if(localVotingMachine.checkRvotes() > localVotingMachine.checkDvotes())
               System.out.println ("\nRepublicans Win!");
          else if(localVotingMachine.checkDvotes() > localVotingMachine.checkRvotes())
               System.out.println ("\nDemocrats Win!");
          else
               System.out.println ("\nIt's a tie?");
          
     }// end main method
}// end Car class