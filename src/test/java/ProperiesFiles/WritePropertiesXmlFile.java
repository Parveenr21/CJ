package ProperiesFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesXmlFile {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("favoriteAnimal", "marmot");
			properties.setProperty("favoriteContinent", "Antarctica");
			properties.setProperty("favoritePerson", "Nicole");

			File file = new File("test2.xml");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.storeToXML(fileOut, "Favorite Things");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}