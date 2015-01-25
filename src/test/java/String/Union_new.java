package String;
class Union_new{
	                               
	
	static void union(int a[], int b[])
	
	{
		int i=0;
		int c[] = new int[a.length+b.length];
		
		for (i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		
		for (i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
			
			
		}
		                  
		
		
		int temp;
		int j=c.length;
						for (;j>=0;j--)
				{
		for (i=0;i<c.length-1;i++)
		{
			
			if(c[i]>c[i+1])
			{
			temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
			
			}
			
		}
		
		}
		
		
						int z = 0;
		int d[]=new int[c.length];
		
		d[0]=c[0];
		
		for (i=0;i<c.length-1;i++)
			
		{
			
			if (c[i]==c[i+1])
			{
			}
			else
			
				{
				d[z+1]=c[i+1];	
				z++;
				}
	
		}

		for (i=0;i<d.length;i++)
		{if(d[i]==0 && i!=0)
		{
		break;
		}}
		
		
		for (z=0;z<i;z++)
		{
			System.out.println("Array elements are"+ d[z]);
		}
		
		
}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	public static void main(String ...asasa)
	{
		Union_new.union(new int[]{1,4,0,4,4,1,2,5,9,4,0,0,4,4,4,4,4,4,6,6,6,4,4,4,4,4}, new int[]{1,0,2,2,5,9,11});
		
	}
}