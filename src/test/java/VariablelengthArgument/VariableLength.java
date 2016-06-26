package VariablelengthArgument;


class VariableLength{
	
	
	//Overloaded method fun_variablelength
	
	
	public static void fun_variablelength(String ...ccccc){
		
		
		System.out.println("ITS a variable length argument method");
		
		
	}
	
	
	
public static void fun_variablelength(String c){
		
		
		System.out.println("ITS String argument method");
		
		
	}
	
/*
 * array is internally used by JVM when creating varargs methods.
 * method("a", "b", "c"); 
method(new String[] {"a", "b", "c"});
 * 
 */
	
	
	
}