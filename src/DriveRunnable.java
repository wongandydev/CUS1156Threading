

public class DriveRunnable implements Runnable
{
    private static final int DELAY = 1;
    private Car car;
    private double amount;
    private int count;
    //Contructor
    public DriveRunnable(Car aCar, int aCount)
    {
        car = aCar;
        amount = 300;
        count = aCount;
    }
    
    public void run()
    {
        try
        {
            for(int i = 0; i <= count; i++)
            {
                car.drive(amount);
                Thread.sleep(1);
            }
        }
        catch (InterruptedException exception){}
    }
}