/**
 * This simulates the gas usage of a car.
 * @author Ryan O'Hara
 * @Version 1.0
 */

public class Car
{
     
     private double MPG, Gas;
          
     /**
      * @param MilesPerGallon
      */
     
     public Car (double MilesPerGallon)
     {
          MPG = MilesPerGallon;
     }// end constructer
     
     /**
      * @param initFeul
      */
     
     public void tank (double initFeul)
     {
          Gas = initFeul;
     }

     /**
      * @param gallons
      */
    
     public void addGas (double gallons)
     {
          Gas += gallons;
     }//end addGas method 
     
     
     /**
      * @param miles
      */
     
     public void drive (double miles)
     {
          Gas -=  miles/MPG;
     }//end drive method 
     
     /**
      * @return 
      */
     
     public double checkGas ()
     {
     return Gas;
     }//end checkGas method 
     
}//end Car class