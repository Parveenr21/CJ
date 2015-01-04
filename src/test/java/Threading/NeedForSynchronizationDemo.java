package Threading;

class NeedForSynchronizationDemo
{
   public static void main (String [] args)
   {
      
	   
	   FinTrans ft = new FinTrans ();
      
      
      //here along with creating threads object we are passing reference of a class or simply a shared object  for all the
      //threads so that variables or state of that object will be shared to all the threads objects
      
      
      TransThread tt1 = new TransThread (ft, "FIRST Thread");	
     
      TransThread tt2 = new TransThread (ft, "SECOND Thread");
      tt1.start ();
      tt2.start ();
   }
}


class FinTrans
{
   public static String transName;
   public static double amount;


double getBalance(){
	
	return amount;
	
}


}




class TransThread extends Thread
{
   private FinTrans ft;
   
   
   
   TransThread (FinTrans ft, String name)
   {
      super (name); // Save thread's name
      this.ft = ft; // Save reference to financial transaction object
   }
  
   
   
  /* public void run ()
   {
      for (int i = 0; i < 5; i++)
      {
           if (getName ().equals ("Deposit Thread"))
           {
               // Start of deposit thread's critical code section
               ft.transName = "Deposit";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 2000.0;
               System.out.println (ft.transName + " " + ft.amount);
               // End of deposit thread's critical code section
           }
           else
           {
               // Start of withdrawal thread's critical code section
               ft.transName = "Withdrawal";
               try
               {
                  Thread.sleep ((int) (Math.random () * 1000));
               }
               catch (InterruptedException e)
               {
               }
               ft.amount = 250.0;
               System.out.println (ft.transName + " " + ft.amount);
               // End of withdrawal thread's critical code section
           }
      }
	   
	  
   }*/
   
   
   
   public void run()
   
   {
	   
	   int i=0;
	   while(i <5){
		   
		   System.out.println("Current Account Balance is " + ft.getBalance() + currentThread().getName());
		   ft.amount=100+ft.amount;   
		   System.out.println("Balance after adding 100 rs to current balance  = " + ft.getBalance() + "for Thread name" + currentThread().getName() );
		   i++;
	   }
	   
	   
	   //So for implementing or Extending way of Threading we just need 2 classes atleast but for shared variables
	   //we need to have 3 classes atleast
	   
	   
	   
	  
	   /*So the the Shared variable for two thread would be in different classes.
	    
	    
	    
	    * The design would be 
	     1. Main classs which will create object of Thread implementing or extending class and pass the reference variable of a class whose members it can share 
	   	
	   	 2. Thread implementing or extending class will be having a run method where it can access the shared class variables.. as it 
	   	 is sharing by the call be refence so both thread object run method will be sharing a common class variables.  
	   	
	   	 3. This shared class will be having get and set function to do the operation and will be called by the shared
	   	 	varible inside run method.
	   	  
	   
	   */
	   
   }
   
   
   
   
   public void calledmethodfromRUN()
   {
	   
	   
	   
   }
   
   
   
   
}