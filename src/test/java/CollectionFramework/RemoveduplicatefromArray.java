package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveduplicatefromArray {

	public static void main(String ...ddd)
	{


		new RemoveduplicatefromArray().sortSet(new String[]{"b","a","b","c","a","c","b","d","d","r","a","x"});;
		new RemoveduplicatefromArray().sortList(new String[]{"b","a","b","c","a","c","b","d","d","r","a","x"});;



	}



	private  void sortSet(String arr[])
	{

		Set<String> s1= new LinkedHashSet<String>();



		for(String s: arr)
		{

			s1.add(s);
		}


		//String x[] =new String[s1.size()];


		Object w[]=s1.toArray();

		/*
		 * Set or List toArray method is overloaded
		 *
		 * By default toArray() returns Arrayof Object but if you want any specific aray just pass that initializatoin in the constructor.
		 * 	  
		 */


		String x[]=s1.toArray(new String[s1.size()]);


		for(String ss:x)
		{

			System.out.println(ss);
		}

	}



	private void sortList(String xx[])
	{


		List<String> coll = new ArrayList<String>();

		for(String str: xx)
		{
			
			coll.add(str);
		}
		
		/*
		 * To remove duplicate we  have to use Set and Linked to maintain order
		 */

		Set<String> set1 = new LinkedHashSet<String>();

		set1.addAll(coll);

		for(String x: set1)
		{

			System.out.println(x);
		}



	}

}
