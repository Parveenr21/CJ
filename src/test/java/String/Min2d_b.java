package String;
class Min2d_b{
	
	static void fun(int a[][])
	
	{
		int min=0,i=0,j=0;
		min=a[j][i];
		for (i=0;i<a.length;i++)
		{
		
			j=i;
			for (;j<a[i].length;j++)
			
			{
				
				
				//System.out.println(a[j][i]);
				
			
				if (a[j][i]<min)
				{
					min=a[j][i];
				}
			
			}
			
						
					
			
		}
	
		
		
			
		
		System.out.println(min);
		
	}
	
	public static void main(String ...as)
	{
		Min2d_b.fun(new int[][]{{11,2,3},{4,5,6},{7,8,9}});
		
	}

}