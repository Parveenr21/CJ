package a1_Variables;

class Casting{
	
	byte b1;
	byte b2;
	byte b3;
	
	short s1;
	short s2;
	short s3;
	
	int i1;
	int i2;
	int i3;
	
	long l1;
	long l2;
	long l3;
	long l4;
	
	boolean boo1;
	
	char c1;
	
	/*
	 * integer literals are int by default
	 * 
	 * decimal literals are double by default
	 * 
	 * 
	 */
	
	float f1;
	float f2;
	float f3;
	
	double d1;
	double d2;
	double d3;
	
	
	static int sta1=100;
	int nonsta1=10000;
	
	
	
	
	 static void fun(float a){
		
		System.out.println("inside float");
	}
		
	
	 static void fun(double a){
			
			System.out.println("inside double");
		}
	
	 
	 
	static void sta(){
		 
		 System.out.println("Static function with value of static variable " + sta1 );
		 
		 	 }
	 
 void nonsta(){
		 
		 System.out.println("NON Static function");
		 
		 	 }
	 
	 
	public static void main(String ...xxx)
	{
		
		
		// byte b1;  here this could also be decalred here.. then within function this local variable value will overwrite the class vaiable and to access the 
						//class variable b1 we need to use "this.b1"
		
		//byte b11=10000;  automatically the big literal went to default int as 10000 can not be stored to byte
		byte b22=22;
		byte b33=33;// here local variable need to be initialized before they can be used unlike class variable which have default value
					// local variable can remain well uninitialized without compilation error in the program if not used..but that is useless
		
		short s11=11;
		short s22=22;
		short s33=33;
		
		int i11=11;
		int i22=22;
		int i33=33;
		
		long l11=11;
		long l22=22;
		long l33=33;
		long l44=44;
		
		boolean boo11=true;
		
		char c11='c';   // 'c11' is not a constant as it is a string or we can say an array of three diff chars
		
		
		
		//float f11=11.1;  default decimal literal is of double type which can not get implicitly casted to float
		float f22=22.2f;
		float f33=33.3f;
		
		double d11=11.1;
		double d22=22.2;
		double d33=33.3;
		
		//fun(10.2); //by default it is double so can not be implictly casted.
	
		fun(10.2);
		
		fun((float)10.2);
	
	System.out.println("value of local varibale byte  " +  b22);
	//System.out.println("value of class varibale byte  " +  b1);    can not access the b1 as b1 is not static in nature and can not be acccessed with in the static function
		
	/*SEE this STATIC and NON- STATIC memeber is used for class variables only.. for the function variables we do not have this concept.. 
	because function variables are used only with in the functions
	  so we can not put static or other with a local variable of method.. local variable can only have "final" keyword.
	  while class level varible can also have final keyword.
	  
	*/
	
	sta1=10; //static variables being used in static function context
	
		sta();		//same class functions both static and non static can be called directly without using object or class name..
					//but obviously the non static one cannot be called with static
		
		
		//Casting.class.getClass();
		
		System.out.println("Casting.class.toString()"+ Casting.class.toString());
		
		
		
		try {
		
			Casting.class.newInstance().nonsta();			//directly calling non static method within static method by default object creation 
			
			System.out.println("Casting.class.newInstance()"+ Casting.class.newInstance());	
			
				} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Casting.class.isInterface()"+ Casting.class.isInterface());
		
		System.out.println("Casting.class.getSuperclass()"+ Casting.class.getSuperclass());
		
		System.out.println("Casting.class.getName()"+ Casting.class.getName());
		
		System.out.println("Casting.class.getClassLoader()"+ Casting.class.getClassLoader());
		
		
		System.out.println("Casting.class.getMethods()"+ Casting.class.getMethods());
		
		
		
		
		
		
		
		
		
	}
	
}