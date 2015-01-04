package Bizarre;


public class WrapperClass {

	static int x = 10;
	static byte b = 10;
	static double d = 10.5d;
	static String s = "test";

	public static void main(String... ccc) {

		// first any datatype to string
		// second any string to any datatype

		Character C = 'c';
		Integer I = 10;
		Double D = 10.9d;

		String sc = Character.toString(C); // for characte to string.. we pass
											// this Character class

		String s1 = Integer.toString(x);

		int x = Integer.parseInt(s1);

		String s2 = Byte.toString(b);
		byte b = Byte.parseByte(s2);

		String s3 = Double.toString(d);
		double d = Double.parseDouble(s3);

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
