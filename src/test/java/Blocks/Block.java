package Blocks;

class Block{
	
	
	
	static int sta1=100;
	int nonsta1=10000;
	
	
	static{
		
		sta1=5;
		//nonsta1=50;  //non static can not come within static block;
		sta();
		//nonsta();
	}
	
	
	{
		
		sta1=5;
		nonsta1=50;
		sta();
		nonsta();
	}
	
	
	
	static void sta(){
		 
		 System.out.println("Static function with value of static variable "  );
		 
		 	 }
	 
void nonsta(){
		 
		 System.out.println("NON Static function");
		 
		 	 }
	 
Block(){
	
	 System.out.println("Constructor called");
	 
}
	
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	//	 new Block();  //when the object will be created then only the init block will be called.
		 				//init block is called even before the contructor is called.
		
		// Block.class.newInstance(); this also let the program to create new object
		 
		 
		 
	}
}