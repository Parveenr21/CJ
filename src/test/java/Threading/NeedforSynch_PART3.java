package Threading;





class NeedforSynch_PART3 {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans3 ft = new FinTrans3();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
	      TransThread3 tt1 = new TransThread3 (ft, "FIRST Thread");	
	     
	      TransThread3 tt2 = new TransThread3 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}


	class FinTrans3
	{
	   public static String transName;
	   public static double amount;


	double getBalance(){
		
		return amount;
		
	}

	
	public synchronized void calledmethodfromRUN(Thread t)		//passed current thread with in the synchronized method.
	   {
		   
		   int i=0;
		   while(i <10){
			   System.out.println("Current Account Balance is " + getBalance() + t.getName());
			   amount=100+amount;   
			   System.out.println("Balance after adding 100 rs to current balance  = " + getBalance() + t.getName()  );
			
			   
			   i++;
		   }
	

	}


	
	public synchronized void calledmethodfromRUN1(Thread t)		//passed current thread with in the synchronized method.
	   {
		   
		   int i=0;
		   while(i <10){
			   System.out.println("Current Account Balance is " + getBalance() + t.getName());
			   amount=200+amount;   
			   System.out.println("Balance after adding 200 rs to current balance  = " + getBalance() + t.getName()  );
			   i++;
		   }
	

	}

	
	
	}

	class TransThread3 extends Thread
	{
	     FinTrans3 ft;
	   
	   
	   
	   TransThread3 (FinTrans3 ft, String name)
	   {
	      super (name); // Save thread's name
	      this.ft = ft; // Save reference to financial transaction object
	   }
	  
	   
	     
	   
	   
	   public void run()
	   
	   {
		  
		   //In run method .we call methods of the Shared object
		   
		  ft.calledmethodfromRUN(currentThread());
		  
		  ft.calledmethodfromRUN1(currentThread());
	   }
	   
	 
	   
	  
	   
	   
	   }
	   
	   
	
	
	
