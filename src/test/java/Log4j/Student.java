package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import Json.JsonReader;

/*  This class is the java object or simply the data just like a properties file data ...of which we will create json object..
 * This class is still needed as this class has to be passed in while reading the JSON file..and the output too would be this class 
 * reference.
 * 
 * 
 * and this class also get passed to create the json file using object mapper
 * 
 */

public class Student {

    private int id;
	private String firstName;
	private String lastName;
	private int age;

	public Student(){

	}

	public Student(String fname, String lname, int age, int id){
		this.firstName = fname;
		this.lastName  = lname;
		this.age        = age;
		this.id         = id;
	}

	public void setFirstName(String fname) {
		this.firstName = fname;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lname) {
		this.lastName = lname;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	
	public static void main(String ...x)
{
	
	System.out.println(new Student());

	//PropertiesConfigurator is used to configure logger from properties file
	
	

			Logger logger = Logger.getLogger(JsonReader.class);
			
			PropertyConfigurator.configure("log4j.properties");
			//BasicConfigurator.configure();	
			logger.error("Printing contents of current classs.wooo");


}


	
	@Override
	public String toString() {
		return new StringBuffer(" First Name : ").append(this.firstName)
				.append(" Last Name : ").append(this.lastName).append(" Age : ").append(this.age).append(" ID : ").append(this.id).toString();
	}

	

	
}