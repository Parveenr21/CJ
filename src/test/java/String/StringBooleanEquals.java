package String;


class StringBooleanEquals{
	
	//This program tells if two string passed are matched or equals
	
	public void exec(String a, String b)
	{
		int i=0,x=0;
	int k[]=new int[b.length()];
	int j[]=new int[a.length()];
		char m;
		String c;
		boolean boo;
	
		
		if(a.length()==b.length())
		{
		for (x=0;x<a.length();x++)
		{
			if(a.charAt(x)!=b.charAt(x))
			{
				
				System.out.println("Strings are of equal length but do not get matched");
				break;
			}
				
			
			if(x==a.length()-1) //this is the line where the loop get to the last index iteration and this is the point
			{
				System.out.println("Strings got matched");
			}
			
			
			
		}
		
		
		}
		else{
			
			System.out.println("Strings are of diff lengths so do not get matched");
		}
		
		
	}
	
	
	
	



	public static void main(String ...ass)
	{
		StringBooleanEquals A=new StringBooleanEquals();
	A.exec("aassssbssssssssssssssssssss","aassssbssssssssssssssssssss");
	}
}