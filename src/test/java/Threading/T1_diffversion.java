package Threading;

public class T1_diffversion{  //THREADING via INHERITANCE
	
	
	public static void main(String ...xxx)
	{
		
		new thre1().start();
		new thre2().start();
		new thre3().start();
		
	
	//This run method call or simply threads execution can be started anywhere even in the 
		//constructor .. 
	
		new thre5();
		System.out.println("MAIN thread ended");
		
		
		
		
		
		
		
/*we have put a checked exception InterruptedException try catch in Thread.sleep .. but when it comes??
actually this method is OS methods and not the thread methods..In thread class 80% methods are native
check this in Thread class.. so this is all handled by OS
e.g. public static native void sleep(long millis) throws InterruptedException;
*
*/		
		
		
	}
	
	
	
	
	
}

class thre1 extends Thread{
	
	
	public thre1() {
		
		super("FIRST THREAD");
	}
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
		System.out.println("Run method of class name " + thre1.currentThread().getName());
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
class thre2 extends Thread{
	
	
	public thre2() {
		
		super("SECOND THREAD");
	}
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
			System.out.println("Run method of class name " + thre2.currentThread().getName());
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


class thre3 extends Thread{
	
	public thre3() {
		
		super("THIRD THREAD");
	}
	
	
	
	public void run(){
		
		int i=0;
		while(i<5)
		{
			System.out.println("Run method of class name " + thre3.currentThread().getName());
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
	

class thre5 extends Thread{
	
	public thre5() {
	
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