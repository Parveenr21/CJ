package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList_customSorting implements Comparator<String> {

	/*
	 * To change the type of sorting we have to override Compare method of comparator interface
	 * so implement comparator in this class
	 * 
	 */
	
	
	public int compare(String x, String y) {  //this implementation of comparator gives sorting on length wise
		
		
		if(x.length()>y.length())
		{
			
			return 1;
		}
		
		else if (x.length()<y.length()) {
			
			
			return -1;
		}
		
		
		else
			
			return 0;
		
	}

	
	
	
	public static void main(String ...ccc)
	{
		
		
		List<Integer>  list_int = new ArrayList<Integer>();
		List<String> list_string  = new ArrayList<String>();
		
		
		list_string.add("aa");
		list_string.add("bbbb");
		list_string.add("cc");
		list_string.add("ddddddd");
		list_string.add("eee");
		list_string.add("ffffffff");
		
		
		
		for(String i : list_string)
		{
			
			System.out.println(i);
		}
		
		
		Collections.sort(list_string, new SortedList_customSorting());  //here pass the list type to sort and class having implementatins of comparator methods.
		
		System.out.println("---------------AFTER SORTING LIST---------");
		
		
		for(String i : list_string)
		{
			
			System.out.println(i);
		}
		
	}




	
	
	
}
