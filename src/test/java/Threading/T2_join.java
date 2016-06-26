package Threading;

class T2_join extends Thread{
	
	
	
	
	
	T2_join(String threadname){
		
		
		super(threadname);
	}
	
	


	public static void main(String ...xccc)
	
	{
		
		//Thread.currentThread().getName();
		
		T2_join tt= new T2_join("FirstThread");
		
		Secondthreadclass tt1= new Secondthreadclass("SecondThread");
		
		
		tt.start();
		tt1.start();
		
		
		System.out.println("First line of main  thread");
		System.out.println("second line of main thread");
		System.out.println("third line of main thread");
		System.out.println("fourth line of main thread");
		System.out.println("fifth line of main thread");
		System.out.println("sixth line of main thread");
		
		
		
		//By putting the below join statement.. the threads tt and tt1 will be guest threads to main .. so main will not be executed till the guest gets executed
	
	try {
		System.out.println("current executing thread is"+currentThread().getName());
		
		
		//As soon as I write the thread.join().. It will command the current thread to stop current thread execution and the
		//joined thread execution starts and control will return back to current executing thread once all the joined thread execution gets completed
		
		
		tt1.join();
		tt.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
		
		System.out.println("seventh line of main thread");
		System.out.println("eight line of main thread");
		System.out.println("ninth line of main thread");
		System.out.println("tenth line of main thread");
		
		
	}
	
	
	
	
	public void run()
	
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println("The current running thread is " + currentThread().getName());
		}
		
	}
	
	}


class Secondthreadclass extends Thread{
	
	
	
	Secondthreadclass(String thrednm){
		
		
		super(thrednm);
		
	}
	
public void run()
	
	{
	
	/*try {
		Thread.sleep(3000);	//these are static methods of Thread class which directly works on current active THREADS
	} catch (InterruptedException e) {		//OS will throw this exception if the time out will be too hight if OS feels it
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
		for(int i=0;i<5;i++)
		{
			System.out.println("The current running thread is " + Thread.currentThread().getName());
		}
		
	}
	
	
	
}

