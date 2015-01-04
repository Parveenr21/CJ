package AccessSpecifier1;

public class SingletonCalling {

	public static void main(String ...ccc)

	{
		
		//new ClassicSingleton();  it will not allow
		ClassicSingleton stn=ClassicSingleton.getInstance(); //it will allow you to get the instance of that class like this..
		stn.function_PERFORM();
		
		
		
		Singleton stn1=Singleton.getInstance();
		stn1.funcPERFORM();
		
		Singleton stn2=Singleton.getInstance();
		stn2.funcPERFORM();	
		
		//same object is returned.. so everytime we are calling the function or want to call the functions of an object..it
		//is calling on the same object reference
	
		
		
		Singleton1 stn11=Singleton1.getInstance();
		stn11.funcPERFORM();
		
		Singleton1 stn22=Singleton1.getInstance();
		stn22.funcPERFORM();	
	
		
		
		
		Singleton2 stn111=Singleton2.getInstance();
		stn111.funcPERFORM();
		
		Singleton2 stn222=Singleton2.getInstance();
		stn222.funcPERFORM();	
		
		
	}
}
