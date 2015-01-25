package pack_testNG;



import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.beust.jcommander.Parameter;

public class testNG_Param {

	
	
	
/*	
	
	@Test(expectedExceptions =ArithmeticException.class) 
	public void testPrintMessage()
	{ 
		System.out.println("Inside  message"); 
		
	}*/
	
	
	
	@Test(dependsOnMethods ={"test111"})
	public void test990(){
		
		System.out.println("firstly called ..");
	}
	
	
	@Test()
	public void test111(){
		
		System.out.println("secondly called ..");
	}

	
	
	
	//For the below code..the parameters must be from suite..as parameters defined in Test are not working..checked.
	
	//might be ..those will work..when we will run it using testng file.

	
	@Test()
	@Parameters(value ={"x","y","z"})
	public void test44(String a, String b, String c ){
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	
		
		
	}	
	
}
