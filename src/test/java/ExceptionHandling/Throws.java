package ExceptionHandling;

import java.io.IOException;

class Throws{
	
	
	public static void main(String ...xxxx){
		
		
		fun();
		//fun1();   try uncommenting this  
		
		
		//If a function is having some statements which can throw an Exception and the method can not handle this using try catch
		//then function specify exception using throws keyword.. then 
		//Two options.. then handler is required at calling method.. even if it is main method then 
		//throws gets added to main method and program gets compiled but gives exception... else use try catch statement.
	}
	
	
	static void fun(){
		
		try{
			throw new NullPointerException("Hi");   
			}
	catch(Exception e){
		
		System.out.println(e);

	}
		
	}
	
static void fun1() throws NullPointerException,IOException,Exception{				//throws exception list i,.e. many exception separated by comma
		
		
			throw new NullPointerException("Hi");   
	
	
		
	}
	
	
}