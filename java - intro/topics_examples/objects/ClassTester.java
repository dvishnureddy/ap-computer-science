/**
 * Tests the Class object
 * 
 * Last test: 11/7/07
 */
public class ClassTester
{
     /**
      * The main method
      * 
      * @param args String arguments for the main method
      */
     public static void main (String args [])
     {
          //If you are testing an object, you should do 3 main things:
          
          // 1. Construct one or more objects of the class being tested
          
          Class myClass = new Class (100);
          Class yourClass = new Class (90);
          
          // 2. Call each of the methods you wrote at least once
          myClass.test (90);
          yourClass.project (80);
          myClass.project (95);
          yourClass.test (100);
          
          // 3. Print out any results
          System.out.println ("My Grade is "+ myClass.checkGrade ());
          System.out.println ("Your Grade is "+ yourClass.checkGrade ());
          
          // This is what the code would look like if we had publc access to instance fields
          
          //myAccount.balance = 1000;
          //System.out.println ("The balance was reset to "+ myAccount.balance);
          //will produce an error because the balance is private 
          
     }// end main method
}// end TestBankAccount class