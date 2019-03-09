package Threading;

class running extends Thread{
	
	public running(String threadName) {
		super(threadName);
		/*
		 * Need of explicit calling of super() with no argument is.. if the parent class has more than one cosntructor
		then child has to tell exclusively about which constructor of parent it has to call..
		Other wise if there is one default constructor in Parent.class.then no need to write super()
		*/
		
	start();	
	}
	
	
	
	
	
	public void run()
	
	{
		
		System.out.println("run method called");
		
	}
	
	
}

//Controller class

class T1_diff_version2{
	
	
	public static void main(String ...cccc)
	{
		new running("FirstThread");
		
	}
	
}



