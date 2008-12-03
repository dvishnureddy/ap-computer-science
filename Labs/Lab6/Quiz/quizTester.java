/*
 * Ryan O'Hara
 * November 24, 2008
 * tests quiz
 */
public class quizTester
{
     public static void main(String[] args)
     {
          DataSet quizData = new DataSet();
          
          quizData.add(new Quiz(80));
          quizData.add(new Quiz(85));
          quizData.add(new Quiz(90));
          quizData.add(new Quiz(95));
          quizData.add(new Quiz(100));
          
          Quiz average = new Quiz (quizData.getAverage());
          
          Measurable max = quizData.getMaximum();
          Quiz highest = new Quiz (max.getMeasure());
          
          System.out.println("Average quiz grade: " + average.getNumGrade() +" "+ average.getLetGrade());
          System.out.println("Expected: 90.0 B+");
         
          System.out.println("Highest quiz grade: " + highest.getNumGrade() +" "+ highest.getLetGrade());
          System.out.println("Expected: 100.0 A");
     }
}