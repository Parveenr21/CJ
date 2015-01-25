package CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_app {


	public static void main(String ...cccc)

	{


		ArrayList<Integer> Intlist = new ArrayList<Integer>(); // default size of Arraylist is 10

		ArrayList<Integer>  Intlist_custom = new ArrayList<Integer>(50); // see here.. Array list od Integer object and not int primitive types

		
		Collections.synchronizedList(Intlist); //ArrayList is by default not synchornized
		
		//Add element to Array list..no sorting and no automatic duplicate removal

		Intlist.add(100); //append element to the list and in the end.
		Intlist.add(10);
		Intlist.add(11);
		Intlist.add(11);
		Intlist.add(11);		//add element 
		Intlist.add(12);
		Intlist.add(12);
		Intlist.add(12);
		Intlist.add(12);
		Intlist.add(13);
		Intlist.add(14);
		Intlist.add(15);
		Intlist.add(null);
		Intlist.add(9);
		Intlist.add(9);



		/*Intlist.add(9, 15);
		Intlist.add(12, 20);*/

		//System.out.println(Intlist.get(0));


		
		//first way to extract data
		
		
		/*
		for(int i=0;i<Intlist.size();i++)
		{

			System.out.println(Intlist.get(i));
		}
*/

		for (Integer i : Intlist)		//This is the example how to use enhanced for loop in Array List

		{

			System.out.println(i);		//as i here is an object but it is getting preinted as by default toString() method is called on this ..
		}



		//System.out.println(Intlist.size());
		//Intlist.remove(Intlist.size()-1);	//REmove generally on the basis of indexing

		
		Intlist.remove(new Integer(100));
		Intlist.remove(null);
		
		System.out.println("----------------");

		for (Integer i : Intlist)		//This is the example how to use enhanced for loop in Array List

		{

			System.out.println(i);		//as i here is an object but it is getting preinted as by default toString() method is called on this ..
		}


		/*
		 * Conversion of an Array to Array list and viceversa
		 * 
		 */





		/*
		 * 
		 * see all the List classes implements the List interfaces just like Array list
		 * 
		 * so we can also do the below thing for dynamic binding
		 */


		List<String> genericList = new ArrayList<String>();

		//add			-- element  or index,element
		//get			-- index
		//remove		-- index

	}





}
