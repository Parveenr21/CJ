package Json;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;


 
public class JsonReader {
    public static void main(String[] args) {
 
	ObjectMapper mapper = new ObjectMapper();
 
	try {
 
		// read from file, convert it to user class
		
		//Why we pass json class here when we do have the data file.
		//It is to know the schema of the class and methods of the json java class
		
		
		//here mapper.read(data, schema) is used to read from the data file.
		
		Student student = mapper.readValue(new File("d:\\user1.json"), Student.class );
 
		
		
		
		System.out.println(student);
		
		// By Default Object printing calls toString() method.
		System.out.println(student.toString());
		
		System.out.println(student.getFirstName());
		
		
		//student.setFirstName("ddddddddd"); This will simply be set in the current execution and not in the json data file.
		
		System.out.println(student);
	
	
	} catch (JsonGenerationException e) {
 
		e.printStackTrace();
 
	} catch (JsonMappingException e) {
 
		e.printStackTrace();
 
	} catch (IOException e) {
 
		e.printStackTrace();
 
	}
 
  }
 
}