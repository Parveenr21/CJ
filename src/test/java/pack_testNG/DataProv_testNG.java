package pack_testNG;
import org.testng.annotations.*;


public class DataProv_testNG{


@DataProvider(name ="hardcodedDATASOURCE")
public Object[][] datap(){

//return new String[][]{ {"name", "age", "sex"},{"name", "age", "sex"} };	//this will also work as String is also an object

	
	return new Object[][]{ {"name", "age", "sex"},{"name", "age", "sex"} };

}



@Test(dataProvider="hardcodedDATASOURCE")
	public void usingDS(String x , String y, String z){
		
			
		System.out.println("values coming from DS "  +x + "  " + y );
		
		
		
	}




}


