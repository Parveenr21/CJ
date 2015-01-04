package Threading;



class Threads_withRunnable_ideally{
	
	
	
	
	public static void main(String ...xxxx)
	
	{
		
		Threadcreation1 tt = new Threadcreation1("1-Thread");
		Threadcreation1 tt1 = new Threadcreation1("2-Thread");
		
	}
	
	
}


class Threadcreation1 implements Runnable{
	
	
	
	Threadcreation1(String name){
		
		
		new Thread(this,name).start();
		
	}
	
	
	
	
	
	public void run(){
		
		System.out.println("Thread running with name " + Thread.currentThread().getName() );
		
		
	}
	
	
}