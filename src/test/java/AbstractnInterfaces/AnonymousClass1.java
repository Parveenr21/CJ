package AbstractnInterfaces;

public class AnonymousClass1 {

    //Java program to illustrate creating an immediate thread
//Using Anonymous Inner class that extends a Class

    //Here anonymous class will be having same name as one of the EXISTING class

    // here its Thread class implmenting inner class..


        public static void main(String[] args)
        {
            //Here we are using Anonymous Inner class
            //that extends a class i.e. Here a Thread class
            Thread t = new Thread()
            {
                public void run()
                {
                    System.out.println("Child Thread");
                }
            };
            t.start();
            System.out.println("Main Thread");
        }
    }


