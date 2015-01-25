package String;
class Max2d_a{
	
	static void fun(int a[][])
	
	{
		int max=0,i=0,j=0;
		max=a[i][j];
		for (i=0;i<a.length;i++)
		{
			j=i;
			
		
			
			for (;j<a[i].length;j++)
			
			{
				
				
				if (a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.println(a[i][j]);
				
			}
			
						
					
			
		}
	
		
		
			
		
		System.out.println(max);
		
	}
	
	public static void main(String ...as)
	{
		Max2d_a.fun(new int[][]{{11,2,3},{4,5,6},{7,8,9}});
		
	}

}