package Inheritance;

public class Son extends Father {

	static int a=11;
	int b=22;
	
	static{
		
		System.out.println("Son Static block");
		
	}
	
	
	{
		
		System.out.println("Son init block");

		
		
	}
	
	
	Son(){
		
		System.out.println("Son constructor block");

	}
	
	
}
