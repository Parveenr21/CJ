package ArraysObject;

public class Arr2 {

	
	static int x[]= new int[10];
	static Arr1 xx[]= new Arr1[10];
	
	static Arr1 c;
	
	
	
	void foo(){
		
		int k;
		 x= new int[10];  		//here array object is created so as object variables get default value automatically
		xx= new Arr1[10];		//so int array default values 0 while reference array object value null by default.
	    Arr1 c;
	
	
	for(int i=0;i<x.length;i++)
	{
		
		System.out.println(x[i]);
		
	}
	
	
	
	for(int i=0;i<xx.length;i++)
	{
		
		System.out.println(xx[i]);
		
	}
	
	
	//System.out.println(c);  reference no initialized
	
	}
	
	public static void main(String ...cc)
	{
		
		
		for(int i=0;i<x.length;i++)
		{
			
			System.out.println(x[i]);
			
		}
		
		
		
		for(int i=0;i<xx.length;i++)
		{
			
			System.out.println(xx[i]);
			
		}
		
		
		System.out.println(c);
		
		}
		


	
	
	

}
