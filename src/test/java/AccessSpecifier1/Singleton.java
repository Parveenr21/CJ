package AccessSpecifier1;

public class Singleton {

	static Singleton stn;	//by default it is null lowercase
	
	//This is the best approach for singleton framework
	
	
	//constructor private .. by keeping class public.. so that any class of any package can use this class..but only one object can be created,
	
	private Singleton(){
		
		System.out.println(getClass().getName());
		
	}
	
	
	static Singleton getInstance()
	{
		if(stn==null)
		{
			stn= new Singleton();
		
		}
		
		return stn;
	
	}
	
	
	void funcPERFORM(){
		
		System.out.println(stn);
		
	}
	
}
