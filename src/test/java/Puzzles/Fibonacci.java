package Puzzles;

public class Fibonacci {
	
	//enter fibonacci series how many elements..we need
	public static void fib(int x)
	{
		if(x==1)
		{
			
			System.out.println("0 and 1");
			
		}
		else if (x==0) {
			
			System.out.println("0");
			
		}
		
else if (x<0) {
			
			System.out.println("Invalid index");
			
		}
		
else {
					int fibArray[]=new int [x]; //x values array
					
					fibArray[0]=0;
		fibArray[1]=1;
		
		for(int k=2;k<x;k++)
		{
			
			fibArray[k]=fibArray[k-1]+fibArray[k-2];
		}
	
		
		for(int k=0;k<x;k++)
		{
			
			System.out.println(fibArray[k]);
		}
		
	}
	
	}
	public static void main(String ...cc)
	{
		
Fibonacci.fib(30);		
	}

}
