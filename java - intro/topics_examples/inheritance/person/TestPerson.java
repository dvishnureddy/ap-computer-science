import java.util.*;

public class TestPerson
{
     public static void main (String args[])
     {
          person p1 = new person ("Mike", "Hunt", 69);
          person p2 = new person ("Willy", "Islong", 13);
          
          System.out.println ("First person:\n\t"+ p1);
          System.out.println ("Second person:\n\t"+ p2);
          
          p2.theBirthdayMethod ();
          
          System.out.println ("Second person:\n\t"+ p2);
          
          
          person s1 = new Student ("Joe", "Shmo", 18, 12, 2.7);// can declare them as a person and initialize it as a student
          person s2 = new Student ("Lisa", "Car", 16, 11, 2.1);
          
          System.out.println ("First student:\n\t"+ s1);
          System.out.println ("Second student:\n\t"+ s2);
          
          s2.theBirthdayMethod ();
          
          System.out.println ("Second student:\n\t"+ s2);
          
          Scanner in = new Scanner (System.in);
          ArrayList <person> people = new ArrayList <person> ();
          
          people.add (p1);
          people.add (p2);
          people.add (s1);
          people.add (s2);
          
          for (int i = 0; i < people.size (); i++)
          {
               System.out.println (people.get(i) + " --> this is a "+ people.get(i).getClass().getName() +" object.");
               
               //System.out.println ("GPA is "+ people.get (i).getGPA ()); error because this has to be in the superclass
          }
          
          
               
     }//end main
}//end TestPerson