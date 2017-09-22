package DataStructures;

public class InsertionSort {

	
	
	static void foo(int p[]){
		
		
		for(int i=0;i<p.length;i++)
		{
			
			int temp=i;
			
			while(i>0 && p[i]<p[i-1] )		//Comparing with sorted list
			{
				
				temp=p[i];
				p[i]=p[i-1];
				p[i-1]=temp;
				
				i--;
			}
			
			
			
			
		}
		
		for(int i=0;i<p.length;i++)
		System.out.println(p[i]);
			
		
	}
	
	public static void main(String ...c)
	{
		
		foo(new int[]{1,4,5,3,22,1,0,-11,11,2,1,5,15,0,3,7,5,6,1,0});
	}
	
}
