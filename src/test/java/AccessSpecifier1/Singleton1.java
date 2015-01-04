package AccessSpecifier1;

public class Singleton1 {

	final static Singleton1 stn = new Singleton1();	
	
	
	
	private Singleton1(){
		
		System.out.println(getClass().getName());
		
	}
	
	
	static Singleton1 getInstance()
	{
			
		return stn;
	
	}
	
	
	void funcPERFORM(){
		
		System.out.println(stn);
		
	}
	
}
