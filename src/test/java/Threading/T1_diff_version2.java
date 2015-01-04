package Threading;


class running extends Thread{
	
	public running(String threadName) {
		super(threadName);
	start();	
	}
	
	
	
	
	
	public void run()
	
	{
		
		System.out.println("run method called");
		
	}
	
	
}

class T1_diff_version2{
	
	
	public static void main(String ...cccc)
	{
		new running("FirstThread");
		
	}
	
}



