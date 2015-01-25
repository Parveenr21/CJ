package ProperiesFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	public static void main(String[] args) {
		try {
			
			//Create properties object
			Properties properties = new Properties();
			
			//Setting Key-Value pair using property.setProperty() method
			/*
			As we can set property object and then we can store these info
			in the file created by File class and connected to Output stream
			*/
			properties.setProperty("favoriteAnimal", "marmot");
			properties.setProperty("favoriteContinent", "Antarctica");
			properties.setProperty("favoritePerson", "Nicole");

			
			
			//create a file 
			File file = new File("test2.properties");
			
			
			//open outputstream to file
			FileOutputStream fileOut = new FileOutputStream(file);
			
			
			
			
			//Storing properties object to fileoutput stream.
			properties.store(fileOut, "Favorite Things"); //the second argument is STRING comments here for the property files
			
			//Closing of Stream is very important.
			
			fileOut.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}