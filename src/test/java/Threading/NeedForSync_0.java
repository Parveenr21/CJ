package Threading;

public class NeedForSync_0 {
    private static int count = 0;


    //look how.. the counter in for loop for separate threads.. are hanlded beutifully in separate blocks.. under synchronized.. methods.

    //once method name has synchronized keyword..then each object accessing or thread accessing method needs exclusive implicit lock on this ..and no other thread can acess this at that time
    public static synchronized void increment() {
        count++;
    }

    public static void main(String ...ddd) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread2.start();


        //YIELD Its a request to current thread to stop and let same priority thread go on execution


//Thread.yield();
//        Thread.yield();
//        Thread.yield();

        try {
            //Wait until thread execution is going on..


            thread1.join();        //this will suspend or wait the current thread execution..which is main method thread..till thread1 on which join is called is executed completely.
            thread2.join();         //this will suspend or wait the current thread execution..which is main method thread..till thread1 on which join is called is executed completely.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);
    }
}