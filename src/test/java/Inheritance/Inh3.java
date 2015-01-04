package Inheritance;

public class Inh3 extends Inh2 {


public Inh3() {
	
	
	 /*
	  * default super() which is non parameterized is called implicitly always
	  */
	 super(10);
}


public Inh3(int i) {
		
	/*
	  * default super() which is non parameterized is called implicitly always
	  * 
	  * so we use super(10) ..i,e. parameterized super to call super class parameterzed constrcutor
	  */
	
	}

public static void main(String ...cc)
{
	System.out.println(new Inh3().i2);
	System.out.println(new Inh3(10).i2);
}

}

