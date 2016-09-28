package Thiskeyword;

class this2{
	
	
	static int x=99;
	int y =99;
	static int sta1=100;
	int nonsta1=10000;
	
	
	
	
	
	
	static void sta(int x){
		 
				
		
		 System.out.println("Static function with value of local variable " + x );
		 
		 System.out.println("Static function with value of class static variable " + this2.x ); //here if x should be static only else can never be accesed inside static method.
		 
		 
		 	 }
	 
void nonsta(int y){
		 
		 System.out.println("NON Static function with local variable " + y);
		 System.out.println("NON Static function with class non static  variable " + this.y);
		 	 
		 System.out.println("NON function with value of class static variable " + this2.x ); //here if x should be static only else can never be accesed inside static method.


}
	 
this2(int a){
	
	 System.out.println("Constructor called with value passed   "   + a);
	 
	 x=10000;
	 y=20000;
	 System.out.println("value of class variable x and y  "+x+y);
}


this2(){
	this(10);
	 System.out.println("Default Constructor called ");
	 
	 
	 x=1000;
	 y=2000;
	 System.out.println("value of class variable x and y  "+x+y);


}
	
	public static void main(String ...xxx) throws Exception, IllegalAccessException{
		
		 System.out.println("Program control entered to the MAIN function");
		 
	
		 sta(55);
		 new this2().nonsta(55);
	
	}
	
	
	
	
	
	
}