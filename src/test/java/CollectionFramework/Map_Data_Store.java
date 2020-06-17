package CollectionFramework;

import java.util.*;

public class Map_Data_Store {


	static Map<String, Set<String> > mapper1 = new LinkedHashMap<String, Set<String>>();

	/*
	 * static Map<String, Set<String> > mapper1 = new LinkedHashMap<String, TreeSet<String>>();
	 * 
	 * This commented code does now work as. TreeSet is passed within the Map so this dynamic bindig works on the direct level.
	 * here we are telling about implementation of Map.. by linkedhash map..so this works.
	 * 
	 * when we define the implementation of Set.. then also we can change this to any other like treeset.
	 * 
	 */


	public static void main(String ...ccc)
	{


		String employee[]={"Parveen", "Shashank" ,"Vikas","Rajesh"};

		String [][] company ={{"RSI","Agnity","CSC"},{"RSI","UST Global","Syntel","GLoballogic","DELL"},{"Motherson"},{"HCL","WIPRO","DEFENSE"}};


		Map_Data_Store.createMap(employee, company, mapper1);

		Map_Data_Store.ShowMap(mapper1);

		System.out.println("-------------------REadding data to MAP using Enhanced for loop ----------------------------------");
		Map_Data_Store.createMap_enhancedForloop(employee, company, mapper1);

		Map_Data_Store.ShowMap(mapper1);

	}


	private static void createMap(String emp[], String comp[][], Map<String, Set<String>> mapper)
	{
		for(int i=0;i<comp.length;i++)
		{

			/*
			 * The set is actually implemented here by LinkedHash set
			 * 
			 */

			Set<String> sethash = new LinkedHashSet<String>(); //This sethash needs to be defined here.. as it needs to have a new set every iteration of i

			for(int j=0;j<comp[i].length;j++)
			{
				sethash.add(comp[i][j]);

			}
			mapper.put(emp[i], sethash );
		}

	}


	private static void  ShowMap(Map<String, Set<String>> sett)
	{
		for(Map.Entry<String, Set<String>> mp : sett.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}




	}


	private static void createMap_enhancedForloop(String emp[], String comp[][], Map<String, Set<String>> mapp)

	{

		int i=0;
		while(i<emp.length)
		{

			for (String str[]: comp)
			{

				Set<String> treeset= new TreeSet<String>();

				for(String str1: str)
				{

					treeset.add(str1);

				}


				mapp.put(emp[i], treeset);
				++i;
			}

		}




	}


}
