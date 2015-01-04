package Threading;

//This is the class which implements the run method.. so there we create object of Thread class and pass object reference by this

class T2_Runnable_allinConstructor implements Runnable {
String name; // name of thread
Thread t;
T2_Runnable_allinConstructor(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
} 
// This is the entry point for thread.





public static void main(String ...xx)
{
	new T2_Runnable_allinConstructor("TThread");
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



