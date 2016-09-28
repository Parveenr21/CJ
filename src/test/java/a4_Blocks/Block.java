package a4_Blocks;

import java.lang.reflect.Constructor;

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


Block(int a){

System.out.println("Param Constructor called with value" + a);

}
	
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	 new Block();  //when the object will be created then only the init block will be called.
	 System.out.println("$$$$$$$");
	 new Block(10);
	 System.out.println("$$$$$$$");//init block is called even before the contructor is called.
		
		 Block.class.newInstance(); //this also let the program to create new object
		 //Block.class.newInstance(10); //only default argument constuctor can be called like this or do
		 
		 //packagename.class.newInstance
		 
		 /*
		  * use Class.forName() to get a Class object of the desired class.
		  * 
		  * use getConstructor() to find the desired Constructor object.
		  * 
		  * 
		  * call newInstance() on that object to get your new instance.
		  * 
		  * 
		  * 
		  * 
		  */
		 System.out.println("$$$$$$$");
		 Class<?> c = Class.forName("Blocks.Block");
		 Constructor<?> cons = c.getConstructor(String.class);
		 Object object = cons.newInstance(20);
		 
		 
		// return	 Class.forName("Blocks.Block").getConstructor(String.class).newInstance(30);


		 
	}
}