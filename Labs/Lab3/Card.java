/**
 * Ryan O'Hara
 * 10/20/08
 * deck of cards
 * used solution on moodle for help
*/
public class Card
{
     private String type;
     private String suit;
     
   public Card(String description)
   {
      int d = description.length();

      if (d < 2)
      {
         type = "unknown";
         suit = "unknown";
      }
      else
      {
         suit = description.substring (d - 1, d);
         type = description.substring (0, d - 1);
      }
   }

   public String getDescription()
   {
      String output = "";

      if (type.equalsIgnoreCase("a"))
         output = "Ace";
      else if(type.equalsIgnoreCase("k"))
         output = "King";
      else if(type.equalsIgnoreCase("q"))
         output = "Queen";
      else if(type.equalsIgnoreCase("j"))
         output = "Jack";
      else if(type.equals("2"))
         output = "Two";
      else if(type.equals("3"))
         output = "Three";
      else if(type.equals("4"))
         output = "Four";
      else if(type.equals("5"))
         output = "Five";
      else if(type.equals("6"))
         output = "Six";
      else if(type.equals("7"))
         output = "Seven";
      else if(type.equals("8"))
         output = "Eight";
      else if(type.equals("9"))
         output = "Nine";
      else if(type.equals("10"))
         output = "Ten";
      else
         return "Unknown";
      
      output = output + " of ";
      if (suit.equalsIgnoreCase("S"))
         output = output + "Spades";
      else if(suit.equalsIgnoreCase("H"))
         output = output + "Hearts";
      else if(suit.equalsIgnoreCase("D"))
         output = output + "Diamonds";
      else if(suit.equalsIgnoreCase("C"))
         output = output + "Clubs";
      else
         return "Unknown";

      return output;
   }
}