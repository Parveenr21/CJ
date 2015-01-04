package Quiz;

public class Return2 {

	//return 5
	
	static int i=10;
	
	
	
	public static void main(String ...ccc)
	{
		
		
	
	System.out.println(	temp1());
		
		
	}
	
	
	static int temp1(){
		
		
		
		try{
		return i=5;
	}
		
		finally{
			
		 i=10; //the returned value is stored at separate place.. so when the value is returned.. then finally updates
		 		//the local value of i.. so at the time of function calling this value from that diff space is retrieved.
			
		}
	
	}
	
	
	
	
}
