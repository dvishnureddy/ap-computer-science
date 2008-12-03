/*
 * Ryan O'Hara
 * December 3, 2008
 * tests ScrabbleMeasurer
 */

public class scrabbleTester
{
     public static void main(String[] args)
     {
          Measurer sm = new ScrabbleMeasurer();
          DataSet scrabbleData = new DataSet(sm);
          
          scrabbleData.add(new String("Ryan"));
          scrabbleData.add(new String("Fax"));
          scrabbleData.add(new String("fan"));
          
         String max = (String) scrabbleData.getMaximum();
         System.out.println ("The word with the highest score is: "+ max);
     }
}
          