package CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;



public class ArrayListANDVector {



	public static void main(String ...ccc)
	{


		ArrayList<String> intList = new ArrayList<String>();
		//Vector<String> intList = new Vector<String>();
		 List<String> vectorlist = new Vector<String>();



		intList.add("10"); //append element to the list and in the end.

		intList.add((new Integer(10)).toString());
		intList.add("11");
		intList.add("11");
		intList.add("11");		//add element
		intList.add("12");
		intList.add("12");
		intList.add("12");
		intList.add("12");
		intList.add("9");
		intList.add("9");
		intList.add("9");
		intList.add("9");
		intList.add("9");





		for (String i : intList)		//This is the example how to use enhanced for loop in Array List

		{



			System.out.println(i);		//as i here is an object but it is getting preinted as by default toString() method is called on this ..
		}


			Collections.sort(intList);




	}






}
