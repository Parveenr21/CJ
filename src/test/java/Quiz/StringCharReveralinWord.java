package Quiz;



public class StringCharReveralinWord {

	
	public static void main(String ...ccc)
	{


		new StringCharReveralinWord().foo("Please reverse this string");

	}



	public void foo(String test)
	{


		StringBuffer sb = new StringBuffer(test);
		int counter=0;
		
		for(int i=0;i<sb.length();i++)
		{
			
			if(sb.charAt(i)==' ')
			{
				++counter;
			}
		}
		
		System.out.println(counter);
		
		
		int a[] = new int[counter];
		int j=0;
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==' ')
			{
				a[j]=i;
				++j;
			}
			
			
			
		}
		
		
		
		
		for(int i=0;i<sb.length();i++)
		{
			

			
			
		}
		
		
		
	}
	
}
