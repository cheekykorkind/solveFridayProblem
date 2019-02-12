package task;
import model.*;

public class NumberChecker extends Thread 
{
    NumberGenerater numberGenerater;

    public NumberChecker(NumberGenerater numberGenerater)
    {
        this.numberGenerater = numberGenerater;
    }

    public void run() {
        synchronized(this.numberGenerater) {
            System.out.println("checker start");
            while(true) {
                try {
                    this.numberGenerater.wait(1);
                    if (Data.first == Data.second && Data.second == Data.third) {
                        Data.onOffStatus = false;
                        
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("================");
            System.out.println("end");
            System.out.println("================");
        }
    }

}