package a1_Variables;

class Static{
	
	int nonstat=10;
	static int stat=20;							// as soon as class is loaded the static variables are created. set to 20
	
	public static void stat(){
		
			System.out.println("STATIC funtion");
	
	
	}
	
public  void nonstat(){
		
		System.out.println("NON STATIC funtion");
nonstat1();	//here non static within non static can be called without object.nonstatic.. just for with in same class	
}
	


public  void nonstat1(){
	
	System.out.println("NON STATIC funtion 11111");
}


static{  							//static block is executed before the main method
	
	stat=30;
}



public static void main(String ...aaaa){
	
	Static obj=new Static();
	obj.nonstat();
	System.out.println(stat);
	System.out.println(Static.stat);//Outside this class.. it would be class.static.. for same class. static within static.. directly
	
	System.out.println(obj.nonstat);


}

	
	
}