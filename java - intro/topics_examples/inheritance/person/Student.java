/**
 * The Student class behaves like a person, but has the added features of a grade level and storing a GPA.
 */
public class Student extends person
{
     private int gradeLevel;
     private double GPA;
     
     /**
      * Creates a new Student object
      * 
      * @param fN the students first name
      * @param lN the students last name
      * @param a the student's age
      * @param gL the Student's grade level
      * @param gpa the student's GPA
      */
     public Student (String fN, String lN, int a, int gL, double gpa)
     {
          super (fN, lN, a);
          
          gradeLevel = gL;
          GPA = gpa;
     }//end constructor
     
     /**
      * This method returns the Student's grade level
      * 
      * @return the Stident's grade level
      */
     public int getGradeLevel ()
     {
          return gradeLevel;
     }
     
     /**
      * This method returns the Student's GPA
      * 
      * @return the Stident's GPA
      */
     public double getGPA ()
     {
          return GPA;
     }
     
     public String toString ()
     {
          return new String (super.toString() + " - "+ gradeLevel +"th grade, GPA = "+ GPA);
     }//end toString method
     
}