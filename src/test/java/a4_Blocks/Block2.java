package Blocks;

class Block2{
	
	/*Any thing can be done in the static block which we can do in the main method*/
	
	static int sta1=100;
	int nonsta1=10000;
	
	
	static{
		
		sta1=5;
		//nonsta1=50;  non static can not come within static block;
		sta();  //directly calling static function of the same class using static block
		new Block().nonsta();//We even called another class non static methods.. using objects in static block.. which just made main() useless
		//nonsta();
	}
	
	
static{
		
		sta1=50;
		sta();
	}
	


static{
	
	sta1=500;
	sta();
}


	
	{
		
		sta1=5;
		nonsta1=5;
		sta();
		nonsta();
	}
	
	
{
		
		sta1=50;
		nonsta1=50;
		sta();
		nonsta();
	}
	

{
	
	sta1=500;
	nonsta1=500;
	sta();
	nonsta();
}

	
	
	static void sta(){
		 
		 System.out.println("Static function with value of static variable " + sta1 );
		 
		 	 }
	 
void nonsta(){
		 
		 System.out.println("NON Static function  " + nonsta1);
		 
		 	 }
	 
Block2(){
	
	 System.out.println("Constructor called");
	 
}
	
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	new Block2();	 
		 
		 
	}
}