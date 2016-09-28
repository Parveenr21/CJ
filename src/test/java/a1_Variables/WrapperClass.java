package a1_Variables;


public class WrapperClass {

	static int x = 10;
	static byte b = 10;
	static char charc='c';
	static double d = 10.5d;
	static String s = "test";

	public static void main(String... ccc) {

		// first any datatype to string
		// second any string to any datatype

		Character C = 'c';
		Integer I = 10;
		Double D= new Double(d);
		
		
		
		/*
		 * 
		 * Implicit casting bewtween int, char, any type of variable and Wrapper class
		 * 
		 */
		
		//charc=C;
		//C=charc;
		
		
		
		
		
		String sc = Character.toString(C); // for characte to string.. we pass
											// this Character class

		
		
		String s1 = Integer.toString(x);

		s1=new Integer(x).toString();	//toString method get applied to any object .. sometimes we even need to overroode toString method
		
		
		int x = Integer.parseInt(s1);//resulting in String to int conversion.. but better one is valueOf
				x=Integer.valueOf(s1);	//Value of is better.to use..it returns OBJECT.. while parseInt returns int 
				/*
				 * 
				 * Actually, valueOf uses parseInt internally. 
				 * The difference is parseInt returns an int primitive while valueOf returns an Integer object
				 * and implicit casting happens when valueof can be put in int or anyother data type
				 * 
				 * 
				 */
	
				
				String s2 = Byte.toString(b);
				byte b = Byte.parseByte(s2);
					b=Byte.valueOf(s2);

					
		
		String s3 = D.toString();
		double d = Double.parseDouble(s3);
		d=Double.valueOf(s3);
		
		
		
		/*
		 * 
		 * 
		 * So we leant to use 
		 * 
		 * Integer.valueof(int) or Integer.valueof(String)
		 * 
		 *  Byte.valueof(byte) or  Byte.valueof(String.)
		 *  
		 *   
		 *   
		 *   
		 *   To make any other object String..
		 *   we do
		 *   
		 *   
		 *   object.toString() 		//This returns String but null pointer in case object is null
		 *   String.valueof(Object)	//This returns null string in case object in null
		 * 
		 */
		
		
		
		Object obj1=new Object();
		
		
		
		System.out.println(String.valueOf(obj1));
		System.out.println(obj1.toString());
		
		obj1=null;
		
		
		System.out.println(String.valueOf(obj1));
	//			System.out.println(obj1.toString());  uncommenting will return null
		
		
		
		System.out.println(s1);
		System.out.println(x);
		System.out.println(s2);
		System.out.println(b);
		System.out.println(s3);
		System.out.println(d);

		// If we want to apply methods on these chars , ints.. then we need to
		// convert these to
		// wrapper classes and then we can call the apis and then convert back
		// to primitive data type

		/*
		 * 
		 * e.g. sample Character class methods isLetter() Determines whether the
		 * specified char value is a letter. 2 isDigit() Determines whether the
		 * specified char value is a digit. 3 isWhitespace() Determines whether
		 * the specified char value is white space. 4 isUpperCase() Determines
		 * whether the specified char value is uppercase. 5 isLowerCase()
		 * Determines whether the specified char value is lowercase. 6
		 * toUpperCase() Returns the uppercase form of the specified char value.
		 * 7 toLowerCase() Returns the lowercase form of the specified char
		 * value. 8 toString() Returns a String object representing the
		 * specified character valuethat is, a one-character string.
		 */

	}
}
