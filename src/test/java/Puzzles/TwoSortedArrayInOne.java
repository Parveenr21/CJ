package Puzzles;

public class TwoSortedArrayInOne {

	
	public static void main(String ...ccc){

		
		new TwoSortedArrayInOne().foo(new int[] {5,8,11,12,12,15,18}, new int[] {1,3,4,8,20});
		
		
	}
	
	
	
	public void foo(int x[], int y[])
	{
		
		
		int output[]= new int[x.length+y.length];
		
		/*
		 * 
		 * first element comp first element second arry
		 * 
		 * 
		 * small into new array 
		 * 
		 * 
		 * 
		 * small index increase compare it to first element of big array
		 * 
		 * 
		 */
		
		int check=0,i=0,j=0;
		
		while(i<x.length && j<y.length)
		{
			
			if(x[i]<y[j])
			{
				
				output[check]=x[i];
			
				++i;
			}
			
			else{
				output[check]=y[j];
				
				++j;
				
			}
		
			++check;
			
		}
			
		
		
		--check;
		
		for(int xx=0;xx<output.length;xx++)
		{
			
			System.out.println(output[xx]);
			
		}
		
			
		
		
		
			while(check<x.length)
			{
				
				
				output[check]=x[i];
				
				++check;
				++i;
	
				
			}
			
			while(check<y.length)
			{
				
				output[check]=y[j];
				
				++check;
				++j;
	
				
			}
			
			
			
			for(int xx=0;xx<output.length;xx++)
			{
				
				System.out.println(output[xx]);
				
			}
			
			
			
		
			
			
		}
		
		
		
	}
	
	
	
	
