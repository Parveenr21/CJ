package ExceptionHandling;


class ExceptionH3{
	
	
	
	
	static int multireturn(){
		
		
		
		//return 1;  un commenting this will give error because then below code will be unreachable	
		
		//the below code is still executing after getting return because of having a finally block
		//so second timed return will be used by this.
		
		//System.exit(1); this is not allowed in try as compiler knows this is abnormal termination
	
		
		//System.exit(0);  non zero is abnormal termination.. while 0 is normal
		
		// System.exit(int) internally calls Runtime.getRuntime.exit(int)
		
		try{
			
			
			return 10;	
				
		}
		
			
		finally{
			return 100;		
			
		}
		
		
	}
	
	
	public static void main(String ...ccc)
	{
		
	int var=multireturn();

	
	System.out.println("value of return variable   "  + var);
	
	
	}
	
	
}