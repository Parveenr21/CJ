package finalKeyword;




/*
 * 
 * In JAVA final keyword can be applied before variable, class and method
 * 
 * final variables are just like constant which value can not be changed be it be local variables, class variables or instance variables
 */




//A class can only be Public/Abstract/final

class final_java{				// final class can not be extended.. so that we can not enrich the functionality of a class thereforth
	
	final int nonsta;
	final static int stat;  
	
	/*
	 * by default class variables and instance variables have a value.. but if make these as final then we need to explicitly pass a value
	 * to these as otherewise these are constant and we can not use those.. so either give value while decalaring or use concept of
	 * blank final variables.
	 * 
	 * 
	 */
	
	
	final public void fun(){
		
		// nonsta=100;  // this is illegal as final variables can not be reassigned values
		
		System.out.println("non static method");
	}
	

	final public static void fun_sta(){
		
		
		// stat=10000;  // this is illegal as final variables can not be reassigned values
		System.out.println(" static method");
		
	}
	
	void foo(int y){
		
		final int x=y;
		
		//x=100; this will not be allowed
		
		System.out.println(x);
		
	}
	
	
	
	/*BLANK FINAL variable is a special case when we can initialize the static and non static DM
	later on from the default value.. for static .. its static block and non static its constructor
	*
	*but if we initialize static and non static while decalraing then we can not set the value in the static block and
	*by constructor..
	*
	*/
	static{
		stat=1000;
		
	}
	
	
	final_java(){
		
		nonsta=9999999;
		
		
	}


	
	public static void main(String ...xxx)
	{
		
		
	//the below thing will work as every time we call foo method.. new variable get life 	
		new final_java().foo(111);
		new final_java().foo(115);
		final_java obj=new final_java();
		
	obj.foo(555);
	obj.foo(666);
	
	System.out.println(obj.nonsta);
	System.out.println(obj.stat);
	
	}
	
	
	
	
	
	
}