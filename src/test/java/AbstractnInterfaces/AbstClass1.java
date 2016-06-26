package AbstractnInterfaces;

abstract class AbstClass1{
	

	static int a=10;
	int b=20;
	
	
	abstract void fun1();
	
	/*
	In Java we can not have abstaract static function as static means attached to class 
	while abstract method means .. body will be  
	 given body by child.. so as static is called directly by class name.. so its of no use.
	 
	 also abstract is with object.. static is with class
	 */
	
	//abstract static void fun2();
	
	
	
	//abstract class can have abstract methods or abstract and non abstract or EVEN not at all any abstract methods.
	
	
	void fun3(){
		
		
		System.out.println("Normal body function of abstract class");
		
	}
	
	
	
	
	
}