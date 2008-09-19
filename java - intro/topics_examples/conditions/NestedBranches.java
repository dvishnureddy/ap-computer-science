public class NestedBranches
{
     
     public static void main(String args[])
     {
          int x = 5;
          int y = 6;
          int z = 10;
          
          if (x < y)
          {  
               if ( z > 5)
               System.out.println ("x is less than y and z > 5");
               {
                    else
               System.out.println ("x is less than y and z <= 5");
               }
               {
          else
               else (z > 10)
               System.out.println ("x is less than y and z > 10");
               }
               {
               else
               System.out.println ("x is less than y and z <= 10");
               }
          }
     }// end main
}// end class 