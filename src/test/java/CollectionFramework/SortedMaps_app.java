package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps_app {

	
	public static void main(String ...vvv)
	
	{
		
		/*
		 * There are two gud HAsH MAPS classes which are sorted 
		 * 
		 * 1. linkedhashmap  .it has doubly linkedlist along with the hashmao
		 * 2. treemap  .. it is also sorted hashmap..
		 * 
		 * sop of new class(); also print hash code.. which is there in hash map.   
		 * 
		 *  
		 * 
		 */
		
		
		linkedhashmap_implementation(); //It maintains the order in which it is inserted
	

		treemap_implementation(); // It is actually sorting in natural ordere.g. integer 1..to 9 and char A to z
	
		
		/*
		 * Here Map is the super class of the anyof the Map so ..once we know this map ..we will store the reference of any of the
		 * implementation of map into actual map
		 * 
		 */
		
		
		Map<Integer, String> mappp = new HashMap<Integer, String>();
		Map<Integer, String> mappp1 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> mappp2 = new TreeMap<Integer, String>();
		
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
	
		System.out.println("Using Dynamic binding of Map Interface");
		
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		genericmethod(mappp, "HASH MAP");  //No sorting
		genericmethod(mappp1, "LINKED HASH MAP"); //Preserve order the order key-value pairs were inserted
		genericmethod(mappp2, "TREE MAP");   //Sorted in the order natural ..on Key value..sorted on key value
		
	}

	
	
	static void linkedhashmap_implementation()
	{
		
		

		LinkedHashMap<Integer, String>  linkedhashmapppp = new LinkedHashMap<Integer, String>();
		
		
		
		linkedhashmapppp.put(0, "Zero");
		linkedhashmapppp.put(-1, "Minus one");
		linkedhashmapppp.put(11, "Eleven");
		linkedhashmapppp.put(1, "One");
		linkedhashmapppp.put(10, "Ten");
		
		System.out.println();
		
		for (Map.Entry<Integer, String> lhm : linkedhashmapppp.entrySet())
			
		{
			
			System.out.println("Key is " + lhm.getKey());
			System.out.println("Value is " + lhm.getValue());
		}
		
		
		
	}
	
	
	
	static void treemap_implementation()
	{
		
		TreeMap<Integer, String> treemappp = new TreeMap<Integer, String>();
		treemappp.put(0, "Zero");
		treemappp.put(-1, "Minus one");
		treemappp.put(11, "Eleven");
		treemappp.put(1, "One");
		treemappp.put(10, "Ten");

		
		
		
		for(Map.Entry<Integer, String> tmap : treemappp.entrySet())
		{
			
			
			System.out.println("Key is " + tmap.getKey());
			System.out.println("Value is " + tmap.getValue());
			
		}
		
		
	}
	
	
	
	static void genericmethod(Map<Integer, String>  genericmap, String MapImplentation)
	
		{
		
		
		genericmap.put(0, "Zero");
		genericmap.put(-1, "Minus one");
		genericmap.put(11, "Eleven");
		genericmap.put(1, "One");
		genericmap.put(10, "Ten");
		
		
		
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println(MapImplentation);
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		for(Map.Entry<Integer, String> mapgen: genericmap.entrySet())
			
		{
		
			System.out.println(mapgen.getValue());
			
		
			}
	
	
	
		
		
	}
	
}	