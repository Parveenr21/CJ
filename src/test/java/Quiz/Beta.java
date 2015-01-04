package Quiz;

public class Beta extends Baap {  
	
	
	
	/*
	 * here the JVM loads the class first and before it executes the static block of current class..it checks for any EXTENDS
	 * or simply Inheritance.. If there is any extends keyword then it loads the parent class first and then child class loading completes
	 * which also includes runing static block of child.
	 * 
	 * 
	 * Secondly.. whenever a constructor runs then only before the constructor the init block get called so
	 * 
	 * as Child constructor has to run Parent constructor ..so Child constructor will firstly run Parent INIT block and then Parent constructor
	 * then Child init block and then child constructor.
	 */

	
	
	static{
		
		
		System.out.println("Beta Static block called");
	}
	
	
	{
		
		
		System.out.println("Beta init block called");
	}
	
	public Beta() {
		System.out.println("Beta constructor block called");
	}
	
	
	public static void main(String ...ccc)
	
	{
		
		
		new Beta();
		
		
	}
	
}
