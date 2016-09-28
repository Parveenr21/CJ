package a5_Constructor;

public class b2_Const2 extends b1_BaapConstructor{

	int i;
	
	String s1;
	
	
	{
	
		//common tasks by all constructor shoold be written within the init block as this will be executed once
		//before every construcor calling
		
		/*
		 * 
		 * INIT block will be called multiple times if we gonna call multiple object creation or different kinds of construcor
		 * 
		 * INIT block is called just before any constructor call afte writing new operator .IMPORTANTTTT !!!!
		 * 
		 */
		
		i=10;
		s1="TEMP";
		
		System.out.println(i);
		System.out.println(s1);
	}
	
	
	/*
	 * 
	 * Default constructor is implicit if no constructor ..ele we need to provide default also when parameterize is there
	 * there must be atleast one constructor.. either compiler wilprovide or you provide.
	 * 
	 */
	
	b2_Const2(){
		
		i=1000;

		System.out.println(i);
		System.out.println(s1);
		
	}
	
	
	/*
	 * 
	 * paramterized constructor if wewant to initiazlize non static datamember dynamically
	 */
	
b2_Const2(int a){
		super(a);			//Calling super class constructor... to h
	
	
		i=a;

		System.out.println(i);
		System.out.println(s1);
	}

//we can have a method with the same name as class name.. but it should have a return type else it would be considered as constructor

b2_Const2 (int a, String s)
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
	 * IMPPP:--so if the PARENT class construtor is private then we wontbe able to extend.. 
	 * as child constructor would not be able to call it.
	 * 
	 * HERE
	 * 
	 * as type 
	 * 
	 * new class() 		//here firstly the call will go to constructor and then it will call default super or if we have metioned super(parameterized)
	 * AFTER parent class constructor.. it will call INIT block and resume constructor call execution.
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
new b2_Const2();
new b2_Const2(10);
new b2_Const2(10,"JAVA");	
	
 }
}

