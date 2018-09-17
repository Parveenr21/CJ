package Threading;


import org.junit.experimental.theories.Theories;
import org.testng.internal.thread.TestNGThread;

class Runner extends Thread {

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);
            System.out.println("curent Thread is "+ Thread.currentThread());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}


class Runner1 implements Runnable
{


    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);
            System.out.println("curent Thread is "+ Thread.currentThread());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}


public class WaysToCreateThread {


    public static void main(String[] args) {

//first way

        Runner runner1 = new Runner();
    //    runner1.start();

        Runner runner2 = new Runner();
   //     runner2.start();


        //second way

        Thread t3 = new Thread(new Runner1());
        Thread t4 = new Thread(new Runner1());

        //t3.start();
     //   t4.start();

//Third way ..this does not need any implements or extends..
        Thread t5 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello: " + i);
                    System.out.println("curent Thread is " + Thread.currentThread());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        t5.start();


    }



}
