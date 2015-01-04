package Quiz;

import java.io.IOException;

class Doublereturn{
	
	
	static int foo()
	{
		
		
		int i=0;
		
		try{
			
			i=10;
	return i;
	
		}
		
		finally{
			
			i=20;
			
			
			
			
			//also try replacing i=20 statement by return 20; 
		}
		
		
	}
	
	
	
	
	public static void main(String ...cccc)
	
	
	{
		
		System.out.println("value of return " + foo());
		
		
		
		
		
		
	}
	
	
}