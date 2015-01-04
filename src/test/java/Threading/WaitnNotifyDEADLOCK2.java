package Threading;

class WaitnNotifyDEADLOCK2{
	
	
	
	public static void main(String ...xxx)

	{
		
		shared11 sh1 = new shared11();
		shared22 sh2 = new shared22();
	
	new Runnableimpl1("Thread-1" ,sh1,sh2);
	new Runnableimpl1("Thread-2" ,sh1,sh2);
	new Runnableimpl1("Thread-3" ,sh1,sh2);
	
	}
	
}

class Runnableimpl1 implements Runnable{
	
	shared11 sh1;
	shared22 sh2;
	
	Runnableimpl1(String threadname,shared11 sh1, shared22 sh2 ){
		
		new Thread(this, threadname).start();
		this.sh1=sh1;
		this.sh2=sh2;
		
		
	}
	
	
	public void run()
	{
		
		
		System.out.println("inside run with thread name" + Thread.currentThread().getName());
	
		System.out.println(sh1.SetnGetbalance(55));
		
		
		
		
		
	}
	
}



class shared11{
	
	int balance=100;
	
	
	synchronized int getbalance(){
		
		return balance;
	}
	
	
	synchronized int SetnGetbalance(int x)
	{
		
		System.out.println(Thread.currentThread().getName());
		this.balance=x;
		return getbalance();
	}
	
	
}

class shared22{
	
	int balance=200;
	
int getbalance(){
		
		return balance;
	}
	
	
}