package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapANDHashTable {

	public static void main(String ...ccc)
	{
		
		/*
		 * Hash table is legacy implementation while HashMap is new
		 * 
		 * HashMap:  It is not synchronized and permits null..no guarantee of order.
		 * Iterator in hash map is fail first
		 * 
		 * REST all of the apis are same..
		 * functionality is same.
		 * 
		 */
		
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Collections.synchronizedMap(hmap);	//to make hash map synchronized Interview question
		
				
		//Map<Integer, String> hmap = new Hashtable<Integer, String>();
		
		
		

		hmap.put(new Integer(0), "TestString");
		hmap.put(0, "TestString1");
		hmap.put(99, null);

		//for non existing KEYS.. we get NULL values


		//System.out.println(hmap.get(0)); //overwriting the key value..as O/P would be TestString1



		hmap.put(-1, "MinusOnee");	//Its just key can be -ve too
		hmap.put(11, "Eleven");
		hmap.put(1, "One");
		hmap.put(10, "Ten");
		hmap.put(-11, "MinusOnee");	//Its just key can be -ve too
		hmap.put(111, "Eleven");
		hmap.put(2, "One");
		hmap.put(5, "Ten");

		//Iterate over HASH MAP..

		for(Map.Entry<Integer, String> it : hmap.entrySet())
		{

			System.out.println("Getting key " + it.getKey());

			System.out.println("getting value " + it.getValue());

		}	
		
		
	}
	
	
	
	
	
}
