package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets_collection {


	public static void main(String ...vvv)
	{
		
		/* 
		 * Set is also an interface
		 */
		
		
		Set<String> set1 = new HashSet<String>();  //HashSet is one of the implementation of Set interface
		
		
		//Set contains unique records....no duplicate records are present here. (IMPORTANT)
		
		set1.add("One");
		set1.add("One");
		set1.add("Three");
		
		set1.add("FIVE");
		set1.add("TWO");
		
		System.out.println(set1);	//As Hash Set ordering is not sure.. so to maintain order use linkedHashset while for sorting use treeset
		
		
		
		//LinkedHASHSet for maintaining insertion order
		
		Set<String> set2 = new LinkedHashSet<String>();
		
		set2.add("One");
		set2.add("One");
		set2.add("Three");
		
		set2.add("FIVE");
		set2.add("TWO");
		
		System.out.println(set2);
		
		
		//treeset for sorted order
		
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("One");
		set3.add("One");
		
		set3.add("Three");
		set3.add("FIVE");
		set3.add("TWO");
		
		System.out.println(set3); //see ordering F o Tw th
		
		
		
		//Iterating in set
		
		for (String temp : set3)
			
		{
		
			System.out.println(temp);
		
		}
		
		
		
		//Sets are better fit ..for searching while List are good at fetching.. but as Sets do not contain duplicate ..use carefully
		//Hash set is most lightweight
		
		
		Set<String > set4 = new HashSet<String>(set3);
		
		System.out.println(set4);
		
		System.out.println("--------------Intersection---------------------------------------------- (s1.retainAll(s2))----------------");
		
		set4.retainAll(set2);  //Intersection of two sets
		System.out.println(set4);
		System.out.println("--------------UNION-----------------------------------------------------(s1.addAll(s2))------------------");
		set4.addAll(set2);
		System.out.println(set4); //As set can not have duplicate values so just unique again
		System.out.println("--------------REMOVEALL------------------------------------------------------(s1.removeAll(s2))--------------------");
		set4.removeAll(set2);
		System.out.println(set4);
		
		set3.remove("ddd");		//Here obviously when no duplicate records are there in Sets. then remove by object rather than index
		System.out.println("--------After removal-----------"); //if we remove the non existent record..nothing happens
		System.out.println(set3);

	set3.remove("two");
	System.out.println("--------After removal-----------"); // CASE SENSITIVE
	System.out.println(set3);
	
	set3.remove("TWO");
	System.out.println("--------After removal-----------"); // CASE SENSITIVE
	System.out.println(set3);
	
	
	
	}
	

}
