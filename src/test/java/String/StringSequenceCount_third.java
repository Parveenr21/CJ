package String;


//My approach is to find the no. of diff chars or switching chars.. then i will create 2 arrays of same size
//one will store the char and another one will store the frequency


class StringSequenceCount_third{
	
	public static void exec(String x)
	{
		
		int i=0;
		int charswitch=1;
		
		
		
		for (i=0;i<x.length()-1;i++)
		{
			
		if (x.charAt(i)!=x.charAt(i+1))	
		{
			++charswitch;
			
		}		
		
		}
		System.out.println("no. of Char Switches are " + charswitch);	//no.of chars switching in the String
		
		
		int arr1[]= new int[charswitch];
		int arr2[]= new int[charswitch];
		
		i=0;
		int j=0,diff=0;
		
		for (i=0;i<x.length()-1;i++)
		{
			
			
			
			if(j==charswitch-1){
				
				arr1[j]=x.charAt(i);
				arr2[j]=i+1-diff;
			}
			
			
			
			
			
		if (x.charAt(i)!=x.charAt(i+1))	
		{
			
			
			arr1[j]=x.charAt(i);
			arr2[j]=i+1-diff-1;
			
			diff=i;
			++j;
		}
		
		}
		for (j=0;j<charswitch;j++)
		{
			
			
			System.out.println((char)arr1[j]);
			
		}
		
			
		
		for (j=0;j<charswitch;j++)
		{
			
		
		System.out.println(arr2[j]);
		
		}
		
	}
	
	
	
	
	public static void main(String ...cccc)
	{
		
		
		StringSequenceCount_third.exec("aaaaaabbbbaaaaaaaddddddddddffffffgggzz");
		
	}
	
	
	
}
