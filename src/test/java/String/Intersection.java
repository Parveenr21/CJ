package String;
class Intersection{
	                               
	
	static void fun(int a[], int b[])
	
	{
		
		
		int temp,i=0;
		int j=a.length;
						for (;j>=0;j--)
				{
		for (i=0;i<a.length-1;i++)
		{
			
			if(a[i]>a[i+1])
			{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
			}
			
		}
		
		}
		
						
						 j=b.length;
						for (;j>=0;j--)
				{
		for (i=0;i<b.length-1;i++)
		{
			
			if(b[i]>b[i+1])
			{
			temp=b[i];
			b[i]=b[i+1];
			b[i+1]=temp;
			
			}
			
		}
		
		}
		
		
						
						int z = 0;
						int c[]=new int[a.length];
						
						c[0]=a[0];
						
						for (i=0;i<a.length-1;i++)
							
						{
							
							if (a[i]==a[i+1])
							{
							}
							else
							
								{
								c[z+1]=a[i+1];	
								z++;
								}
					
						}

						
						
						
						z = 0;
						int d[]=new int[b.length];
						
						d[0]=b[0];
						
						for (i=0;i<b.length-1;i++)
							
						{
							
							if (b[i]==b[i+1])
							{
							}
							else
							
								{
								d[z+1]=b[i+1];	
								z++;
								}
					
						}
						
						
						for (i=0;i<c.length;i++)
						{if(c[i]==0 && i!=0)
						{
						break;
						}}
						
						int e[] =new int[i];
						
						for (z=0;z<i;z++)
						{
						e[z]=c[z];	
							
						}	
						
						
						
						for (i=0;i<d.length;i++)
						{if(d[i]==0 && i!=0)
						{
						break;
						}}
						
						int f[] =new int[i];
						
						for (z=0;z<i;z++)
						{
						f[z]=d[z];	
							
						}	
						
						
						/*for (z=0;z<e.length;z++)
						{
							System.out.println("cccccccc are"+ e[z]);
						}
						
						for (z=0;z<f.length;z++)
						{
							System.out.println("dddddddd are"+ f[z]);
						}
						*/
						
						
						
						
						
		i=0;
		j=0;
		int k=0;
		int g[] = new int[e.length+f.length];
		
	for (j=0;j<e.length;j++)
				{
		for (i=0;i<f.length;i++)
		{
			if (e[j]==f[i])
			{
				g[k]=e[j];
				k++;
				break;
			}
			
			
		}
				}         
		
	
	//System.out.println("Array elements are"+ g.length);
		
	for (i=0;i<g.length;i++)
	{
		if (i!=0 && g[i]==0)
	{
	break;
	}	
		}
	//System.out.println("iiiiiiiiiie"+ i);	
	
	for (k=0;k<i;k++)
		{
			
			
			System.out.println("Array elements are"+ g[k]);
		}
		
		
}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	public static void main(String ...asasa)
	{
		Intersection.fun(new int[]{1,4,0,4,4,1,2,5,9,4,0,0,4,4,4,4,4,4,6,6,6,4,4,4,4,4}, new int[]{1,0,2,2,5,9,11});
		
	}
}