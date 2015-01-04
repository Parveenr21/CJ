package Threading;

public class T1_directRunmethodcall{  //THREADING via INHERITANCE
	
	
	public static void main(String ...xxx)
	{
		
		new thre11().run();
		new thre22().run();
		new thre33().run();
		
	
	//This run method call or simply threads execution can be started anywhere even in the 
		//constructor .. 
	
		//new thre5();
		System.out.println("MAIN thread ended");
		
		
		
		
		
		
		
/*we have put a checked exception InterruptedException try catch in Thread.sleep .. but when it comes??
actually this method is OS methods and not the thread methods..In thread class 80% methods are native
check this in Thread class.. so this is all handled by OS
e.g. public static native void sleep(long millis) throws InterruptedException;
*
*/		
		
		
	}
	
	
	
	
	
}

class thre11 extends Thread{
	
	
	public thre11() {
		
		super("FIRST THREAD");
	}
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
		System.out.println("Run method of class name " + thre11.currentThread().getName());
		try {
			thre1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		++i;		
	}
	
	
}
}
class thre22 extends Thread{
	
	
	public thre22() {
		
		super("SECOND THREAD");
	}
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
			System.out.println("Run method of class name " + thre22.currentThread().getName());
		++i;		
	
		try {
			thre1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
		
	}
	
	
}


class thre33 extends Thread{
	
	public thre33() {
		
		super("THIRD THREAD");
	}
	
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
			System.out.println("Run method of class name " + thre33.currentThread().getName());
		++i;
		
		try {
			thre1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
	}
	
	

		
	}
	

class thre55 extends Thread{
	
	public thre55() {
	
		super("Fourth THREAD");
		start();  //calling start in constructor
		
	}
		
	
	
public void run() {
	
		int i=0;
		while(i<5)
		{
			System.out.println("Run method of class name " + currentThread().getName());
		++i;
		
		try {
			thre1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}


	
}