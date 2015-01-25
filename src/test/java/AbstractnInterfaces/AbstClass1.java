package AbstractnInterfaces;

abstract class AbstClass1{
	

	static int a=10;
	int b=20;
	
	
	abstract void fun1();
	
	/*
	In Java we can not have abstaract static function as static means attached to class while abstract means .. this will 
	be given body by child.. so as static is called directly by class name.. so its of no use.*/
	
	//abstract static void fun2();
	
	
	
	
	void fun3(){
		
		
		System.out.println("Normal body function of abstract class");
		
	}
	
	
	
	
	
}