package AccessSpecifier1;


//class can only be abstract, final, public.. and by default it is default
//Singleton pattern

class ClassicSingleton {

	
private ClassicSingleton()

{
	
System.out.println(getClass());	
	
}


static ClassicSingleton getInstance(){		//static method.. will create the object of class
	
return new ClassicSingleton();	
	
}


void function_PERFORM(){
	
	System.out.println("CLASSIC Singleton method called ");
}

}
