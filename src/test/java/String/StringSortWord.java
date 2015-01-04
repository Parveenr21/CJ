package String;
//import org.junit.internal.matchers.SubstringMatcher;

class StringSortWord{
	
	
	
	public void exec(String a)
	{
		int i=0,x=0,m=0;
	char k[]=new char[a.length()];
		char j;
		String b,c;
	
		for (x=0;x<a.length();x++)
		{
		if(a.charAt(x)==' ')
		{
			i++;
		
		}
		}
		i++;
		int z[]=new int[i];
		
		
		i=0;
		for (x=0;x<a.length();x++)
		{
		if(a.charAt(x)==' ')
		{
			z[i]=x;
			i++;
		
		}
		
				
		}
		z[z.length-1]=a.length();
		
		
		String s[] =new String[z.length];
		
		String temp;
		
		for(i=0;i<z.length;i++)
		{
		
			try{
			s[i] = a.substring(z[i-1], z[i]);
			s[i]=s[i].substring(1,s[i].length());
			}
			catch(Exception e)
			{
			s[i] = a.substring(0, z[i]);
				
			}
			
		
			
		}
		
		for(i=0;i<z.length;i++)
		{
			System.out.println(s[i]);
			
		}
		
		for(x=0;x<z.length;x++)
		{
		for(i=0;i<z.length-1;i++)
		{
			
			if(s[i+1].charAt(0)<s[i].charAt(0))
			{
			temp=s[i];
			s[i]=s[i+1];
			s[i+1]=temp;
				
			}
		}	
			
		}
		
		System.out.println("***********");
		
		for(i=0;i<z.length;i++)
		{
			System.out.println(s[i]);
			
		}
		System.out.println("***********");
		for (x=0;x<z.length;x++)
		{
		
			System.out.println(z[x]);
		}
		
		
		
	}
	
	
	
	public static void main(String ...ass)
	{
		StringSortWord A=new StringSortWord();
	A.exec("aass saaaaab bbaaaabb");
	}
}