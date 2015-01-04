package String;


class Stringbasic2{
	
	/*
	*******String ..immutable, Object, + versus concat, using new operator versus direct "", == versus equals,
	intern method*/
	
	
	static	String str1= "Parveen";
	
			static String str2= "Rawat"; 
			
			static String str3= str1+ str2;
	
			static String str4 = str1.concat(str2);
	
			static String str5=str4;
			
			
		
			//str3= str3+ str1; this is not legal here.. beacuse useless statement
			
	
	/*for string there is no append apis.. we just have "+" operator which is overloaded..because
	String is immutable so there is no point of saying append in String.. only String buffer and String builder have
	append apis.. for Strings we have + only
	*/
	
			
public static void main(String ...xxx)
{
	
	
	//class level var are normal.. there is no concept of having instance or static
	
		
	str3= str3.concat(str1); 	//this is legal as new object is getting created and old is set to NULL reference
	
	str3= str3+ str1; //this is legal as new object is getting created and old is set to NULL reference
	
	
	//so wass the diff
	
	// ********CONCATENATION versus + operator in String in JAVA
	
	
	/*
	+ uses the string builder or buffer append methods and mutatation techniques to concatenate Strings
	and in the last.. it gets converted to String using "toString()" method
	while append method creates new String always
	
	
	
	so its better to use + operator to save memory rather than concatenate method ..
	for big string manipulation go for String buffer..but anyhow String is there then go for + operator
	
	for just 2 ,3 strings use concatenate methods. as then we dont need to convert it to String builder and back to String
	
		
	*/
	
	
	/*
	GOLDEN RULE.. 
	
	if any String is going to be in an expression with any data type then result would be String always
	*/
	
	//System.out.println("comaprin 2 string reference " + (str3==str4));// it will result in false
	
	System.out.println(str3 + 15+ 17+ "studying " + "JAVA" + 1 + "."+ 2+4);
	
	System.out.println( 15+ 17+ str3+ "studying " + "JAVA" + 1 + "."+ 2+4); //here 15+17 is added then converted to String
	
	
	
	//toString method.. this method is object.toString. so that object can be converted to a String
	//and we can print that and then perform any String operation on that
	
	//JAVa has provided some wrapper CLASSES for each data type to convert each data type data to String
	
	
	Byte b = new Byte((byte)1);
	Short s = new Short((short)10);
	Integer i= new Integer(100);
	Long l = new Long(1000);	//automatic type casting
	Long l1 = new Long(1000l);	
	Character c = new Character('A');
	Float f = new Float(3.5);	//check this .. as decimal literals are double by default
	Double d = new Double(33.55);
	
	
	//so these all can be converted to String and then we can perform any String or object operation on that.
	
	

	
	
	
	
	//here below the total no. of String objects created are  7
	String x = "Who".concat("Lets").concat("the Dog").concat("out");
	
	
	//here below we can not be sure of the no. of String object creation as + operator uses some mutation and String builder techniques 
	
	String y = "Who"+"Lets"+"the Dog"+"out";
	
	
	
	
	
	
	
	
}
	
	
	
	
}