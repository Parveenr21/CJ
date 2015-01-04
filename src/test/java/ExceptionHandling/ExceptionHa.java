package ExceptionHandling;


class ExceptionHa{
	
	int k=0;
	static int z=0;
	
	public void finalize(){
		
		System.out.println("finalize executed");
		
	}
	
 

public void exec1() throws NullPointerException{
	int a=1;
	if(a==1)
	{
	throw new NullPointerException();	
	}
}
	
	public void exec()
	
	{

		
		
		
		try{
			exec1();	
			k=1/0;
			
		}

		catch(NullPointerException e1)
		
		{
					
					System.out.println("Null Pointer Exception catched and handle executed");
					//e.printStackTrace();	
				}
		
		catch(Exception e)
				
{
			
			System.out.println("Exception e has been catched and handle executed");
			//e.printStackTrace();	
		}

		
	
		finally{
			
			System.out.println("finally will always be executed");
	
		}
	
		
	}
		public static void main(String ...adsdas)
		{
	ExceptionHa A=new ExceptionHa();
	A.exec();
		}
	}

	
	