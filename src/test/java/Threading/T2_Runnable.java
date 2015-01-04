package Threading;


class T2_Runnable implements Runnable {			//THREADING via Association but implementing runnable method
	
	
	
	
	public static void main(String ...xxx)
	
	{
		
		T2_Runnable t2ref = new T2_Runnable();
		
		
		
		new Thread().start(); //This will call the run method of the Thread class and not the overridden
		
		
		/*here we are passing the reference variable of the class where we are overriding the 
		run method..T2 and this passing is simply registration of that child class to Runnable 
		interface, because this RI actually calls this run method indirectly
		*/
		
		
		Thread thrX= new Thread(t2ref);
		Thread thrX1= new Thread(t2ref, "ThreadnameSET2ONE");
		
		thrX.start();
		thrX1.start();
		
	}

	
	public void run() {
		
	
		System.out.println("Overridden Run method of the class" +Thread.currentThread().getName() );
		
		
		
	}
	
	
	
	
}