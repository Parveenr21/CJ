package ProperiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException   {
		try {

			/*LOAD/STORE
			 * 
			 * For Reading/Writing properties files we create 3 class objects
			 * 
			 * 1. File class to create/read file  ..This will be having File name as parameter to constructor
			 * 2. FileInputStream or FileOutputStream class to create buffer which will do its work automatically
			 * 3. Properties class object  .. here it would be default constructor..
			 * 
			 *   
			 *   
			 *   To Write properties
			 *   
			 *   1. Create file with file name in constructor.
			 *   2. Create Output stream object and pass the file object reference  in constructor.
			 *   3. Create properties file
			 *   
			 *   user prop.setproperty method to set the properties...and once done...
			 *   
			 *   4. use prop.store(fileoutputstreamobject., "Comment String here")  
			 *   
			 *   always.. remember.. read and write will always be on the streams.. and we connect these streams to file/network.
			 *   
			 *   
			 *   5. close the stream object by streamobj.close()
			 *   
			 *   
			 *   To Read a file
			 *   
			 *   
			 *   1. Create file with file name in constructor
			 *   2. Create Input file stream with file object reference in the constructor
			 *   3. create properties class object
			 *   
			 *   4. use prop.load(fileinputstreamobject)   

			 * 
			 * 
			 * 	5. Prop.keys returns the iteraotor for key .. then we can iterate over keys.
			 * 
			 */


			File file = new File("test2.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();

			//
			properties.load(fileInput);
			fileInput.close();



			Enumeration<Object> en = properties.keys();


			while(en.hasMoreElements())
			{

				String key=(String) en.nextElement();

				System.out.println(properties.getProperty(key));


			}




			System.out.println(System.getProperty("favouriteAnimal"));



		}

		finally
		{

			
		}



	}
}