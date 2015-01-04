package String;


//basic bubble sort

class StringSort{
	
	
	
	public void exec(String a)
	{
		int i=0,x=0,m=0;
	char k[]=new char[a.length()];
		char j;
		String b,c;
	
		for (x=0;x<a.length();x++)
		{
		k[x]=a.charAt(x);
		
		}
		
		
		for(x=0;x<a.length();x++)
		{
		for(m=0;m<a.length()-1;m++)
		{
	if(k[m]>k[m+1])
				{
		j=k[m];
		k[m]=k[m+1];
		k[m+1]=j;
		
		
				}
			
		}
		}
		
		
		

		for (x=0;x<k.length;x++)
		{
		
			System.out.println(k[x]);
		}
		
		
		
	}
	
	
	
	public static void main(String ...ass)
	{
		StringSort A=new StringSort();
	A.exec("aasssaabaaa");
	}
}