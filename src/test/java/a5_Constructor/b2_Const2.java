package Constructor;

public class Const2 extends BaapConstructor {

	int i;
	
	String s1;
	
	
	{
	
		//common tasks by all constructor shoold be written within the init block as this will be executed once
		//before every construcor calling
		
		i=10;
		s1="TEMP";
		
		System.out.println(i);
		System.out.println(s1);
	}
	
	
	/*
	 * 
	 * Default constructor is implicit if no constructor ..ele we need to provide default also when parameterize is there
	 */
	
	Const2(){
		
		i=1000;

		System.out.println(i);
		System.out.println(s1);
		
	}
	
	
	/*
	 * 
	 * paramterized constructor if wewant to initiazlize non static datamember dynamically
	 */
	
Const2(int a){
		super(a);
	
	
		i=a;

		System.out.println(i);
		System.out.println(s1);
	}

//we can have a method with the same name as class name.. but it should have a return type else it would be considered as constructor

Const2 (int a, String s)
{
	i=a;
	s1=s;

	System.out.println(i);
	System.out.println(s1);
}




public static void main(String ...xxx)
{

	/*
	 * 
	 * 
	 * by default...child non parameterizd or parameterized constructor will call super non parameterized constructor 
	 * becauseo of implicity super(); which call non parameterized constrctor irrespective of default or non default
	 * 
	 * if we want to call parameterized constructor..of super class. then we need to pass super(arg)
	 * 
	 * super with arguments.
	 * 
	 * RULE:-- child class should be able to run any of the constructor of Parent class 
	 * 
	 */
	
	
new Const2();
new Const2(10);
new Const2(10,"JAVA");	
	
 }
}

