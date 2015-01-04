package IO;

import java.io.File;
import java.io.IOException;

public class FileCreation2 {

	
	
	public static void main(String...cc) throws IOException
	{
		
		boolean isdirectorycreated=false;
		boolean isfilecreated=false;
		boolean isdirectorydeleted=false;
		boolean isfiledeleted=false;
		
		
		
		new File("d:\\tempo1\\tempi2").mkdirs();
		
File foo1 = new File("d:\\tempo1\\tempi2\\lycos.txt");
		
		isfilecreated=foo1.createNewFile();
		
		
		if (isfilecreated ==true)
		{
			System.out.println("lycos file created succesfully");
		}
		else {
			
			System.out.println("lycos file could not be created");
		}
		
		
		
	}
	
}
