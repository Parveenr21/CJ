package Variables;
class Childconst extends Parentconst{
	
	int b;
	
	Childconst(){
		
		b=20;
		
	}
	
	public static void main(String ...a){
		
		Childconst c= new Childconst();
		System.out.println(c.b);
		System.out.println(a);
		
	}
	
}