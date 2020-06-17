package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCountinArrayofString {


	//Done using LIST only
	//Collections.frequency(list,object)

	public static void main(String ...ddd)
	{


		new FrequencyCountinArrayofString().calcFrequencyList(new String[]{"b","a","b","c","a","c","b","d","d","r","a","x"});;
		/*
		 * set has unique elemetns only.
		 */



	}

	private void calcFrequencyList(String s[])
	{



/*
Arrays of int to List



This one will not work as spam is of primitive type

int[] spam = new int[] { 1, 2, 3 };
Arrays.asList(spam)



//spam of Object type

Integer[] spam = new Integer[] { 1, 2, 3 };
List<Integer> list = Arrays.asList(spam);






from int arry to list of Integer

import java.util.List;
import java.util.ArrayList;

class ListUtil {

	// program to convert int array to List of Integer
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> list = new ArrayList<>(arr.length);

		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}

		System.out.println(list);
	}
}



 */


/*

incrrease arrays size in JAVA

package com.java2novice.arrays;

import java.util.Arrays;

public class MyArrayCopy {

    public static void main(String a[]){

        int[] myArr = {2,4,2,4,5,6,3};
        System.out.println("Array size before copy: "+myArr.length);
        int[] newArr = Arrays.copyOf(myArr, 10);
        System.out.println("New array size after copying: "+newArr.length);
    }
}

 */

/*


list to array ..but it would be same of Object type ..not of non primitive type



li.toArray()

so for primitive type.. iterate over list is one of the way..




public static int[] convertIntegers(List<Integer> integers)
{
    int[] ret = new int[integers.size()];
    Iterator<Integer> iterator = integers.iterator();
    for (int i = 0; i < ret.length; i++)
    {
        ret[i] = iterator.next().intValue();
    }
    return ret;
}



another way

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		int[] primitive = list.stream()
							.mapToInt(Integer::intValue)
							.toArray();



 */



		List<String> li= new ArrayList<String>();





		for(String x:s)
		{
			li.add(x);

		}

		Collections.sort(li);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(String x:li)
		{
			System.out.println(x);

		}


		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Collections.reverse(li);

		for(String x:li)
		{
			System.out.println(x);

		}


		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(Collections.frequency(li, "a"));
		System.out.println(Collections.frequency(li, "b"));
		System.out.println(Collections.frequency(li, "c"));
		System.out.println(Collections.frequency(li, "x"));

	}



}
