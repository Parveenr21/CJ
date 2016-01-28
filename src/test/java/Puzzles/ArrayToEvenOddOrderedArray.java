package Puzzles;

public class ArrayToEvenOddOrderedArray {

	//This is a problem to arrange ARRAY elements to EVEN FIRST and then ODD
	// [1,4,5,3,6]   to [4,6,1,5,3]


	int[] rearrange(int []arr)
	{
		int j=0;
		int ret[] = new int[arr.length];

		
		//Keeping even to the array
		
		for(int i:arr)				//This advanced for loop needs the variable to be defined within the for loop itself
		{
			if((i&1)==0)  //used bitwise operator here
			{
				ret[j]=i;
				++j;

			}
		}
		
	
		//keeping ODD to the array
		
		for(int i:arr)				//This advanced for loop needs the variable to be defined within the for loop itself
		{
			if((i&1)==1)
			{
				ret[j]=i;
				++j;

			}
		}

		return ret;
	}
	
	
	/*
	 * 	(2 & 1) = 0
		(3 & 1) = 1
		(4 & 1) = 0
		
		(0 | 1) = 1
		(1 | 1) = 1
		(2 | 1) = 3
		(3 | 1) = 4
		
		
	 * 
	 * 
	 */
			




	public static void main (String ...ccc)
	{

			int [] arr;
		arr=new ArrayToEvenOddOrderedArray().rearrange(new int[]{1,4,5,3,6,0,5,22,11,4});

		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
		

}
