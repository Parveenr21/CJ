package Arrays;


class Matrixadd{
	
	static void fun(int a[][])
	
	{
		
		int i=0,j=0,c=0;
		for (j=0;j<a.length;j++)
		{
		
			System.out.println("");
			System.out.print("     ");
			c=0;
			int d=0;
			for (i=0;i<a[j].length;i++)	
		{
				
				
				System.out.print(a[j][i]);	
		System.out.print("   ");	
		c=c+a[j][i];
		if (i==a[j].length-1)
		{
			
			
			System.out.print(c);
		}
		
		
		}
		
		
		}
	
		System.out.println("");
		System.out.println("");
		
		
int d=0;
		int k=0;j=a.length;
		for (i=a.length;i>0;i--)
		{
			d=d+a[k][j-1];
			j--;
			k++;
			if(i==1)
			{
				System.out.print(d);
				System.out.print("  ");
			}
		}	
		
		System.out.print(" ");
		for (i=0;i<a.length;i++)
		{
			c=0;
			
			for (j=0;j<a[i].length;j++)
			{
				
				c=c+a[j][i];
				
				if(j==a[i].length-1)
				{
					
					System.out.print(c);
				System.out.print("  ");
				}
				
				
			}
		}
		
		d=0;
		for (i=0;i<a.length;i++)
			{
				d=d+a[i][i];
				if(i==a.length-1)
				{
					System.out.print(d);
					System.out.print("  ");
				}
			}
				
		
	}
	
	public static void main(String ...as)
	{
		Matrixadd.fun(new int[][]{{4,2,3},{1,1,1},{7,8,9}});
		
	}

}