package Inheritance;

public class Dada2 {

	//we are not thinking about non static as they will always be accessed by class name
	//either by parent class or child . the efficiency will be same
	
	
	int i=10;
	
	static int j=10;
	
	void foo(){
		
		System.out.println("DADA2 method");
		
	}
	
	
	static void doo()
	{
		
		System.out.println("static dada2 method");
	}
	
}
