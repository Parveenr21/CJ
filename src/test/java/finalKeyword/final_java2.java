package finalKeyword;


class final_java2 extends final_java1{
	
	
	/*
	 * 
	 * final class can never by extended.. so only object can be created
	 * 
	 * final variables can never be reinitialized
	 * 
	 * final methods can never by overridden although.. thy gets copied to child class
	 * 
	 * final DM cause no issue to child class as theu do not get overridden.we can always access those using ((Base)this).x
	 * 
	 * 
	 * By default all the non final instance methods are there in every class
	 */
	
	
	
	
	//IT will ask to remove final from final_java1 class for Inheritance or extends to work
	
	
	
	
	
/* public void fun(){ 
		
		nonsta=100;  
		
		System.out.println("non static method");
	}
	*/

	
	//IT will ask to remove final from final_java class for overriding to happen
	
/*	public static void fun_sta(){
		
		
		 stat=10000;  
		System.out.println(" static method");
		
	}
*/	
	
	public static void main(String ...xxx){
		
		
	
		
		System.out.println("non static " + new final_java1().nonsta);
		System.out.println(" static " + new final_java1().stat);
		
		new final_java1().fun();
		
		
		
		
		new final_java1().fun_sta();
		
	}
	
	
	
	
}