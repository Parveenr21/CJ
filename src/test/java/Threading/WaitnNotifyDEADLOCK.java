package Threading;

class WaitnNotifyDEADLOCK{
	
	
	
	public static void main(String ...xxx)

	{
		
		shared1 sh1 = new shared1();
		shared2 sh2 = new shared2();
	
	new Runnableimpl("Thread-1" ,sh1,sh2);
	new Runnableimpl("Thread-2" ,sh1,sh2);
	new Runnableimpl("Thread-3" ,sh1,sh2);
	
	}
	
}

class Runnableimpl implements Runnable{
	
	shared1 sh1;
	shared2 sh2;
	
	Runnableimpl(String threadname,shared1 sh1, shared2 sh2 ){
		
		new Thread(this, threadname).start();
		this.sh1=sh1;
		this.sh2=sh2;
		
		
	}
	
	
	public void run()
	{
		
		
		System.out.println("inside run with thread name" + Thread.currentThread().getName());
		
		synchronized (sh1) {
		
			System.out.println(sh1.getbalance() + " with thread name " +Thread.currentThread().getName() );
			
			
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
			synchronized (sh2) {
				
				System.out.println(sh2.getbalance() + " with thread name " +Thread.currentThread().getName());
				
								}
			
						}
		
		
		
		//This SECOND synnchronized nested block will bring DEADLOCK as one thread is havnig lock on sh1
		//then any other thread will get lock on sh2
		
		/*synchronized (sh2) {
			
			System.out.println(sh1.getbalance() + " with thread name " +Thread.currentThread().getName());
			
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
			synchronized (sh1) {
				
				System.out.println(sh2.getbalance() + " with thread name " +Thread.currentThread().getName());
				
								}
			
						}
		*/
		
		
	}
	
}



class shared1{
	
	int balance=100;
	
	
	int getbalance(){
		
		return balance;
	}
	
}

class shared2{
	
	int balance=200;
	
int getbalance(){
		
		return balance;
	}
	
	
}