package Search;

class BubbleSort{
	
	
	
	static int[] sort(int a[])
	{
		
		
		int i=0;
		int count=0;
		
		for (int j=0;j<a.length-1;j++)
		{
		for (i=0;i<a.length-1;i++)
		
		{
			
			++count;
			if(a[i]>a[i+1])
			{
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			
			}
			}
		}
	
		System.out.println("no. of for loop inside calling " + count);
		
	return a;
		
		
		
	}
	
	
	
	public static void main(String ...xxx)
	{
		
		int SortedArray[]=sort (new int[]{1,5,2,77,3,1,33,1,1,5,2,77,3,1,33,1});  //Average case
		//int SortedArray[]=sort (new int[]{1,1,1,2,3,5,33,77});  //Best case
		//int SortedArray[]=sort (new int[]{77,33,5,3,2,1,1,1});  //WORST case
		
		
		
		int len=SortedArray.length;
		
		System.out.println("Array elemnets in sorted order by Bubble Sort");
		
		for (int i=0;i<len;i++)
		{
			
		System.out.println(SortedArray[i]);	
		}
		
	}
	
	
}