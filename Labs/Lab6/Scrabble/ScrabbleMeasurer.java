/*
 * Ryan O'Hara
 * 12/3/08
 * A class to simulate a coin which implements comparable
 */
public class ScrabbleMeasurer implements Measurer
{
     public double measure(Object o)
     {
          String input = ((String) o).toUpperCase ();
          int amount = 0;
          for (int i = 0; i < input.length(); i++)
          {
               switch(input.charAt(i))
               {
                    case 'A' :
                         amount += 1;
                         break;
                         
                    case 'B' :
                         amount += 3;
                         break;
                         
                    case 'C' :
                         amount += 3;
                         break;
                         
                    case 'D' :
                         amount += 2;
                         break;
                         
                    case 'E' :
                         amount += 1;
                         break;
                         
                    case 'F' :
                         amount += 4;
                         break;
                         
                    case 'G' :
                         amount += 2;
                         break;
                         
                    case 'H' :
                         amount += 4;
                         break;
                         
                    case 'I' :
                         amount += 1;
                         break;
                         
                    case 'J' :
                         amount += 8;
                         break;
                         
                    case 'K' :
                         amount += 5;
                         break;
                         
                    case 'L' :
                         amount += 1;
                         break;
                         
                    case 'M' :
                         amount += 3;
                         break;
                         
                    case 'N' :
                         amount += 1;
                         break;
                         
                    case 'O' :
                         amount += 1;
                         break;
                         
                    case 'P' :
                         amount += 3;
                         break;
                         
                    case 'Q' :
                         amount += 10;
                         break;
                         
                    case 'R' :
                         amount += 1;
                         break;
                         
                    case 's' :
                         amount += 1;
                         break;
                         
                    case 'T' :
                         amount += 1;
                         break;
                         
                    case 'U' :
                         amount += 1;
                         break;
                         
                    case 'V' :
                         amount += 4;
                         break;
                         
                    case 'W' :
                         amount += 4;
                         break;
                         
                    case 'X' :
                         amount += 8;
                         break;
                         
                    case 'Y' :
                         amount += 4;
                         break;
                         
                    case 'Z' :
                         amount += 3;
                         break;
               }
          }
          return amount;
     }
}