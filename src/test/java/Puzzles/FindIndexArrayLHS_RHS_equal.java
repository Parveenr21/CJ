package Puzzles;

public class FindIndexArrayLHS_RHS_equal {


	
	static int foo(int arr[])
	{
		int index=-99;
		
		int lhs=0;
		
		
		for(int i=1;i<arr.length;i++)
		{
			
			int rhs=0;
			
			lhs=lhs+arr[i-1];
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				rhs=rhs+arr[j];
				
				if((lhs==rhs)&&(j==arr.length-1))
				{
					return i;
				}
				
				
				
			}
			
			
			
			
		}
		
		return index;
		
		
	
		
	}


	public static void main(String ...ccc)
	{
		
		
		System.out.println(foo(new int[]{1,2,6,22,11,4,2,5,7,8,6,1,2,6,12,1,4,2,5,7,8,6}));
		
		
	}
	
}
