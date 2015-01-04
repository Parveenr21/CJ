package Inheritance;

public class Beta2 extends Baap2 {

	
	
	
	int i=1000;
	static int j=1000;
	
	void foo(){
		
		System.out.println("BETA2 method");
		
	}
	
	
	
	public static void main(String ...ccc)
	{
		
		
		Beta2 B = new Beta2();
		
		B.workingmethod();
		
		
		
		
		
		
	}
	
	
	
	
	
	void workingmethod(){
		
		System.out.println(i);
		System.out.println(super.i);
		
		//The below way we can access non static DM of any class in INHERITANCE
		
		System.out.println(((Dada2)this).i);
		
		
		//FOR static DM
		
		System.out.println(j);
		System.out.println(super.j);
		System.out.println(((Dada2)this).j);
		
		
		//these 2 ways are wrong to call these static methods.. as static DM should be called by class name
		
		//so the correct appraoch is 
		
		

		System.out.println(j);
		System.out.println(Baap2.j);
		System.out.println(Dada2.j);
		
		
		
		//Similary for static methods we have FUNCTION hiding as they can always be accessed by class name.
		
		//------------
		
		this.foo();
		super.foo();
		((Baap2)this).foo(); //This will still give BETA2 reference not even one level up
		
		((Dada2)this).foo(); //This will still give BETA2 reference not even one level up
		
		/*
		 * 
		 * So the essence it.. the non static methods are only accessible till one level
		 * 
		 * so only use super keyword e.g. 	super.foo();
		 * 
		 * so we can only access methods which are overridden till one level up.. rest of overridden methods will not be called 
		 * 
		 * from child class
		 * 
		 * while for non static DM as well as static DM.. we can always call that is why we called DATA HIDING in INHERTINCE while for non static methods its 
		 * overriding
		 * 
		 * this DATA HIDIng is for both non static and static DM.. but to acees static DM. its same either beacause its getting called by class name
		 * 
		 */
		
		
		
		/*
		 * 
		 * from jdk 1.4 onwards we have one more condition of overriding
		 * 
		 * function returning parent reference  in parent class and function returning referene of child clas in child class
		 * is also a condition where overriding is achieved. 
		 */
		
		
		
		/*
		 * OVERRIDING with ACCESS MODIFIERS
		 * 
		 * 
		 * overriding happends when non static DM in child class are stronger
		 * 
		 * the access modifiers in increasing strengths are
		 * 
		 * Private, DEFAULT, PROTECTED, PUBLIC
		 * 
		 * so the valid combination would be
		 * 
		 *  
		 *  
		 *  Parent-Default/Protected
		 *  Child -- Public
		 *  
		 *  Parent-Default
		 *	Child -- Protected
		 * 
		 */
		
		
		/*
		 * OVERRIDING with ACCESS SPECIFIERS
		 * 
		 * static methods .. no overriding ..its simple method hiding
		 * so 
		 * 
		 * OVERRIDING
		 * 
		 * in PARENT and CHILD class Static- Non static combination  or vice versa (X)  as compilation error will be thrown
		 * PARENT and CHILD class Static- static combination  (X) 
		 * PARENT and CHILD class non Static- non static combination  (YES)
		 */
		
		
	}
	
}
