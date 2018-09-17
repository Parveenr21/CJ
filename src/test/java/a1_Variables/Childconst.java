package a1_Variables;
class Childconst extends Parentconst{
	
	int b;
	
	Childconst(){
		
		b=20;
		
	}
	
	public static void main(String ...a){
		
		Childconst c= new Childconst();

		//extends will get you non static variables in your clas. you can use them

		System.out.println(c.b);
		System.out.println(c.a);


	}
	
}