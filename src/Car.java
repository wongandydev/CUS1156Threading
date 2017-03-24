import java.text.DecimalFormat;

public class Car
{  
   private double gasInTank;
   private double mpg;
   DecimalFormat formatter = new DecimalFormat("0.00");    
   /**
      Constructs a car with gas efficiency (miles per gallon).
   */
   public Car(double efficiency)
   {   
      mpg = efficiency;
      gasInTank = 0;
   }

   
   public void addGas(double amount)
   {  
        
        System.out.print("Adding Gas: " + formatter.format(amount));
	gasInTank = gasInTank + amount;
        System.out.println(", current gas in tank:" + formatter.format(gasInTank));
   }

   
   public void drive(double miles)
   {   
      System.out.print("Driving: " + formatter.format(gasInTank));
      gasInTank = gasInTank - miles/mpg;
      System.out.println(", drive completed. Gas left in tank: " + formatter.format(gasInTank));
   }

   
   public double getGas()
   {   
      return gasInTank;
   }
}