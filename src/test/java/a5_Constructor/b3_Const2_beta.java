package a5_Constructor;

public class b3_Const2_beta extends b1_BaapConstructor {

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
	 * not necessarily.. it depends.. if we create an object using default ..then default will not be provided implicitly by compiler
	 * so we need to provide default as well.
	 *
	 *
	 */

	b3_Const2_beta(){

		i=1000;

		System.out.println(i);
		System.out.println(s1);

	}


	/*
	 *
	 * paramterized constructor if wewant to initiazlize non static datamember dynamically
	 */

b3_Const2_beta(int a){
		//super(a);

	//super is implicit which calls parent class constructor as well as used to access parent class members
	//this is also implicit which calls current class constructor and used to access current class memebers.
	//both super and this can not be there in a constructor.
		i=a;

		System.out.println(i);
		System.out.println(s1);
	}

//we can have a method with the same name as class name.. but it should have a return type else it would be considered as constructor

b3_Const2_beta (int a, String s)
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
	 * as constructor can not be called explicitly .. so as per OOPS
	 *
	 * Whenever any of the  child constructor is run ..it has to call any of the constructor of its immediate parent class
	 *
	 * means if child has 6 type of construcotr all should be able to run atleast one super constructor
	 *
	 *  by default super() is added to first line of constructor.. to call non parameterized constructor of super class
	 *  irrespective of it be default or not.
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


new b3_Const2_beta();
new b3_Const2_beta(10);
new b3_Const2_beta(10,"JAVA");

}
}

