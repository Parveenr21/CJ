package pack_testNG;

import org.testng.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter{			//This class must be public else other package testng can not access it
	
	
	@Parameters({"param1"})			//it could be passed to any annotation method..even for before and after methods
	@Test
	public void test1(String myname){		//String myname will get the value from param1
		
		
		Assert.assertTrue(myname.equals("Parveen"));
		
	}
	
	
	
}