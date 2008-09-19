/**
 * Simulates the grades of a class
 * @author Ryan O'Hara
 * @Version 1.0
 */
public class Class
{
     private double Grade;
     
     /**
      * @param initGrade
      */
     
     public Class (double initGrade)
     {
          Grade = initGrade;
     }
     
     /**
      * @ param score1
      */
     
     public void test (double score1)
     {
          Grade += score1;
     }
     
     /**
      * @ param score2
      */
     
     public void project (double score2)
     {
          Grade += score2;
     }

     /**
      * @ return the grade
      */
     
     public double checkGrade ()
     {
          return Grade/3;
     }
     
}//end Class class