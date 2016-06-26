package Threading;

class T1 extends Thread{  //THREADING via INHERITANCE
	
	//int x=100;
	
	public static void main(String ...xxx)
	
	{
		
		
		//this static method "currentThread" gives reference of current running thread
		//so the main method is run on the main thread started by jvm
		// Although at one time processor cycles are given to one tasks at a time only
		
		//class Thread implements Runnable  ..Thread class also implements runnable interface
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		
		//child thread of main.. in Java all the threads are child thread
		//in JAVA we can not run independent thread.
		
		/*
		Thread object of same class.. if we have to call same run method or want to perform same task by
		all the threads.. but if all the threads want to perform diff tasks then 3 diff run methods need to 
		be created or simply 3 diff classes which extends Thread class 
		Check T1_diffversion.java*/
		
		
		T1 th1 = new T1();  
		T1 th2 = new T1();
		T1 th3 = new T1();
		
	
		th1.start();
		th2.start();
		th3.start();
		
		
		System.out.println("MAIN thread executing");
		
		//Once the start method is called then its thread is called as indepently and then next statement
		//of main thread is executed without waiting for start method of first thread object to finish its work
		
		
	}
	
	
	
	public void run(){
		
		
		//here this current thread is static method of Thread class so automatically coming to this class
		//as a part of extends
		
		System.out.println("Thread running by thread object name" + currentThread().getName());
		
		//DBapi.Database().test();	//Singleton class can be accessed by multiple threads...
		//and as the same object will be shared by all threads. so all threads can access and perform operation on the 
		//method variables.. which will be same ..as one object method variable.
	
	/*synchronized (DBapi.Database()) {		//having the object which will be shared between all threads
		
		DBapi.Database().test();
		
	}*/
	
		DBapi.Database().test();
		
	}
	
	
}