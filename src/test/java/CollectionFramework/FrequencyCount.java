package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FrequencyCount {

	
	public static void main(String ...ddd)
	{


		new FrequencyCount().calcFrequencyList(new String[]{"b","a","b","c","a","c","b","d","d","r","a","x"});;
		/*
		 * set has unique elemetns only.
		 */



	}
	
	private void calcFrequencyList(String s[])
	{
		
		List<String> li= new ArrayList<String>();
		
		for(String x:s)
		{
			li.add(x);
			
		}
		
		
		System.out.println(Collections.frequency(li, "a"));
		System.out.println(Collections.frequency(li, "b"));
		System.out.println(Collections.frequency(li, "c"));
		System.out.println(Collections.frequency(li, "x"));
		
	}
	
	
	
}
