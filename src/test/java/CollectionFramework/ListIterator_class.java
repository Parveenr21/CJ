package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator_class  {


	public static void main(String ...ccc)
	{

		List<String> genericList = new ArrayList<String>();
		Set<String> genericSet = new HashSet<String>();


		addElement2collection(genericList);
		//usingListIterator(genericList);
		
		usingListIterator(usingListIterator(genericList));
	}


	public static void addElement2collection(Collection<String> coll)
	{
		coll.add("Pauri");
		coll.add("Tehri");
		coll.add("Chamoli");
		coll.add("Uttarkashi");
		coll.add("Rishikesh");
		coll.add("Dehradun");

	}


	private static List<String> usingListIterator(List<String> coll)
	{

		ListIterator<String> lit= coll.listIterator();



		while(lit.hasNext())
		{

			/*
			 * This next actually sets the lit current eleement to temp and then do the next(). Even if we print this lit..
			 * its hashcode representation is getting printed.
			 */
			String temp = lit.next(); 

			System.out.println(temp);


			if(temp.equals("Tehri"))
			{

				lit.set("GARHWAL");
			}


		}
		
		System.out.println("Method execution finished");
		
		return coll;
		
		
		
		
	}





}
