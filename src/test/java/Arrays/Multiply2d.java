package Arrays;


class Multiply2d{
	
	static void fun(int a[][], int b[][])
	{
	
		int i=0,j=0;
	for (j=0;j<a.length;j++)
	{
		System.out.println("");
		for (i=0;i<a[j].length;i++)	
	{
	System.out.print(a[j][i]);	
	System.out.print("   ");	
	
	}
	}
	
	System.out.print("   ");	
	System.out.println("   ");	
	System.out.println("   ");	
	for (j=0;j<b.length;j++)
	{
		System.out.println("");
		for (i=0;i<b[j].length;i++)	
	{
	System.out.print(b[j][i]);	
	System.out.print("   ");	
	
	}
	}
	i=a.length;
	j=a[0].length;
	int c[][]=new int[i][j];

	System.out.println("  " );
	System.out.println("  " );
	System.out.println("  " );
	
	for (i=0;i<a.length;i++)
	{
		System.out.println("  " );
		
		for (j=0;j<b.length;j++)
		{
			c[i][j]=a[i][j]*b[j][i];
			
			
		
		}
		
	}
	
	System.out.println("  " );
	System.out.println("  " );
	System.out.println("  " );
	
	for (i=0;i<a.length;i++)
	{
		System.out.println("  " );
		
		for (j=0;j<b.length;j++)
		{
			
			System.out.print(c[i][j]);
			System.out.print("  " );
		
		}
		
	}
	
	
	
	}
	
	
	
	
	
	
	public static void main(String ...adsd){
		Multiply2d.fun(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, new int[][]{{9,8,7},{6,5,4},{3,2,1}});
	}
}