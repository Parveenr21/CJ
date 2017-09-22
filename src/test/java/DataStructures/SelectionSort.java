package DataStructures;

public class SelectionSort {

	
	static void foo(int arr[])
	{
		
		
		for(int count=0;count<arr.length;count++)
		{
			int index=count;
			for(int x=count;x<arr.length;x++)
			{
				
				if(arr[x]<arr[index])	//keep storing index of shorter number as well as the outer loop
				{
					index=x;
					
				}
				
				
			}
			
			
			//the below code of swapping will result in 0 for last number .. as when both index and count get matched..
			//which is like swapping same digit.. which yields to wrong result
			
			/*arr[index]=arr[index]+arr[count];
			arr[count]=arr[index]-arr[count];
			arr[index]=arr[index]-arr[count];*/
			
			
			//Alternate code
			
			int temp=arr[index];
			arr[index]=arr[count];
			arr[count]=temp;
			
			
		}
		
		
		for(int count=0;count<arr.length;count++)
			System.out.println(arr[count]);
		
		
		
	}
	
	
	
	public static void main(String ...c)
	{
		
		//foo(new int[]{1,4,5,3,22,1,0,-11,11,2,1,5,15,0,3,7,5,6,1,0});
		foo(new int[]{1,-4,33,0,12,-1,-1,0});
	}
}
