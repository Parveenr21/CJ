package a5_Constructor;

public class Const1 {

	
	static int x=10;
	int y=99;			//how come this non static variable getting memory before init block.
	
	//This means non staic members also get memory before calling constructor but obviuosly in the heap.
	
	
	/*
	 * 
	 * More than one STATIC block
	 * static 
	 * 	{
	 * 
	 * 	}
	 * 
	 * 	{
	 * 
	 * 	}
	 * 
	 * 
	 * and more than one INIT block can happen
	 * 
	 * 	{
	 * 
	 * 	}
	 * 
	 *	 {
	 * 
	 * 	}
	 * 
	 */
	
	static{
		System.out.println("'first static block called");
		System.out.println(x);
// 		System.out.println(y); can not access without object
		x=100;
		
	}
	
	
	static{
		

		System.out.println("'second static block called");
		System.out.println(x);
		x=100000;
		
	}
	

	//init block does not have name
	
	{
		
		
		
		System.out.println("First init block called");
				System.out.println(x);
				System.out.println(y);
				x=1;		
					y=999;
					System.out.println(x);
	}
	
	//init block does not have name
	{
x=2;
		System.out.println("Second init block called");
				System.out.println(x);
				System.out.println(y);
	x=3;			
		y=9999;
	}
	
	
	
	/*
	 * init block is always executed before constructor.. but it is executed only when constructor is called.. if no constructor is called then no init block will also be called..
	 * 
	 * static block is executed at class loading.. so always executed..from Java 1.7 onwards main method is required ..and checked before static block execution.
	 * 
	 *  There can be n number of static and init block and they run in the order they are specified.
	 * 
	 * 
	 * init block and constrcutor can update value of static block any number of time while static block needs object to do it.
	 * 
	 * 
	 */
	
	
	
	//Constructor
	Const1(){
		
		x=4;
		y=2;
		
		System.out.println("Default constructor called");
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	public static void main(String ...xxxx)
	{
		
		System.out.println("main called");
		System.out.println(x);
		//System.out.println(y);
		new Const1();
		
	}



}
