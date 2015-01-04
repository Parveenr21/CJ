package Quiz;
class Base{  
	
	void a(){
		
		System.out.println("a");
	}
}
class Sub extends Base {
	void b(){
	
	System.out.println("b");
}
	} 
class Sub2 extends Base {
	
void c(){
		
		System.out.println("c");
	}
	
} 
public class Casting { 
	public static void main(String argv[])
	{ 
		
		Base b=new Base(); 
		Base b1 = new Sub();
		Sub s1= (Sub)b1;	//this works fine both while compiling and running
		
		Sub s=(Sub) b;  //this gives compilation error.
	//here beacasue for reference variable b the object is of base class and 
	
		
	}
	
}
