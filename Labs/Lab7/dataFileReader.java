/*
 * Ryan O'Hara
 * Lab 7 P11.2
 * Feburary 6, 2009
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class dataFileReader
{      
  public static void main(String[] args) throws IOException, FileNotFoundException
  {
    double numLines = 0;
    double numCharacters = 0;
    double numWords = 0;
    double numSpaces = 0;
    boolean done = false;
    
    while (!done)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the file name: ");
      String filename = input.next();
      
      try
      {
        FileReader reader = new FileReader(filename);
        Scanner in = new Scanner(reader);
        
        while (in.hasNextLine())
        {
          String line = in.nextLine();
          numLines++;
          String[] words = line.split(" ");//brian capps helped me with this
          for(int i = 0; i < words.length;i++)
            if(!words[i].equals(" "))
            numWords++;
          numCharacters += line.length() - (numWords - 1);
          if (line.endsWith (" "))
            numCharacters--;
        }
        System.out.println("Lines: " + numLines + "\nWords: "+numWords+"\nCharacters: "+numCharacters);
        done = true;
      }
      catch (FileNotFoundException exception)
      {
        System.out.println("File not found.");
      }
      catch (IOException exception)
      {
        exception.printStackTrace();
      }        
    }     
    
  }
}