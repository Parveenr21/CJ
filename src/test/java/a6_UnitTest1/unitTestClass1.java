package a6_UnitTest1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class unitTestClass1 {

	@Test
	public void test1(){
		
		
		
		Assert.assertEquals("Static variable value checked",  DevClass1.y, 20);
		
		
	}
	
}
