package task;
import model.*;

public class NumberGenerater extends Thread 
{
    public NumberGenerater()
    {
    }

    public void run()
    {
        synchronized(this) {
            while(Data.onOffStatus) {
                
                try {
                    System.out.println("---------------");
                    Data.first = (int) (Math.random() * 10 % 5);                    
                    this.wait(200);

                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
                
                try {
                    Data.second = (int) (Math.random() * 10 % 5);
                    this.wait(200);
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    
                
                try {
                    Data.third = (int) (Math.random() * 10 % 5);
                    this.wait(200);
                    
                    System.out.println(String.format("%d %d %d", Data.first, Data.second, Data.third));
                    System.out.println("---------------");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}