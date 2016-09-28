package a5_Constructor;

public class Constrctor{
	
	int a=5;
	
public Constrctor() {

	//Check the below one is local variable inside constructor setting to 10, so
	//the value of class variable a will stil be 5.
	int a=10;
}
	
	public static void main (String ...xxx)
	{
		
		Constrctor c= new Constrctor();
		System.out.println(c.a);
		
		
	}
	
	
	
}