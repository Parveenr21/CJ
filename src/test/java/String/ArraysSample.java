package String;


import java.io.BufferedReader;
import java.io.InputStreamReader;

class ArraysSample{
	
	static int x= 5;
	static int y=18;
	
	
	//static int z=x+y;    this is valid as Z is getting value of x+y
	//z=x+y this is also valid
	//z =z+x this is invalid as at class level z can not get z value.. logically incorrect.
	  
	
	public static int[] sort(int a[])
	{
		
		//sort logic
		int i=0;
		
		
		
		
		//x= x+y;
		
		for (int j=0;j<a.length-1;j++)
		{
		for (i=0;i<a.length-1;i++)
		
		{
			if(a[i]>a[i+1])
			{
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
			}
		}
	
	return a;
	
	}
	
	
	
	
	
	
	
	
	public static void main(String ...xxx)
	
	
	{
		
		int z[];
		
		
		int k=100,i=0; //here this declaring k and size of k should be before setting memory for z
		
			//z is simple a referece and also get runtime memory and so it gets memory in heap
		

		
	
		
		/*for (i=0;i<k;i++)
		{
			
			System.out.println("Enter the integer for the array or press ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//will do later on	
			
		}
		*/
		k=new int[]{111,500,10,155}.length;
	
		z = new int[k];
		
	z=sort(new int[]{111,500,1000,155}); //See the anonymous does not have any name.. its just memory allocation with new 
	
	
	for (i=0;i<k;i++)
	{
	System.out.println(z[i]);
	}
	}
	
	
	
	
	
	
	
}