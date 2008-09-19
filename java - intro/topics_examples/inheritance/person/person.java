/*
 * Ryan O'Hara
 * The person class stores basic information about a person
 */

public class person implements measurable
{
     private String firstName, lastName;
     private int age;
     
     /**
      * This constructer recieves initial values for all instance fields (name and age).
      * 
      * @param fN the person's first name
      * @param lN the person's last name
      * @param a the person's age
      */
     public person (String fN, String lN, int a)
     {
          firstName = fN;
          lastName = lN;
          age = a;
     }//end default constructor 
     
     /**
      * This method returns the person's first name only
      * 
      * @return the person's first name
      */
     public String getFirstName ()
     {
          return firstName;
     }
     
     /**
      * This method returns the person's last name only
      * 
      * @return the person's last name
      */
     public String getLastName ()
     {
          return lastName;
     }
     
     /**
      * This method returns the person's age only
      * 
      * @return the person's age
      */
     public int getAge ()
     {
          return age;
     }
     
     /**
      * This method adds one to the person's age
      */
     public void theBirthdayMethod ()
     {
          age++;
     }//end theBirthdayMethod method
     
     /**
      * Return a printable version of this person object
      * 
      * @return the person's full name and age
      */
     public String toString ()
     {
          return new String (firstName +" "+ lastName +" ("+ age +")");
     }//end toString method
     
     /**
      * Return the age as the measure for a Person
      * @return the person's age.
      */
     public double getMeasure ()
     {
          return age;
     }//end getMeasure method 
     
}//end Person class