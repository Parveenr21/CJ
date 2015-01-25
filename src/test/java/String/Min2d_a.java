package String;
class Min2d_a{
	
	static void fun(int a[][])
	
	{
		int min=0,i=0,j=0;
		min=a[i][j];
		for (i=0;i<a.length;i++)
		{
			j=i;
			
			for (;j<a[i].length;j++)
			
			{
				
			
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
				System.out.println(a[i][j]);
				
			}
			
						
					
			
		}
	
		
		
			
		
		System.out.println(min);
		
	}
	
	public static void main(String ...as)
	{
		Min2d_a.fun(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		
	}

}