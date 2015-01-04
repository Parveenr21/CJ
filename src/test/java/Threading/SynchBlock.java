package Threading;





class SynchBlock {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans9 ft = new FinTrans9();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
		   TransThread8 tt1 = new TransThread8 (ft, "FIRST Thread");	
	     
	      TransThread8 tt2 = new TransThread8 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}


	class FinTrans9
	{
	   public static String transName;
	   public static double amount;
	   
	   public String s="test";

	   
	   
	double getBalance(){
		
		return amount;
		
	}
	
	static double getBalance_static(){
		
		return amount;
	}

	/*So to make any method work in synchronized way .. we can easily achieve it by having a synchronized block..
	 * 
	 * 
	 * In this synchronized block we pass a object reference.. which is saying a lock on that object is set once thread executes synchronized 
	 * block...and as soon as it leaves synchronized block..it also releases lock.
	 * 
	 * synchronized blocks are better approach then methods.
	 * 
	 * 
	*/
	
	public void generalmethod(Thread t)
	
	{
		
		int i=0;
		   
		synchronized (s) {		//here lock is on String object.. we can get lock on any object
			
			while(i <10){   //here i used static methods .. as non static methods needs nonstatic members also
				  
				   System.out.println("Current Account Balance is " + getBalance_static() + t.getName());
				   amount=200+amount;   
				   System.out.println("Balance after adding 200 rs to current balance  = " + getBalance_static() + t.getName()  );
				   i++;
			   }	
		}
		
		
		
	}
	
	

	
	//STATIC synchronized method
	
	
		public static synchronized void calledmethodfromRUN2 (Thread t){
		
		
			
		 
	 		   
	}
		
		
		
		public synchronized void calledmethodfromRUN1(Thread t)		//passed current thread with in the synchronized method.
		   {
			   
			   int i=0;
			   while(i <10){
				   System.out.println("Current Account Balance is " + getBalance() + t.getName());
				   amount=100+amount;   
				   System.out.println("Balance after adding 100 rs to current balance  = " + getBalance() + t.getName()  );
				   i++;
			   }
		

		}
	
	
	
		

		
	}

	class TransThread8 extends Thread
	{
		FinTrans9 ft;
	   
	   
	   
	   TransThread8 (FinTrans9 ft, String name)
	   {
	      super(name); // Save thread's name
	      this.ft = ft; // Save reference to financial transaction object
	   }
	  
	   
	     
	   
	   
	 





	public void run()
	   
	   {
		   
		ft.generalmethod(Thread.currentThread());
		   
		  
	   }
	   
	 
	   
	  
	   
	   
	   }
	   
	   
	
	
	
