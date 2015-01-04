package Threading;





class NeedforSynch_PART6 {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans6 ft = new FinTrans6();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
		   TransThread7 tt1 = new TransThread7 (ft, "FIRST Thread");	
	     
	      TransThread7 tt2 = new TransThread7 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}


	class FinTrans6
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
		
		
		public static synchronized void calledmethodfromRUN3 (Thread t){
			
			
			int i=0;
			   while(i <10){   //here i used static methods .. as non static methods needs nonstatic members also
				   System.out.println("Current Account Balance is " + getBalance_static() + t.getName());
				   amount=500+amount;   
				   System.out.println("Balance after adding 500 rs to current balance  = " + getBalance_static() + t.getName()  );
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
	
	
		public synchronized void calledmethodfromRUN0(Thread t)		//passed current thread with in the synchronized method.
		   {
			   
			   int i=0;
			   while(i <10){
				   System.out.println("Current Account Balance is " + getBalance() + t.getName());
				   amount=0+amount;   
				   System.out.println("Balance after adding 0 rs to current balance  = " + getBalance() + t.getName()  );
				   i++;
			   }
		

		}
		
		
	}

	class TransThread7 extends Thread
	{
		FinTrans6 ft;
	   
	   
	   
	   TransThread7 (FinTrans6 ft, String name)
	   {
	      super (name); // Save thread's name
	      this.ft = ft; // Save reference to financial transaction object
	   }
	  
	   
	     
	   
	   
	   








	public void run()
	   
	   {
		  
		   //In run method .we call methods of the Shared object
		   //ft.calledmethodfromRUN1(Thread.currentThread());
		   
		   
		   ft.calledmethodfromRUN0(Thread.currentThread());
		   ft.calledmethodfromRUN1(Thread.currentThread());
		   FinTrans6.calledmethodfromRUN3(Thread.currentThread());
		   FinTrans6.calledmethodfromRUN2(Thread.currentThread());
		   
		   
		   
		   /*****GOLDEN WORDS
		    * 
		    * 
		    * always simple thing is nonstatic syn method can have static syn method running between 
		    * and static sync method can have non static syn method runninn between
		    * 
		    * so in case on 1 nonstatic and static method.. both can run parallly
		    * 
		    * while in 2 static methods.. they will run sequentially
		    * 
		    * while in 2 non static methods.. they will run sequentially
		    * 
		    * and in all other cases.. non static syn methods and static sync methods will run one by one.
		    * 
		    * 
		    */
		   
		   //here when one static method is running we can have only non static one between that..
		   //and similarly when non static method is running then we can have only static method code in between
		   
		   
		   
		  /*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   FinTrans6.calledmethodfromRUN2(Thread.currentThread());
		*/
		  
		  //here in both the cases the object and class gets a lock or simply
		  //both static and non static synchronized methods gets a lock of shared object and class respectively
		   
		   
		   //when static synchronized method is called by class name.. then lock is on class
		   //when static synchronized method is called by object name.. then lock is on object ..and eventually on class.. but lock checking is done on class.. for static methods only..
		   
		   //so when static methods are accessed in any way then they run in synchronized way
		   //when static and non static methods are synchronized and they are accessed properly then both run at object and class level locks and can run simultaneously
		   
		   
		   
		  
	   }
	   
	 
	   
	  
	   
	   
	   }
	   
	   
	
	
	
