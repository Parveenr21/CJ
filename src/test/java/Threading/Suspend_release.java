package Threading;

class Suspend_release{
	
	
	
	
public static void main(String ...cccc)
{
	
	Sharedclass s1 = new Sharedclass();		//here object of Shared class is created and passed to Thread implementing class
	
	 new implementingclass("111-Thread" ,s1);
	 new implementingclass("222-Thread", s1);
	 
	 
}
	
	
	
}


class implementingclass implements Runnable{
	
	Sharedclass sss;
	
	public implementingclass(String xx, Sharedclass xxx) {
		
		sss=xxx;
		Thread th1=new Thread(this,xx);
		th1.start();
		
		//th1.suspend();			//This method works on Thread object	once thread is suspended it should be waken up by resume only os is not killing it 
		
	//th1.resume();			//This method works on Thread object
	
	//Better to use sleep method if we are sure about time as these methods are deprecated
	
	}
		
	
	public void run(){
			
		
			

			for (int i=0;i<10;i++)
			{
			System.out.println(	sss.getStringVALUE() + "  with thread name  "  + Thread.currentThread().getName() + "value of i " + i);
			
			
			// Thread.sleep function voluntarily request OS to switch the thread but if serialization
			// is there then only the thread stick to current thread complete execution and no switching till
			//one gets completed
			
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
			
			
			
			}


			
		
				
		
	}
	
	
}



class Sharedclass{
	
	
	int a=10;
	String s = "JAVA 1.7";
	
	String getStringVALUE()
	{
		
		return s;
	}
	
	void setString(String x)
	
	{
		
		s=x;
		
	}
	
}
