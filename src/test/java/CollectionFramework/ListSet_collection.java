package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListSet_collection {

	
	
	public static void main(String ...ccc)
	{
	List<String> genericList = new ArrayList<String>();
	

	//SortedSet<String> set = new TreeSet<String>();  ..This can also be used
	
	Set<String> genericSet = new HashSet<String>();
	
	
	System.out.println("-------------Adding Elements to List--------------");
	addElement2collection(genericList);
	System.out.println("--------Retrieval As in insertion order in List------------------");
	SeeElementsStoringOrder(genericList);
	System.out.println("-----------Retrieval using Iterator in List----------------");
	SeeElementsIteratorOrder(genericList);
	System.out.println("---------------------------");	
	//SortedCollection(genericList);
	
	
	
	
	/*
	 * 
	 * As Sets are not indexed base.. so both enhanced for loops and Iterator based fetching is of random order and not even the insertion order.
	 * 
	 */
	
	System.out.println("----------Adding Elements to Set-----------------");
	addElement2collection(genericSet);
	System.out.println("-------------Retrieval As in insertion order in Set--------------");
	SeeElementsStoringOrder(genericSet);
	System.out.println("-------------Retrieval using Iterator in Set--------------");
	SeeElementsIteratorOrder(genericSet);
	System.out.println("---------------------------");	
	
	}
	
	
	
	/*
	 * Iterators do not have any expected order unless it is run on some sorted collection.. so we will check it for
	 * 
	 * sorted List and sorted set..
	 * I checked it for List.. as it was indexed based.. so here..both
	 * for loop and iterator brought same result set.. as list is by default based on indexing
	 * 
	 * but for Set as iterator has any order ..dont forget set has only unique elements
	 * not we check it for LinkedHashSet and TreeSet
	 * 
	 * 
	 * For Tree Set be it Iterator based or for loop based..both result are same .as it would be natural sorting..
	 * For Linked Hash Set too..as it is sorted in insertion order so both for and iterator based result are same.
	 * 
	 * for HashSet.. both loop would result in anything..
	 * 
	 * so the thing is.. Iterators are just like for loop..their ordering depeneds on the kind of collection just like for loop based fetching
	 * 
	 * 
	 */
	
	
	
	
	
	public static void addElement2collection(Collection<String> coll)
	{
		
		
		
		coll.add("Pauri");
		coll.add("Tehri");
		coll.add("Chamoli");
		coll.add("Uttarkashi");
		coll.add("Rishikesh");
		coll.add("Dehradun");
		
		
	}
	
	
	
	public static void SeeElementsStoringOrder(Collection<String> coll)
	
		
	{
	
		System.out.println(coll.size());
		
		for(String def: coll)
		{
			System.out.println(def);
			
		}
		
		
	}
	
	
	public static void SeeElementsIteratorOrder(Collection<String> coll)
	{
		
		
		Iterator<String> iter=coll.iterator();
		while(iter.hasNext())
		{
			String def = iter.next();
		
			System.out.println(def);
			
			
		}
		
		
	}
	
	
	public static void SortedCollection(Collection<String> coll)
	{
		
		
	/*	if (coll instanceof List<E> {
			
			Collections.sort(coll);
			
		}*/
		//Collections.sort(coll); //here only lists are allowed to be sorted..if you need sorted set,,then use TreeSet
		
		for(String def: coll)
		{
			
			System.out.println(def);
		}
		
	}
	
	
}
