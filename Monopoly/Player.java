/* Ryan O'Hara
 * Player class for monopoly
 */
public class Player
{
     String player1 = new String ("");
     String whichPiece = new String ("");
     int space, doubles;
     double money;
     boolean inJail;
     
     public Player (String name, String piece)
     {
          player1 = name;
          space = 0;
          money = 1500.0;
          doubles = 0;
          whichPiece = piece;
          inJail = false;
     }
     
     public String getName ()
     {
          return player1;
     }
     
     public void setSpace (int location)
     {
          space = location;
     }
     
     public int getSpace ()
     { 
          return space;
     }
     
     public void movePiece (int amount)
     {
          space += amount;
     }
     
     public String getPiece ()
     {
          return whichPiece;
     }
     
     public void addDoubles ()
     {
          doubles++;
     }
     
     public int getDoubles ()
     {
          return doubles;
     }
     
     public void resetDoubles ()
     {
          doubles = 0;
     }
     
     public void setInJail (boolean j)
     {
          inJail = j;
     }
     
     public boolean isInJail ()
     {
          return inJail;
     }
     
     public void setMoney (double cash)
     {
          money += cash;
     }
     
     public double getMoney ()
     {
          return money;
     }
     
     public String toString ()
     {
          return new String ("Name: "+ player1 +"\nPiece: "+ whichPiece +"\nSpace: "+ space +"\nMoney: "+ money); 
     }
}
          
          
     