package String;
class Max2d_b{
	
	static void fun(int a[][])
	
	{
		int max=0,i=0,j=0;
		max=a[j][i];
		for (i=0;i<a.length;i++)
		{
		
			j=i;
			for (;j<a[i].length;j++)
			
			{
				
				
				//System.out.println(a[j][i]);
				
			
				if (a[j][i]>max)
				{
					max=a[j][i];
				}
			
			}
			
						
					
			
		}
	
		
		
			
		
		System.out.println(max);
		
	}
	
	public static void main(String ...as)
	{
		Max2d_b.fun(new int[][]{{11,2,3},{4,5,6},{7,8,9}});
		
	}

}