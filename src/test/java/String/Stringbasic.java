package String;


import org.openqa.selenium.Platform;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Stringbasic{
	
	
	/*
	Firstly in java there are two ways to compare an object 
	1. using equals method				//Equality comparison  .. its slow as compared to Identity comp
	2. using == operator				//Identity comparison  .. its very fast
	
	The == opeartor compare the reference varibles.. if they are referencing to same object or simpley they
	are references of same object.
	
	The equals operator compare the content of object.. if they are having same data */
	
	
	
	
		
	public static void main(String ...ccc){
		
		/*String is simply an object in java which is immutable..which can not be changed
		could be represented in 2 ways
		
		1. Direct write the string in double quotes e.g. "Parveen"
		2. Second way is to create an object.. but here also 2 objects gets created..one is direct string in quotes
		and another is what is created by new opeartor and can be accessed by its reference
		*/
		
		
		String temp = new String("Parveen");	//here it creates 2 objects first is direct "Parveen" and second is created by new operator
	
		String temp1="Anonymous";
		
		System.out.println(temp.intern());
		System.out.println(temp1.intern());
		
		
		System.out.println("Parveen" == new String("Parveen"));	//it will be false.. as chkng Identity
		
		System.out.println("Parveen".equals(new String("Parveen")) ); //it will be true.. as checking content	
		
		
		System.out.println("Parveen".intern() == new String("Parveen").intern());	
		
		//This intern method return the string if there in the hash pool else add it there and returns
		//so we do an equality comparison on the pointers which we know points to same object
		
	
		String test1= new String("Rawat");	//new operator will always create a new string all new.. by passing a String object to it.. so 2 objects
		String test2 = "Rawat"; //when we create an object like this.. the object gets created by seeing in the String object pool..if it is there.. then it will give reference to that and will not create a new one 
			
		String test3 = "Rawat"; //here also the same
		
		System.out.println(test1==test2);	//false
		System.out.println(test2==test3);   //true
		
	
	
		
		String str1= "Taboo";	// first object gets created
		String str2= "Taboo";	//here no object gets creaed same ..object reference is returned
		
		boolean b=  (str1==str2);		
		
		System.out.println(b);		//true
		System.out.println("Boolean value would be " + b); //true
		System.out.println("Boolean value would be " + (str1==str2)); //true
		
		System.out.println("Boolean value would be " + str1==str2); //false

		System.out.println(str1.lastIndexOf("o"));


		String s;
		Process p;
		String k="/Users";
		try {
			p = Runtime.getRuntime().exec("ls -aF " );
			BufferedReader br = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			while ((s = br.readLine()) != null)
				System.out.println("line: " + s);
			p.waitFor();
			System.out.println ("exit: " + p.exitValue());
			p.destroy();


		} catch (Exception e) {}


		/*here in the above false resulting examplethe "Boolean value would be" + str1 is getting
		calculated firstly and converting to String and then this new String is compared with str2
		so it will always results in false*/
		
		
		/*
		
		 char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
      String helloString = new String(helloArray);  //any thing can be converted to String also like this
		
		*/
		
		
		
		
		
		
	}
	
	
	
}