package ExceptionHandling;
class NestedTry{
	
	
	public static void main(String ...xxxx){
		
		int a=0,b=0,c=0;
		
		try{
		  
			//throw new Exception();  //If i will uncomment this throw statement then compilation error because next try will never be executed.
		//and confirmed.. that try block must be immediately followed by catch block.
			c=a/b;
			
		try{
			throw new NullPointerException();	
		}
		
		catch(NullPointerException e){			
			System.out.println("NULL");			
		}
		
		}
		
		catch(Exception e){			
			System.out.println("Exception");			
		}

	}
	
	
}