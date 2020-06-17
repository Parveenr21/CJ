package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_app {


	public static void main(String ...dddd)
	{
		
		
		/*
		 * 
		 * Dynamic binding.. we always pass List<> Interface between methods.. and have different implementation of Listinterface
		 * 
		 * like array list or linkedlist
		 * 
		 */
		
		
		ArrayList<String> arrlist_String = new ArrayList<String>();		
		//String typed Array list can not be pased to List<Integer> interface. Datatype  must be matched.
		
		
		
		ArrayList<Integer> arrlist_Integer = new ArrayList<Integer>();
		LinkedList<Integer> linklist_Integer = new LinkedList<Integer>();
		
		//Use Array List ..If we want to add elements in the end.. 
		//Use Linked List if you have to add elements in the beginning or in the middle.
		
		
		
		
	//linklist_Integer.get(100);  for non existing indexes.. we get Index out of bound exception..
		//So list are just like arrays for single element.
		
		
		
		timeElapsed(arrlist_Integer, "ArrayList");
		timeElapsed(linklist_Integer, "LinkedList");
		
		
		
		timeElapsedRemove(arrlist_Integer, "ArrayList" );
		timeElapsedRemove(linklist_Integer, "LinkedList");
		
		CallingIterator(arrlist_Integer, "ArrayList");
		CallingIterator(linklist_Integer, "LinkedList");
		
		
		/*
		foo(arrlist_Integer);
		foo(linklist_Integer);*/
		
	}
	
	
	private static void foo(List<Integer> anylist)
	{
		
		System.out.println("Method called");
	}


	
	private static void timeElapsed(List<Integer> anylist, String ListType)
	{
		
		
		long starttime= System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++)
		{
			anylist.add(i);
			
			
		}
		
		long endtime= System.currentTimeMillis();
		
		
		
		System.out.println("time elapsed in adding element to the list " + "  " + ListType + "  "  +   (endtime-starttime) + "ms");
		
		
		/*
		 * 
		 * adding element to Linked list took slightly large time.. as Items get added to the list in the end..
		 * by default to both the list.. But If we do add elements in the beginning or in the middle..then
		 * Linked list is much and significantly faster.
		 * 
		 * Even if we add near the end of list..then array list will be faster..
		 * 
		 * the same goes with removal too.. as it only depend on the positoin from where we are adding or removing.
		 * 
		 * Because.. Array list is the list of Arrays objects
		 * [0][1][2] so when an element is inserted in the beginning then whole arrays needs to be created newly created array positions are recreatd
		 * 
		 *  while for linked list its reference basis and not all objects needs to be repositioned just before the adding element and after the addig element
		 *  needs to set the references.
		 * 
		 * 
		 *  List is a sequence of Objects.. be its Integer in case of int, Character in case of char
		 *  
		 *  AND ..IF we go from 1E5 to 1E6.. the result can be too much relative
		 */
		
		
			starttime= System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++)
		{
			anylist.add(0, i);
			
			
		}
		
		 endtime= System.currentTimeMillis();
		
		
		
		System.out.println("time elapsed in adding element to the list from index 0 " + "  " + ListType + "  "  +   (endtime-starttime) + "ms");
		
		
		
		/*
		 * Real Time data
		 * 
		 * time elapsed in adding element to the list   ArrayList  14ms
		time elapsed in adding element to the list from index 0   ArrayList  174973ms
		time elapsed in adding element to the list   LinkedList  50ms
			time elapsed in adding element to the list from index 0   LinkedList  145ms
		 * 
		 */
		
	}
	
	
	
	private static void timeElapsedRemove(List<Integer> anylist, String ListType)
	{
		
		
		//System.out.println(anylist.size());
		
			long starttime= System.currentTimeMillis();
		
		
			int list_size= anylist.size();
			
			for(int i=0;i<list_size;i++)		//here also keep list_size and do not use anylist.size()..which keep on changing
		{
			
			
			/*
			 * WARNING.. the below commented code line ..will be wrong.. as anylist.size() value will also be changed after every iteration..
			 * 
			 */
			//anylist.remove(anylist.size()-i-1);
			
			
			
			anylist.remove(list_size-i-1);
			
			
		}
		
			ArrayList<String> Al = new ArrayList<String>();
			
			
			System.out.println("$$$$$$$$$$$" + Al.size());
			
			LinkedList<String> ll = new LinkedList<String>();
			System.out.println("$$$$$$$$$$$" + ll.size());
			
			
			ll.addFirst("aa");
			ll.addLast("zz");
			ll.add(null);
			
			
			for(String s:ll)
			System.out.println("list *************** " + s);
			
			
		long endtime= System.currentTimeMillis();
		
//		System.out.println(anylist.size());
		
		System.out.println("time elapsed in removing element to the list " + "  " + ListType + "  "  +   (endtime-starttime) + "ms");
	
		
		
		
		
		
		for(int i=0;i<1E5;i++)
		{
			anylist.add(0, i);
			
			
		}
		
		
		

		
		list_size = anylist.size();
		
		starttime= System.currentTimeMillis();
		



		for(int i=0;i<list_size;i++)
		{
			anylist.remove(0);
			
			
		}
		
		 endtime= System.currentTimeMillis();


		
		
		System.out.println("time elapsed in removing element to the list from index 0 " + "  " + ListType + "  "  +   (endtime-starttime) + "ms");


		
		
		
		
		
		
		
	}
	
	
	
	public static void CallingIterator(List<Integer> anylist , String Littype)
	
	{
	
		
		/*
		 * 
		 * to update a record in list.. We use iterator interface to browse through list and put a condition and delete the element..
		 * which can not be done using for loop
		 * 
		 * where we need to know the positionor index of that element to be present..
		 * 
		 * List can be browsed through for enhanced loop as well as iterator 
		 * 
		 * Iterator can be run on any of the collection class which returns the iterator by calling
		 * 
		 * Iterator<Integer> it = Collection.iterator()
		 * 
		 * we just put iterator interface variable for hasnext() condition and get the oject by next() api ..just these 2 are enough
		 */

		
		System.out.println("-----------------------using ITERATOR interface----------------------");
		
		for(int i=0;i<1E5;i++)
		{
			anylist.add(0, i);
			
			
		}	
		
		Iterator<Integer> it_int=anylist.iterator(); 	//There is no gurantee of ordering of elements in Iterator unless this is instance of sorted collection
		
		
		while (it_int.hasNext())
		{
			
			Integer a= it_int.next(); //default conversion fron Integer class to int type
	
		
			
			/*
			 * Do not use below code to update the list item as.. the ordering of Iterator is not confirmed.
			 * 
			 * if(a.equals(new Integer(50000)))
			{
				it_int.remove();
				anylist.add(counter, 999999); //jugad technology
			}*/
			
		if(a.equals(new Integer(50000)))
		{
			it_int.remove();
		}
		
		
			
		}
		
		
		
		
		
		for(int i: anylist)
		{
			
			if(i==50000)
			{
				
		System.out.println("element still exist");		
			}
		
		
		}
		
		
		
	}
	
	
	
	
	
	
}
