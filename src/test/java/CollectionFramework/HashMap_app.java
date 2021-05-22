package CollectionFramework;

import AbstractnInterfaces.Parent_v1;
import org.apache.commons.collections.IterableMap;
import org.apache.poi.util.SystemOutLogger;

import java.util.*;


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


		//for non existing KEYS.. we get NULL values as result of  map.get
		System.out.println(hashmapppp.get(100));




		System.out.println(hashmapppp.get(0)); //overwriting the key value..as O/P would be TestString1



		hashmapppp.put(-1, "MinusOnee");	//Its just key can be -ve too
		hashmapppp.put(11, "Eleven");
		hashmapppp.put(1, "One");
		hashmapppp.put(10, "Ten");


		//Iterate over HASH MAP..

		//2 of the best ways

		/*


		Using iterator and Map.Entry

		long i = 0;
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> pair = it.next();
			i += pair.getKey() + pair.getValue();
		}




		Using foreach and Map.Entry

		long i = 0;
		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			i += pair.getKey() + pair.getValue();
		}



using JAVA 8 lambda way

Map<String, Integer> items = new HashMap<>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);

	items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

	items.forEach((k,v)->{
		System.out.println("Item : " + k + " Count : " + v);
		if("E".equals(k)){
			System.out.println("Hello E");
		}
	});


		 */


		System.out.println("default wayyyyyyyy");

		for(Map.Entry<Integer, String> it : hashmapppp.entrySet())
		{

			System.out.println("Getting key " + it.getKey());

			System.out.println("getting value " + it.getValue());


		}

		System.out.println("Lambda way");


		hashmapppp.forEach((k,v)->System.out.println("key : " + k + " value : " + v));

	hashmapppp.keySet();


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



		Iterator<Map.Entry<Integer, String>> it = hashmapppp.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry<Integer, String> pair = it.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());


		}


//Iterator returned is of KEy type as it is the key
		Iterator<Integer>itr=hashmapppp.keySet().iterator();

		System.out.println("$$$$$$$$");

		while(itr.hasNext())
		{

			Integer key=itr.next();

			System.out.println(key);
			System.out.println(hashmapppp.get(key));



		}


	}









}
