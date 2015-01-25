package ProperiesFiles;

import java.util.Properties;

public class SetSystemProperties {
	public static void main(String[] args) {

		
		/*
		 * Unlike nornal property files.. System properties do not have a file..
		 * Its just to System.setProperty("name","value") and System.getProperty()
		 * 
		 */
		
		
		
		/*
		 * public static String setProperty(String key, String value)
		 * 
		 * SecurityException -- if a security manager exists and its checkPermission method doesn't allow setting of the specified property.

				NullPointerException -- if key or value is null.

				IllegalArgumentException -- if key is empty.
		 * 
		 */

		
		
		//one way to set it.. check here. no need to create object like we create in properties file
		System.setProperty("favorite.berry", "blueberry");
		System.setProperty("favorite.animal", "TIGER");
		
		
		/*
		 * 
		 * another way to get all the properties using System.getProperties() with no arguments.
		and it will return the property object and call set property from there
				 
		 */
		Properties systemProperties = System.getProperties();
		systemProperties.setProperty("favorite.donut", "apple fritter");
		
		
		/*
		 * getProperty() returns String..or value of key
		 * 
		 */
		
		String favoriteBerry = System.getProperty("favorite.berry");
		String ANIMAL = System.getProperty("favorite.animal");
				String favoriteDonut = systemProperties.getProperty("favorite.donut");
		String favoriteDay = System.getProperty("favorite.day");
		String favoriteCar = System.getProperty("favorite.car");
		System.out.println("My favorite berry is: " + favoriteBerry);
		System.out.println("My favorite donut is: " + favoriteDonut);
		System.out.println("My favorite day is: " + favoriteDay);
		System.out.println("My favorite car is: " + favoriteCar);
			
		System.out.println("My favorite animal is: " + ANIMAL);
		System.out.println(systemProperties.getProperty("favorite.animal"));
		
		/*
		 * we can set the system property using JVM arguement too
		 * 
		 * e.g.
		 * 
		 * -Dfavorite.day=Saturday -Dfavorite.car="Nissan 350Z"
		 *
		 * 
		 * See I have set the JVM args for the favourie day and car.. so its a differnet configuration..
		 * 
		 * run both to check
		 * 
		 * 
		 */
		
		
		
		
	}
}