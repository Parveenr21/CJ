package AbstractnInterfaces;

public class AnonymousClass2 {

    public static void main(String ...cc)
    {
//here Runnable interface implementing anonymous class.. here... we are calling start method..of thread class which calls run()

        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Child Thread");

            }
        };
        Thread t1= new Thread(r1);          //pass runnable interface implemented class reference here.. in this case its anonymous one.
        t1.start();
        System.out.println("Main Thread");

    }
}
