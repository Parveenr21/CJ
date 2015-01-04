package Threading;

class T2_apis extends Thread{
	
	T2_apis(){
		
		
		super("T2apisCUSTOMthread");
	}
	
	
	public static void main(String ...xccc)
	
	{
		
		T2_apis tt= new T2_apis();
		
		tt.start();
		
		
		
		
		
		System.out.println(	"thread calling  " + tt.getPriority()); 
		System.out.println(	"thread calling  " + tt.getName()); 
	
	tt.setPriority(6);
		
	//tt.setPriority(15);		illegal arguement Exception of runtime, can only pass values between 1 to 10
	
	
	}
	
	public void run()
	{
		
	/*The below written apis are non static and idly should be called outside the run method
		by directly like
		
		tt.getName();
		tt.setPriority();
	*/	
	
		
		
		
		System.out.println(	getName());   //this is same as currentThread().getName()
		System.out.println(	getPriority());  //this is same as currentThread().getPriority()
		System.out.println(	currentThread().getName());
		System.out.println(	currentThread().getPriority()); 
		
		
		
	setPriority(MIN_PRIORITY);		//MIN_PRIORITY	is 1 and MAX_PRIORITY is 10 , the default priority is 5
		
		System.out.println(	getState());
		System.out.println(	getThreadGroup());
		System.out.println(	isAlive());
		System.out.println(	isDaemon());
		System.out.println(	isInterrupted());
		
		//setDaemon(isAlive()); 	//the syntax is setDaemon(boolean) 
		System.out.println(	isAlive());
		
		//		System.out.println(	tt.yield());
		//	System.out.println(	tt.sleep(millis));

		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yield();
		suspend(); //deprecated
		stop();	//deprecated
		resume(); //deprecated
		
		
		
		
		
		
		
	}
	
	
}
