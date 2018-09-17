package String;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;

public class Table {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@BeforeClass
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.w3schools.com/html/html5_form_attributes.asp";
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void testWebdriverSample() throws Exception {
		//driver.get(baseUrl + "/p/disclaimer.html");
		driver.get(baseUrl);
		String all=driver.getPageSource();
		//System.out.println(all);

		System.out.println("XXXXXXXXXXXXXx");
		
int count=0;		
		
List<WebElement> total=driver.findElements(By.xpath("//a[@href]"));
			
for(WebElement Element : total)
	
{
	//System.out.println(Element.getText());
	//String temp=Element.getText();
//System.out.println(driver.findElement(By.linkText(temp)).getText());

	count++;
	
}
			System.out.println("@@@@"+count+"@@@@");
		

			driver.findElement(By.xpath("//a[1]/b[@]")).click();
			
		int k=driver.findElements(By.xpath("//a[@href]")).size();//This also gives the no. of elements with this xpath
		
		
		
			
		
		//validate if the element is present 
		
		if(driver.findElements(By.xpath("//a[@href]")).size()!=0){
			
			System.out.println("Element present");
		}
		else{
			System.out.println("Element not present");
		}
		
		//Set<String> Allpages=driver.getWindowHandles();
		System.out.println("@@@@"+k+"@@@@");
	
		
		
		
	
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		
	}

	
}
