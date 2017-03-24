

public class GasRunnable implements Runnable{
    private static final int DELAY = 1;
    private Car car;
    private double gas;
    private int count;
    //Construcor
    public GasRunnable(Car aCar, int aCount){
        car = aCar;
        gas = 20;
        count = aCount;
    }
    
    public void run()
    {
        try
        {
            for(int i = 0; i <= count; i++)
            {
                car.addGas(gas);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException exception){}
    }
}