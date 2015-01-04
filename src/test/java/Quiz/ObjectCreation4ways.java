package Quiz;

public class ObjectCreation4ways implements Cloneable {

	
	
	/*
	 * 
	 * to create an object using clone of anothe object we need to implement Cloneable interface
	 * 
	 */
	
	
	static int x=10;
	
	
	public static void main(String ...cccc) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, ClassNotFoundException
	{
		
		
		
		ObjectCreation4ways ob1= new ObjectCreation4ways();
		ObjectCreation4ways ob2 = ObjectCreation4ways.class.newInstance();
		
		
		//third way to clone an existing object
		
		ObjectCreation4ways ob3 = (ObjectCreation4ways) ob1.clone();
		
	
		Class ob4=Class.forName("Quiz.ObjectCreation4ways");
		
		ObjectCreation4ways ob5=(ObjectCreation4ways)ob4.newInstance();
		
		ob5.x=11;
		
		System.out.println(ob5.x);
		
		
		
		
		System.out.println(ob4.getSuperclass());
		
		
		ob1.x=1;
		ob2.x=2;
		
		System.out.println(ob1.x);
		System.out.println(ob2.x);
		System.out.println(ob3.x);
		
	}
	
}
