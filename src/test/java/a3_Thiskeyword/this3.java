package a3_Thiskeyword;

class this3{
	
	
	
	static int sta1=100;
	int nonsta1=10000;
	
	
	
	
	static void sta(int sta1){
		 
		
		
		
			 System.out.println("Static function with value of local variable " + sta1 );
			 System.out.println("Static function with value of static clas variable " + this3.sta1 ); //class level variable
			// System.out.println("Static function with value of static clas variable " + this.nonsta1 ); //this can not be in static method
			 
		 	 }
	 


	
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	
		
		 sta(10);
	
	
	}
	
	
	
	
	
	
}