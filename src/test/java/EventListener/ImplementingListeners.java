package EventListener;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ImplementingListeners implements IReporter {

	
	@Test
	public void test()
	
	{
		
		System.out.println("test method called");
		
	}

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		
		System.out.println("stub added to listener inplemented method");
	}
	
}
