package Puzzles;

public class BinSearch {

	
	static boolean foo(int a[], int sea)
	{
		
	int lb=0;
	int ub=a.length-1;
	int m=(lb+ub)/2;
	
	
	while(lb<=ub)
	{
		
		
		
		
		if(sea==a[m])
			return true;
		
		if(sea<a[m])
			ub=m-1;
		
		if(sea>a[m])
		lb=m+1;
		
		
		m=(lb+ub)/2;
		
		
	}
		
		
		
		
		
		
		return false;
	}
	
	
	
	public static void main(String ...cc)
	{
		
		
		
		System.out.println(foo(new int[]{1,3,11,12,23,25,36,37,43,52,61},61));
		
	}
	
}
