package AccessSpecifier1;

public class Singleton2 {

	final static Singleton2 stn ; //blank final variable	so has to be intialied by static block only
	
	static{
		
		stn = new Singleton2();
		
	}
	
	
	
	private Singleton2(){
		
		System.out.println(getClass().getName());
		
	}
	
	
	static Singleton2 getInstance()
	{
			
		return stn;
	
	}
	
	
	void funcPERFORM(){
		
		System.out.println(stn);
		
	}
	
}
