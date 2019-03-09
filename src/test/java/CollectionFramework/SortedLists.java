package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedLists {


public static void main(String ...dddd)
{
	
	
	List<Integer>  list_int = new ArrayList<Integer>();
	List<String> list_string  = new ArrayList<String>();
	
	
	list_int.add(11);
	list_int.add(-1);
	list_int.add(5);
	list_int.add(15);
	
	
	for(Integer i : list_int)
	{
		
		System.out.println(i);
	}
	
	
	//DEFAULT SORTING on list using collection sorting..organic or natural sorting
	
	Collections.sort(list_int); //Only applicable for LIST interface typed ..not for map or set
	
	System.out.println("---------------AFTER SORTING LIST---------");
	
	
	for(Integer i : list_int)
	{
		
		System.out.println(i);
	}
	



	
	
	
	


}


}
