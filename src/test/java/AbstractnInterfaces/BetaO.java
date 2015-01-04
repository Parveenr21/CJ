package AbstractnInterfaces;

public class BetaO extends BaapO {

	static int i=1000;
	
	int x=5555;
	
	public static void foo1(){
		
		System.out.println("BetaO static method called");
	System.out.println(i);
	}

	
public void foo2(){
		
		System.out.println(x);
	}
	
	
public static void main(String ...ccc)
{
	
	BetaO.foo1(); 
	
		//This is calling the child class methods and DM..but if we commit the child method..then parent method coming to child will be called.
	
	
	BaapO bp=new BetaO();
	System.out.println(bp.x);
	System.out.println(bp.i);


}
}
