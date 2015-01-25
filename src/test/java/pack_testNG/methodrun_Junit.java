
package pack_testNG;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;





@FixMethodOrder(MethodSorters.NAME_ASCENDING)//THIS ANNOTATION FOR TEST CLASS IS POVIDED IN JUNIT 4.11..othere wise ..random execution is there..
public class methodrun_Junit{
	
	
	@Test
	public void met1(){
		
		
		System.out.println("method 1 called");
	}
	
	
	@Test
public void met2(){
		
		
		System.out.println("method 2 called");
	}
	
	
	@Test
	public void met4(){
			
			
			System.out.println("method 4 called");
		}
	
	@Test
	public void met3(){
			
			
			System.out.println("method 3 called");
		}
	
}