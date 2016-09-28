package a5_Constructor;

public class CopyConst {

	
	int i;
	String s;
	
	
	
	
	public CopyConst(int j, String string) {
		i=j;
		s=string;
	}



/*
 * Copy constructor
 * 
 */
	public CopyConst(CopyConst c1) {
		
		i=c1.i;
		s=c1.s;
	}




	public static void main(String ...xxx)
	
	{
		
		CopyConst c1=new CopyConst(10,"JAVA");
		
		System.out.println(c1.i + c1.s);
		
		CopyConst c2 = new CopyConst(c1);
		
		System.out.println(c2.i + c2.s);
	}
	
}
