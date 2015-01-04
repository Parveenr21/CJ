package Inheritance;

public class Father {

	static int a=1;
	int b=2;
	
	static{
		
		a=11111;
		System.out.println("Father Static block");
		
	}
	
	
	{
		
		
		b=2222222;
		System.out.println("Father init block");

		
		
	}
	
	
	Father(){
		
		System.out.println("Father constructor block");

	}
	
	
}
