package String;
class Sort_single{
	
	
	
	static void sort(int a[])
	{
		int b[];
		b =new int[1];
		int j=a.length;
		int i=0;;
		
		for (;j>=0;j--)
				{
		for (i=0;i<a.length-1;i++)
		{
			
			if(a[i]>a[i+1])
			{
			b[0]=a[i];
			a[i]=a[i+1];
			a[i+1]=b[0];
			
			}
			
		
		}
		}
		for (i=0;i<a.length;i++)
		{
		
			System.out.println("Element" + i + "is" +a[i]);
		}
		
	}
	
	
	
	
	
	public static void main(String ...aaa)
	{
	
		Sort_single.sort(new int[]{9,8,9,6,5,4,3,2,1});
		
	}
}