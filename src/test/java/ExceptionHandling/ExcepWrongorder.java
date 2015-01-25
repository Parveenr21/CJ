package ExceptionHandling;

import String.Tostring;

class ExcepWrongorder{
	
	
	public static void main(String ...xxxx){
		
		Tostring ts=new Tostring();
		System.out.println(ts);//By default printing object results in object.tostring
		System.out.println(ts.toString());
		
		try{
		throw new NullPointerException();   //throwing new object of a exception class  .. use throw...
		}

							//throw throw throw

		
		
		
		catch(NullPointerException e){			//catching object using catch block which is a kind of function..a here parameter is Eception class
			System.out.println("NULL");				//but only Exception's claased can be passed as arguments.
		}

		
		catch(Exception e){
			System.out.println("EXCEPTION");
				}
		//Here if we change the order the Catch block like .. the very first catch as Exception then rest of the catch will never be execued
		//THIS gives COMPILE time error.
		
	}
	
	
}