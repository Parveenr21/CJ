package String;

class String_wordReversal
{
	
	
	
	public static void main(String ...xxx)
	
	{
		
		
		String temp = "This is interview question";
		
		
		int counter=0;
		String arr[];
		
		//String[] words =  "This is interview question".split(" ");
		
		
		for(int i=0;i<temp.length();i++)
			
		{
			
			if(temp.charAt(i)==' ')
			{
				  ++counter;
			}
			
			
		}

		//System.out.println(counter);
		
		arr = new String[counter+1];
		
		
		int j=0,k=0;
	for(int i=0;i<temp.length();i++)
			
		{
			
		
		if(j==counter)
		{
			
			
			arr[j]=temp.substring(k, temp.length());
			
			//System.out.println(arr[j]);
		}
			if(temp.charAt(i)==' ')
			{
				
				
				arr[j]=temp.substring(k, i);
				
			//	System.out.println(arr[j]);
				
				j++;
				
				k=i+1;
			}
			
			
		}

	
	
	for (int i=arr.length-1;i>=0;i--)
	{
		
		System.out.println(arr[i]);
		
	}
	
	
	}
	
	
	
}