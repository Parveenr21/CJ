package String;


class StringSequenceCount{
	
	
	//this program is char counting without spaces
	
	public void exec(String a)
	{
		int i=0,x=0;
	int k[]=new int[26];
		char j,m;
		
	
		for (x=0;x<a.length();x++)
		{
			j=a.charAt(x);
			for(m='a';m<='z';m++)
			{
				
				if (j==m)
				{
					k[m-97]=k[m-97]+1;
					break;
				}
			
			}
			
			
		}
		
	
	
		
	
	
		for (i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
		
	}
	public static void main(String ...ass)
	{
	
		StringSequenceCount A=new StringSequenceCount();
		A.exec("xxxxxssssabbcccdddd");
	
	}	
	
	
}