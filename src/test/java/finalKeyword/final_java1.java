package finalKeyword;





//final class final_java1 extends final_java{

class final_java1 extends final_java{
	
	//Once we extends a class with final variables they become normal.. only with variables ....NO   NO   NO
	
	//actually variables never gets overridden...its data hiding..
	//here we are creating varibales with same name.. we can also acess the final varibales with same name
	//which will actually be final..e.g. ((base)this.x)
	
int nonsta=5;	 // reinitialing variable which are final in final_java class...NO.. variables never get overridden
static int stat=55;  // these are variables of this class only


/*variables from Bapp class are reached to child class but beacuse of the existing DM of child class with same name..
we can not access those with name.. we have to use  "((Baap)this).nonsta" and "Baap.stat" to access the variables

and these would be final only.*/
	
	
	
	
	
	// the below methods...IT will ask to remove final from final_java class for overriding to happen
//beacause overriding in the case of methods
//FINAL methods can not be overridden



/* public void fun(){ 
		
		nonsta=100;  
		
		System.out.println("non static method");
	}
	*/

	
	//IT will ask to remove final from final_java class for overriding to happen
	


//This static method is also get overrridden but probhibited here because of final

	/*public static void fun_sta(){
		
		
		 stat=10000;  
		System.out.println(" static method");
		
	}
	
	*/



	public void foo(){
		
		
	
	System.out.println("super class var " + ((final_java)this).nonsta);
	
	System.out.println("current class var " + nonsta);
	
	}




	
	public static void main(String ...xxx){
		
		
	
	
		System.out.println("non static " + new final_java1().nonsta);
		System.out.println(" static " + new final_java1().stat);
		
		new final_java1().fun();
		
		
		
		
		new final_java1().fun_sta();
		
	
new final_java1().foo();
	}
	
	
	
	
}