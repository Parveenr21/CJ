package Puzzles;

import java.util.ArrayList;
import java.util.List;

public class ArrayToEvenOddOrderedUsingList {
	
	
	public static void main(String ...ccc)
	{
		
		int arr[];
		
		
		
		arr=new ArrayToEvenOddOrderedUsingList().rearrange(new int[]{1,4,5,3,6,0,5,22,11,4});
		
		for(int i:arr)
		{
			System.out.println(i);

		}
	}
	
	
	/*
	 * 
	 * Collections.sort(odd); //to sort any collection

	 * 
	 */
	
	int[] rearrange(int arr [])
	{
		
		int ret[]= new int[arr.length];
		 int j=0; 
		
		ArrayList<Integer> even= new ArrayList<Integer>(); //Here collection is collection of OBJECT.. check INTEGER wrapper class Aray list not int
		List<Integer> odd = new ArrayList<Integer>(); //Used List interface.. just for reminiscence
		
// To convert ARRAY TO ARRAY list
		/*
		 * Traverse array elemetn one by one and add 
		 * list.add(i) //Its easy
		 * to add element one by one to list
		 * 
		 */
		
		
		
		//List to ARRAY, Its little tricky as
		/*
		 * 		LIST is collection of INT objects and not int , 

		 * For STring
		 * 
		 * String[] arrayString = arraylist.toArray(new String[arraylist.size()]);
		 * 
		 * now use for loop to traverse Array and then add it to array of native data type
		 * 
		 * 
		 * Integer iii[]= even.toArray(new Integer[even.size()]);
		 * 
		 * 
		 * arraylist.toArray for a new Integer array of size list
		 * 
		 * for(Integer i:iii)
			{
	
				ret[j]=i;
				++j;
			}

		 * 
		 * 
		 * 
		 * GOOGLE GUAVA library does it in easy way
		 * List<Integer> list = ...;
            int[] values = Ints.toArray(list);
		
		 * 
		 * 				
		 */
		
		
		
		for(int i:arr)
		{
			
			if((i&1)==0)
			{
				even.add(i);
				
			}
			
			
			if((i&1)==1)
			{
				odd.add(i);
			}
			
		}
		
		even.addAll(even);	//Add all to add one collection to another.. not necessarily the same collection object.
		
		
		//even.toArray(); //List to Array of Object, now can be cast to Integer class (wrapper)
		Object oo[]=even.toArray();
		
		
		//Integer iii[]=even.toArray();//This does not work
		Integer iii[]= even.toArray(new Integer[even.size()]);
		
		for(Integer i:iii)
			{
	
				ret[j]=i;
				++j;
			}



		return ret;
	}

}
