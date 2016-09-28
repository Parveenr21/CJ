package a5_Constructor;

public class Const_chaining {

	
	public Const_chaining() {
		
		this("WOO");
		System.out.println("DEFAULT parameterized constructor called");
	}

	
	public Const_chaining(int i) {
		
		System.out.println("INT parameterized constructor called");
		
	}

	public Const_chaining(String string) {
		this(100);
		System.out.println("STRING parameterized constructor called");
	}

	
	public static void main(String ...xx)
	{
		
		
		
		new Const_chaining();
		new Const_chaining(10);
	  new Const_chaining("JAVA");
	
	
	}
	
}


