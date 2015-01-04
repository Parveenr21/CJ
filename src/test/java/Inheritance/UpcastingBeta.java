package Inheritance;

public class UpcastingBeta extends UpcastingBaap {

	
	int x=1111;
	
	void foo(){
		
		System.out.println("Beta foo");
		
	}
	
	
	
void zoo(){
		
		System.out.println("Beta zoo");
		
	}
	
	

public static void main(String ...cc)
{
	
	UpcastingBaap uBeta= new UpcastingBeta();
	
	uBeta.foo();
	//uBeta.zoo();  //error .. as zoo is not there in parent class
	uBeta.doo();  //here error should be there .. but no becase child got doo() as a result of inheritance
	
	
	System.out.println(uBeta.x); //it will give BAAP class DM value as DM do not get overridden.
	
	
	
}

	
}
