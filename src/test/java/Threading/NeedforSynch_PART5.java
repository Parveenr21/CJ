package Threading;





class NeedforSynch_PART5 {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans5 ft = new FinTrans5();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
	      TransThread6 tt1 = new TransThread6 (ft, "FIRST Thread");	
	     
	      TransThread6 tt2 = new TransThread6 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}


	class FinTrans5
	{
	   public static String transName;
	   public static double amount;


	double getBalance(){
		
		return amount;
		
	}
	
	static double getBalance_static(){
		
		return amount;
	}

	
	//STATIC synchronized method with synchronized keyword removed
	
	
		public static void calledmethodfromRUN2 (Thread t){
		
		
			int i=0;
			   while(i <10){   //here i used static methods .. as non static methods needs nonstatic members also
				   System.out.println("Current Account Balance is " + getBalance_static() + t.getName());
				   amount=200+amount;   
				   System.out.println("Balance after adding 200 rs to current balance  = " + getBalance_static() + t.getName()  );
				   i++;
			   }
		
		
	}
		
		
		public void calledmethodfromRUN1(Thread t)		//passed current thread with in the synchronized method.
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

	class TransThread5 extends Thread
	{
	     FinTrans5 ft;
	   
	   
	   
	   TransThread5 (FinTrans5 ft2, String name)
	   {
	      super (name); // Save thread's name
	      this.ft = ft2; // Save reference to financial transaction object
	   }
	  
	   
	     
	   
	   
	   public void run()
	   
	   {
		  
		   //In run method .we call methods of the Shared object
		   
		  
		  /*
		   * 
		   * here instead of calling these synchronized method .. i will put these 3 methods call in synchronized
		   * block and remove synchronized from these method declaration
		   * 
		  FinTrans5.calledmethodfromRUN2(currentThread());
		  
		  ft.calledmethodfromRUN1(currentThread());
		  
		  ft.calledmethodfromRUN2(currentThread());
		*/
		  
		   /*
		    * 
		    * So here we get the same results like what we expect with the synchronized methods.
		    * 
		    * 
		    * 
		   */
		  synchronized (ft) {
			
			  FinTrans5.calledmethodfromRUN2(currentThread());
			  
			  ft.calledmethodfromRUN1(currentThread());
			  
			  ft.calledmethodfromRUN2(currentThread());
			  
		} 
		   
		   
		   
		   
		  
	   }
	   
	 
	   
	  
	   
	   
	   }
	   
	   
	
	
	
