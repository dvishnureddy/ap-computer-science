//Ryan O'Hara
//minilab

public class reverseString
{
  private String sentence;
  private String newSent;
  
  public reverseString (String str) 
  {
    sentence = str;
  }
  
  public void reverse()
  {
    reverseString s = new reverseString (sentence.substring (1));
    s.reverse();
    newSent = sentence.substring(0, 1);
  }
  
  public String getText()
  {
    return newSent;
  }
}