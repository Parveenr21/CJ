package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomObjects_in_Map {

	
	/*
	 * MAPS can also have custom objects
	 * 
	 */
	
	public static void main(String ...ccc)
	{
		
		Map<Integer, CustomMap> mp = new HashMap<Integer, CustomMap>();	//Created set of CustomMAP object where INTEGER is KEY while.. customma class is value
		
		
		
		
		
	CustomMap c1= new CustomMap("Parveen", 1800000);
	CustomMap c2= new CustomMap("Shashank", 1500000);
	CustomMap c3= new CustomMap("Gyan", 1000000);
	CustomMap c4= new CustomMap("Vikas", 800000);
	
	
	
	mp.put(0, c1);
	mp.put(1, c2);
	mp.put(2, c3);
	mp.put(3, c4);
		
	
	
	for (Map.Entry<Integer, CustomMap>  mapper :  mp.entrySet())
	{
		
	//	System.out.println(mapper);
		
		
		
		System.out.println(mapper.getValue());
		
	}
	
		
		
	}
	
	
	
	
	
}


 class CustomMap{
	
	
	 
	 String name;
	 
	 int salary;
	 
	 public CustomMap(String name,int salary) {
	
		 this.name=name;
		this.salary=salary;
	}
	 
	 
	 public String toString(){
		
		 
		 return "{  " + name + "   "    + salary+   "} ";
		 
		 
	 }
	
	
}
