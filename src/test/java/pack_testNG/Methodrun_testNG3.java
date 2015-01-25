
package pack_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Methodrun_testNG3{
	
	
	
	
	@BeforeSuite
	public void Suitestart(){
		
		System.out.println("**************Before suite method of second  Methodrun_testNG3 ");
		
		
	}
	
	@AfterSuite
	public void SuiteEND(){
		
		System.out.println("**************After suite method of second  Methodrun_testNG3 ");
		
		
	}
	
	
	@Test
	public void met12(){
		
		
		System.out.println("method 12 called");
	}
	
	
	@Test
public void met11(){
		
		
		System.out.println("method 11 called");
	}
	
	
	@Test
	public void met10(){
			
			
			System.out.println("method 10 called");
			
		}
	
	@Test
	public void met9(){
			
			
			System.out.println("method 9 called");
		}
	
	
@BeforeClass
	
	public void beforeclass2_Methodrun_testNG2()
	{
		
		System.out.println("Before class method for the class name Methodrun_testNG3");
		
	}
	
@AfterClass
	
	public void afterclass2_Methodrun_testNG2()
	{
		
		System.out.println("After class method for the class name Methodrun_testNG3");
		
	}
	

	
	
@BeforeTest
	
	public void beforeclass_Methodrun_testNG2()
	{
		
		System.out.println("Before test method for the class name Methodrun_testNG3");
		
	}
	
@AfterTest
	
	public void afterclass_Methodrun_testNG2()
	{
		
		System.out.println("After test method for the class name Methodrun_testNG3");
		
	}
	
	
}