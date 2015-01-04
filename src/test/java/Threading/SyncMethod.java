package Threading;

class ThreadCreating implements Runnable{
	
	/*As thread object or simply an object gets its own copy of non static data members, so non static members can not be shared members
	And also static members can be shared by all objects.. but they should not be accessed by objects.. so no point of
	calling them by thread objects.. so how we would get shared variables???
	*/
	
	
	int x=10;
 int amount;	

	
	public ThreadCreating(String threadName, int amt) {
		
		amount = amt;
		new Thread(this,threadName).start();
		
	}
	
		
	public void setx(int amount){
		
		this.x=this.x+amount;
		
	}
	
	
	public void getx(){
		
		System.out.println("the final amount is " + this.x);
		
	}
	
	
	public void run()
	{
		
		
		
		setx(amount);
		getx();
					
		
	}
	
	
	
	
}



class SyncMethod{
	
	
	public static void main(String ...xxx)
	{
		
		for(int i=0;i<10;i++)
		{
		ThreadCreating s= new ThreadCreating("firstThread",100);
		}
	
	
		
		
	}
	
	
	
	
	
	
}