

public class CarThreadRunner
{
    public static void main (String [] args)
    {
        Car car = new Car(20);
        final int repitition = 10;
        final int threads = 100;
        
        for(int a = 0; a <= threads; a++)
        {
            GasRunnable g = new GasRunnable(car, repitition);
            DriveRunnable d = new DriveRunnable(car, repitition);
            
            Thread gt = new Thread (g);
            Thread dt = new Thread (d);
            
            gt.start();
            dt.start();
        }
    }
}