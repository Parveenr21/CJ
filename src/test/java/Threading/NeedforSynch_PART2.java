package Threading;





class NeedforSynch_PART2 {
	
	public static void main (String [] args)
	   {
	      
		   
		   FinTrans2 ft = new FinTrans2 ();
	      
	      
	      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
	      //threads so that variables or state of that object will be shared to all the threads objects
	      
		   
	      
	      TransThread1 tt1 = new TransThread1 (ft, "FIRST Thread");	
	     
	      TransThread1 tt2 = new TransThread1 (ft, "SECOND Thread");
	      tt1.start ();
	      tt2.start ();
	   }
	}




	class FinTrans2
	{
	   public static String transName;
	   public static double amount;


	double getBalance(){
		
		return amount;
		
	}

		}

	
	
	
	
	
	
	class TransThread1 extends Thread
	{
	     FinTrans2 ft;
	   
	   
	   
	   TransThread1 (FinTrans2 ft, String name)
	   {
	      super (name); // Save thread's name
	      this.ft = ft; // Save reference to financial transaction object
	   }
	  
	   
	   
	   
	   
	   public void run()
	   
	   {
		   
		   calledmethodfromRUN();
		  
		    
	   }
	   
	   
	   //The below one will not be synchornized as the object before calling gets a lock..
	   //this happens for the calling object other than thread
	   
	   public  void calledmethodfromRUN()				
	   /*here this public synchronized void calledmethodfromRUN()	does not work
	   beacause we need to have lock on the ft object which could only be done by having synchronized method with
	   in the shared class method and not in thread methods
	   */
	   
	   {
		 
		   synchronized (ft) {
			
			   
			   int i=0;
				while(i <10){
											
					  System.out.println("Current Account Balance is " + ft.getBalance() + currentThread().getName());
					   ft.amount=100+ft.amount;   
					   System.out.println("Balance after adding 100 rs to current balance  = " + ft.getBalance() + "for Thread name" + currentThread().getName() );
					  		   i++;
					  		   
					  		  		  		   
			 }
				
				/*
			   Now it could be like .. with in a fucntion or a run method itself we can have multiple CS
				and one thread is about to access one CS and another thread to some another CS, but still 
				in that case also different threads can not access the different CS as the lock is on the
				Shared object.. when one thread is executing the CS with that object lock..no other thread can execute the CS
				with same object lock.
				
				*/
		}
		   
		    
	   
	   
	   
	   }  
	   
	   
	   }
	   
	   
	
	
	
