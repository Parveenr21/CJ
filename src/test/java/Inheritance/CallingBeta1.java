package Inheritance;

public class CallingBeta1 {

	
	public static void main(String ...ccc)
	
	{
		
		Beta1 B=new Beta1();
		
		System.out.println(B.i1 );
		System.out.println(B.i2 );
	
		System.out.println(B.si1 );
		System.out.println(B.si2 );
		
		
		System.out.println(Beta1.si1);
		System.out.println(Beta1.si2);
	
		Beta1.statfoo();
		Beta1.statfoo_beta();
		
		
		B.foo();
		B.statfoo();
		
		B.foo_beta();
		B.statfoo_beta();
	
	
		
		new Beta1().baapmethod1();
	
	}
	
	
	
	
}
