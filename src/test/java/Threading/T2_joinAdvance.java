package Threading;

class Demo implements Runnable {
String name; // name of thread
Thread t;
Demo(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
} 

public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println(name + " interrupted.");
}


System.out.println(name + " exiting.");
}
}





class T2_joinAdvance {
public static void main(String args[]) {
	Demo ob1 = new Demo("One");
	Demo ob2 = new Demo("Two");
	Demo ob3 = new Demo("Three");

	
	System.out.println("Thread One is alive: "+ ob1.t.isAlive());
System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
System.out.println("Thread Three is alive: "+ ob3.t.isAlive());




// wait for threads to finish
try {
System.out.println("Waiting for threads to finish.");			//aS we are joining the guest thread in the current (main ) thread..
																//so to give respect to guest.. the main thread will pause till guest thread gets completed
ob1.t.join();
ob2.t.join();
ob3.t.join();
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
}
System.out.println("Thread One is alive: "+ ob1.t.isAlive());
System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
System.out.println("Main thread exiting.");
}
}