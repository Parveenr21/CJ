package Inheritance;

public class Baap2 extends Dada2{

	
	
	int i=100;
	static int j=100;
	
	void foo(){
		
		System.out.println("BAAP2 method");
		
	}
	
	
	static void doo()  //removing static will give compilation erro
	{
		
		System.out.println("static baap2 method");
	}
	
	
	
}
