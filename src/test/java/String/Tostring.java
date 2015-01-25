package String;
public class Tostring{
	
	
	public static void main(String ...xxxx){
		
		Tostring ts=new Tostring();
		System.out.println(ts);//By default printing object results in object.tostring
		System.out.println(ts.toString());
		
		//ts.toString(); //This represents String representation of objects.. returns String 
		
		System.out.println(new Exception());  //By default this to string method is overridden by throwable
	//as superclass of Exception and Error is Throwable..so when this throwable class toString();method
		//so when we print the object then this overridden to string method gets executed.
	
	
		try{
			throw new Exception();	
		}
		
		catch(Exception e){			
			System.out.println(e);			
		}
	
	
	}
	
	
}