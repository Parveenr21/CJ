package AccessSpecifier1;


//class can only be abstract, final, public.. and by default it is default
//Singleton pattern


//Classic singleton:--only 2 things:- private constructor and static method getInstance returning instance of SingletonClass

class ClassicSingleton {

	
private ClassicSingleton()

{
	
System.out.println(getClass());	
	
}


static ClassicSingleton getInstance(){		//static method.. will create the object of class
	
return new ClassicSingleton();	

//Here catch is . we are getting new object on each call of "getInstance()"

}


void function_PERFORM(){
	
	System.out.println("CLASSIC Singleton method called ");
}

}
