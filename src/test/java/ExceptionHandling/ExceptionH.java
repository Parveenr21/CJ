package ExceptionHandling;


class ExceptionH{
	
	
	void fun()
	{
		
		int i=10;
		int j=1;
	
		
	try{
			System.out.println("before Exception point");
			j=i/0;
			System.out.println("after Exception point");
	}
	

	/*There are three kinds of exceptions..
	1. Exception excluding Errors and RuntimeException -- called checked exception..known to compiler
			and compiler forces us to put a handler either using try catch or specifying throws in method
	2. RuntimeException
	3. Errors
	*/
	
		
	//so the BELOW code will not work in this case
	
/*		catch(IOException e) {
			System.out.println("Exception");


		
	}
		*/
		
	
	//The catch block capturing error is fine ,, but will not be executed as this is not thrown.. by 1/0
	
	
	catch(Error ee){
		
		System.out.println("Error");
		
	}
		
	catch(RuntimeException e){
		
		
		
		System.out.println("Exception");
	}
	
		    
		finally {
			
			System.out.println("Finally");
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String ...adsa)
	{
		ExceptionH e =new ExceptionH();
		e.fun();
		
	}
}


