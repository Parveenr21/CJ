package String;


import java.io.UnsupportedEncodingException;

public class StringAPIs {

	

	
	static	String str1= "Parveen";
	
	static String str2= "Rawat"; 
	
	
	public static void main(String ...ccc) throws UnsupportedEncodingException
	{
		
		//Comparison APIs
		
		char haha[]=str2.toCharArray();
		
		String str3="1111";
		
		char ooo[]=str3.toCharArray();	//Nothing like int array.. as we need either integer or char array to perform any operatin
		
		for(char c: ooo)
		{
			
			System.out.println(c);
		}
		
		int x = Integer.parseInt(str3);
		
		
		
		
		
	/*	Compare to compare the String character by character but in ascii mode
		Once it gets a diff in ascii value for a particual character then it prints the differene of ascii value
		but in int format*/
		
		int diff1=str1.compareTo(str2);			
		int diff2=str1.compareToIgnoreCase(str2);
		boolean b7=str1.equals(str2);
		
		
		boolean b1=(str1.intern()==str2.intern()); //its also object content comparison
		boolean b2=(str1==str2); //its identity comparison
		
		
		
		
		//Conversion of String to char array[]
		
		char arr[]=str1.toCharArray();
		
		str1.toLowerCase();  //case change
		str1.toUpperCase();
		
		byte b[]=str1.getBytes(); // This will result in byte array for the string with default java encoding
		
		byte bb[]=str1.getBytes("UTF-16");
		
		for (int k=0;k<b.length;k++)
			
		{
			//it will print the ascii values as of now for every character
			//System.out.println("default encoding value of string str1 char by char" + b[k]);
		
			
			//This will print the characters value as per the encoding passed.
			System.out.println("UTF-16 encoding value of string str1 char by char" + bb[k]);
		
		}
		
		
		
		
		//Getting characters from String
		
		char c1 = str1.charAt(0); //passing index of String here
		
		String purestring = str1.trim();	//removes any spaces before and end of String
		
		
		
		/********Using "String.valueof(datatype)" .. the data type is directly converted to String..
*/		
		//its just like using wrapper classes	"new Integer(Int datatype value).toString();"
		
		
		//The only diff is the String.valueOf is static function.. so use as per that
		
		String string_int=String.valueOf(10);
		
		
		
		Integer str_int = new Integer(10);
		str_int.toString();
		
		
		String xxx= String.valueOf(100);
		
		System.out.println("String representation of int  " + string_int);
		System.out.println("String representation of int using wrapper class " + str_int);
		
		
		
		//SUBSTRING methods...
		
		//str1.substring(index);
		
		
		
		for(String c:str1.split("r"))
		{
			
			//this split returns the array of the String.. and split on the basis of passed substring
			
			System.out.println(c);	
		}
		
	
		System.out.println(str1.substring(2));					//Passing begin index ..including index 2
		
		System.out.println(str1.substring(2,5));					//Passing begin index and Ending index (excluding ending index)
		
		
		System.out.println(str1.substring(2,3)); //include begin index only, exclude last index.. so 1 char only
		
		
		//so substring length  lastindex - firstindex  ..
		
		
		
		//System.out.println(str1.substring(15));		//index out of bound exception
		
		//System.out.println(str1.substring(-3,25));	//index out of bound exception
		
		
		System.out.println(str1.indexOf('e'));		//first occurence index is returned
		
		System.out.println(str1.indexOf('x'));		//if not found then returns -1
		
		
		
		//last element of string
		
		
		System.out.println(str1.substring(str1.length()-1));
		
		
		
		/*
		 * to get all indexes
		 * 
		 * 
		 * use jugaad
		 */
		
	
		
		
		
		
		
		
		int index=str1.indexOf("e");
				
		int index1=str1.substring(index+1).indexOf("e");	
			
		
		 index=0;
		int count=0;
		
		for(;count<str1.length()-1;++count)
		{
			
			
			index=str1.indexOf("e",count);
		
			System.out.println("woooo"+index);
		
			
		}
		
		
		
		
		
	}
	
	
}
