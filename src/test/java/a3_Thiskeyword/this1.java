package a3_Thiskeyword;

class this1{
	
	
	
	static int sta1=100;
	int nonsta1=10000;
	
	
	static{
		
		sta1=5;
		//nonsta1=50;  non static can not come within static block;
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
		 
		
			 System.out.println("Static function with value of static variable " + sta1 );
		 
		 	 }
	 
void nonsta(){
		 
		 System.out.println("NON Static function");
		 
		 	 }
	 
this1(int a){
	

	int nonsta1=555;
	System.out.println("Constructor called with value passed   "   + a);
	
	System.out.println("Constructor called with value of local nonsta1   "   + nonsta1);
	
	//nonstat1 , the class level variable got updated by running the init block... as any block ...i,.e static, init or constructor can update the class level variables.
	System.out.println("Constructor called with value of calss level nonsta1   "   + this.nonsta1);

	
	
}
	
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	
		 //new this1(); this will not work because as soon as we provide any constructor in a class its mandatory to use the 
		 		//			default contructor as well because then javac does not provide the default one.
		 
		 /***********so when ever u type a parameterized constructor then pass the default constructor as well with that ****/
		 
		 //Init block just get called before very first call to construtor ..IMPORTANT
		 //static block and static variables are set before class instance variables.. as class is loaded first.. and instance variables are set..once an object gets created or in progress
		 
		 /*
		  * 
		  * 
		  * so flow would be
		  * 
		  * STATIC block
		  * main method
		  * INIT method just before object creation.
		  * CONSTRUCTOR
		  * 
		  */
		 
	new this1(99);
	
	}
	
	
	
	
	
	
}