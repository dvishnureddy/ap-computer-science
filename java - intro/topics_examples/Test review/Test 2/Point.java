public class Point
{
     //two double coordinates fr x and y (instance fields)
     private double xCoord;
     
     private double yCoord;
     
     
     
     public Point (double xInit, double yInit)
     {
          //set the instance fields with the initial values
          xCoord = xInit;
          yCoord = yInit;
     }//end constructor
     
     //write accessor methods for the x and y coordinate
     //    getX and getY
     
     
     public double getX ()
     {
          return xCoord;
     }
     
     public double getY ()
     {
          return yCoord;
     }
     
     
     //Write ONE mutator method that recieves new x and y coordinates
     // and sets the values accordingly. setPoint
     
     public void setPoint (double newX, double newY)
     {
          xCoord = newX;
          yCoord = newY;
     }
     
     public double getDistanceFromOrigin ()
     {
          return Math.sqrt(Math.pow(xCoord, 2) + Math.pow (yCoord, 2));
     }
          
     
}//end Point Class