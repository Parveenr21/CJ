package Threading;





class NeedforSynch_PART4 {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans5 ft = new FinTrans5();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
	      TransThread5 tt1 = new TransThread5 (ft, "FIRST Thread");	
	     
	      TransThread5 tt2 = new TransThread5 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}


	class FinTrans4
	{
	   public static String transName;
	   public static double amount;


	double getBalance(){
		
		return amount;
		
	}
	
	static double getBalance_static(){
		
		return amount;
	}

	
	//STATIC synchronized method
	
	
		public static synchronized void calledmethodfromRUN2 (Thread t){
		
		
			int i=0;
			   while(i <10){   //here i used static methods .. as non static methods needs nonstatic members also
				   System.out.println("Current Account Balance is " + getBalance_static() + t.getName());
				   amount=200+amount;   
				   System.out.println("Balance after adding 200 rs to current balance  = " + getBalance_static() + t.getName()  );
				   i++;
			   }
		
		
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

	class TransThread6 extends Thread
	{
	     FinTrans5 ft;
	   
	   
	   
	   TransThread6 (FinTrans5 ft2, String name)
	   {
	      super (name); // Save thread's name
	      this.ft = ft2; // Save reference to financial transaction object
	   }
	  
	   
	     
	   
	   
	   public void run()
	   
	   {
		  
		   //In run method .we call methods of the Shared object
		   
		  
		  
		  FinTrans4.calledmethodfromRUN2(currentThread());
		  
		  ft.calledmethodfromRUN1(currentThread());
		  
		  ft.calledmethodfromRUN2(currentThread());
		
		  
		  //here in both the cases the object and class gets a lock or simply
		  //both static and non static synchronized methods gets a lock of shared object and class respectively
		  
	   }
	   
	 
	   
	  
	   
	   
	   }
	   
	   
	
	
	
