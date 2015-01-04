package Threading;

class WaitnNotify{
	
	public static void main(String ...ccc)

	{
		
		Sharedclassss sc1= new Sharedclassss();
		
		int j=Sharedclassss.ObjectCount;
		implementing ii[]= new implementing[j];
		
		for(int i=1;i<=j;i++)
		
		{
			ii[i-1]=new implementing((i + " Thread"), sc1, i);
			
		}
		
		
	}
	
	
}


class implementing implements Runnable{
	
	
	Sharedclassss sc1;
	

	
	Thread t[] = new Thread[Sharedclassss.ObjectCount];
	
	int counter;
	
	public implementing(String threadname ,Sharedclassss reference, int counter ) {
	
		
		
		sc1=reference;
		
		this.counter = counter;
		
		 t[this.counter -1]=new Thread(this,threadname);
		 
		if(counter==5)
		{
			
			//t[4].setPriority(1);  
			
			
			
		/*	This statement is necessary as we need to set the 5th thread to be runinng in the last 
			as this thread will wake up all the blocked pool threads and if there is any thread that runs after this thread will never be notified by any thread
			
			e.g. the order of thread execution
			
			T1 -- wait
			T3 -- wait
			T5 -- notifyAll -- this will wake up T1 and T3
			T2 -- wait (program will always wait this thread to be notofoed by any other thread)
			T4 -- wait (program will always wait this thread to be notofoed by any other thread)
		
			*/
			
		}
		
		 t[this.counter -1].start();
		
		
		
		
		
	
		
	}
	
	public void run()
	{
		
//		System.out.println(Thread.currentThread().getName()  + "  "  + sc1.xx);
	
		sc1.sharedmethod();
		
		/*synchronized (sc1) {
			
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Thread.currentThread().getName().contains(5 + " Thread"))
			{
				notify();
				
			}
			
		}*/
		
		
	}
	
	
}

class Sharedclassss{
	
	
	int xx=10;
	static int ObjectCount=5;
	
	
	synchronized void sharedmethod(){
		
		
		System.out.println("before wait condition with thread name " + Thread.currentThread().getName());
		
		
		
		if(Thread.currentThread().getName().equals (5 + " Thread"))
		{
			
			//notify(); //very first thread of block pool will come alive to runnable pool ****(FIFO) will be applied to it. 
		
			notifyAll(); //This will wake up all the threads which would be in blocked pool.. and it will bring all to runnable pool
			
			
		}
		
		
		//if(Thread.currentThread().getName().equals (1 + " Thread"))
		else{
		try {
			
			wait();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
		System.out.println("after wait condition with thread name " + Thread.currentThread().getName());
		
		
		
	}
	
	
}