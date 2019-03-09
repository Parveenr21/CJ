package a6_UnitTest1;


public class DevClass1 {

	int x=15;
	static int y =20;
	
	public static void foo1(){
		
		
		y=30;
		System.out.println("static method called");
		
		
		
	}
	
	public void foo2(){
		x=25;
		System.out.println("non static method called");
		
	}
	
}
