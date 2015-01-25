package String;
class Duplicate{
	

	static int [] fun(int a[])
	{
		
		
		
		int temp;
		int j=a.length;
		int i=0;;
		int z = 0;
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
		
		int b[]=new int[a.length];
		i=0;
		int k=0;
		b[k]=a[i];
		for (i=0;i<a.length-1;i++)
		{
			if (a[i]==a[i+1])
			{
			}
			else
			{
				b[k+1]=a[i+1];
				k++;
			}
			}
	
		for (i=0;i<b.length;i++)
		{
			
			 if (b[i]==0 && i!=0)
			{
				 z=i;
				 	
				 break;	
			}
			
			
		
			
			
		}
		
	
		
		
	for (i=0;i<z;i++)
		{
			System.out.println("aray elements are" + b[i]);	
		
		}
		

		return b;
	

		
	}
	
	
public static void main(String ...asdad)
{

	final  int a[];
	int i;
	a=Duplicate.fun(new int[]{1,2,2,2,2,2,2,2,2,2,2,4,6,8,9,22,2,2,2,1,9,0});

	for (i=0;i<a.length;i++)
	{
		System.out.println("aray elements are" + a[i]);	
	}
	
}
}