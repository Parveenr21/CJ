package CollectionFramework;

import java.util.HashSet;
import java.util.Set;



public class CustomObjects_in_set {

	
	/*
	 * As Sets can not have duplicate values so to keep duplicate values.. we create set of Custom objects where two different objects can have same value
	 * 
	 */
	
	public static void main(String ...ccc)
	{
		
		Set<CustomSet> stringset1 = new HashSet<CustomSet>();	//Created set of Customset object
		
		
		
		CustomSet cs1 = new CustomSet("Parveen");
		CustomSet cs2 = new CustomSet("RAWAT");
		CustomSet cs3 = new CustomSet("Parveen");
		
		
		stringset1.add(cs1);
		stringset1.add(cs2);
		stringset1.add(cs3);
		
		
		System.out.println(stringset1);  //It will print each object of set.. so each object printing needs overriding of toString() method.
		
		
		
		
		
		//for customset2
		
		Set<CustomSet2> stringset2 = new HashSet<CustomSet2>();
		
		CustomSet2 cs11 = new CustomSet2("Parveen",1000);
		CustomSet2 cs22 = new CustomSet2("RAWAT",2000);
		CustomSet2 cs33 = new CustomSet2("Parveen",1111);
		
		
		stringset2.add(cs11);
		stringset2.add(cs22);
		stringset2.add(cs33);
		
		
		System.out.println(stringset2);  //It will print each object of set.. so each object printing needs overriding of toString() method.
		
		
		
		
	}
	
	
	
	
	
}


 class CustomSet{
	
	
	 
	 String s;
	 
	 public CustomSet(String param) {
	
		 s=param;
	}
	 
	 
	 public String toString(){
		
		 
		 return s;
		 
		 
	 }
	 
	 
	 
	 
	
	
}

 
 
 
 
 class CustomSet2{
		
		
	 
	 String name;
	 
	 int salary;
	 
	 public CustomSet2(String name,int salary) {
	
		 this.name=name;
		this.salary=salary;
	}
	 
	 
	 public String toString(){
		
		 
		 return "{  " + name + "   "    + salary+   "} ";
		 
		 
	 }
	 
 }