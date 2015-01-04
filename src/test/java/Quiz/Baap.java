package Quiz;

public class Baap {

	
	
	static{
		
		System.out.println("Baap Static block called");
		
	}
	
	
	{
		
		System.out.println("Baap init block called");
		
	}
	
	
	
	public Baap() {
		System.out.println("Baap constructor called");
	}
	
}
