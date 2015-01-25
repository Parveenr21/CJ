package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;


public class HashMap_app {

	public static void main(String ...ccccc)
	{
		/*
		 * HashMap from Java.Util package..to set Key- Value pair here
		 * 
		 */

		HashMap<Integer, String> hashmapppp  = new HashMap<Integer, String>(); //Again working on Objects.. its Integer and not int



		hashmapppp.put(new Integer(0), "TestString");
		hashmapppp.put(0, "TestString1");

		//for non existing KEYS.. we get NULL values


		//System.out.println(hashmapppp.get(0)); //overwriting the key value..as O/P would be TestString1



		hashmapppp.put(-1, "MinusOnee");	//Its just key can be -ve too
		hashmapppp.put(11, "Eleven");
		hashmapppp.put(1, "One");
		hashmapppp.put(10, "Ten");


		//Iterate over HASH MAP..

		for(Map.Entry<Integer, String> it : hashmapppp.entrySet())
		{

			System.out.println("Getting key " + it.getKey());

			System.out.println("getting value " + it.getValue());

			
		}	

		
		
		
		
		
		/*
		 * 
		 * WARNING:-- hashMAP does not maintain.. order REMEMBER.. IT could be .. the ordering of KEY-VALUE pair can be changed at any time.
		 * 
		 * HASH MAPS are not sorted.
		 */



		/*
		 * put (key value)
		 * 
		 * get (key)  value is returned (here both Key and Values are object)
		 * 
		 * remove(key)
		 * 
		 * 
		 */





		System.out.println("HASH MAP fetching of key-value is also an  Iterator  based.. But the below code does not work");

		/*while(hashmapppp.entrySet().iterator().hasNext())
				{

					Map.Entry<Integer, String> itt =hashmapppp.entrySet().iterator().next();



					System.out.println(itt.getValue());

				}*/

	}







}
