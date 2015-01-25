

package ExceptionHandling;


class CustomException1 extends Throwable{			//It should extend the throwable..as only then other methods of throwable wil come to this class
	
	
	public String toString(){
		
		return "wooooooo";
	}
	
	public static void main(String ...xxxx){
		
		
		try{
		throw new NullPointerException("Hi");   
		}
catch(Exception e){
	
	System.out.println(e);

	System.out.println(e.toString()); //default to string method
	
	System.out.println(new CustomException1().toString());// this custom methodof toString.. and this object of this class

//The use of custom exception when you want to override the method of exception or Throwbale classe and use these mthods

	
	
	
}
	}
	
	
}



/*The version of toString( ) defined by Throwable
(and inherited by Exception) first displays the name of the exception followed by a colon, which
is then followed by your description. By overriding toString( ), you can prevent the exception
name and colon from being displayed. This makes for a cleaner output, which is desirable in
some cases.
*/