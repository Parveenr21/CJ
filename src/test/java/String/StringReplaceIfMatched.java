package String;
class StringReplaceIfMatched{
	
	
	
	
	public void exec(String a, String b, String c)
	{
		int i=0,x=0;
	int k[]=new int[26];
		char j,m;
		String cc[]=new String[3];
		String ss = null;
		boolean boo;
	
		for (x=0;x<a.length()-b.length();x++)
		{
			
			if(b.equals(a.substring(x, x+b.length()))==true)
			{
				System.out.println("matched");
			
				try{
				cc[0]=a.substring(0, x-1);
				}
				
				catch(Exception e)
				{
					cc[0]=a.substring(0,0);	
				}
				cc[1]=a.substring(x, x+b.length());
				cc[2]=a.substring(x+b.length()+1, a.length()-1);
				
				
				ss=cc[0]+c+cc[2];
				System.out.println(ss);
				break;
				
				
				
			}
			else{
			if(x==a.length()-b.length()-1)
			{
				System.out.println("Not matched");
				break;
			}
	
			}
		
		}
		
	
		
		}
	
	
	public static void main(String ...ass)
	{
		StringReplaceIfMatched A=new StringReplaceIfMatched();
	A.exec("aassssbssssssssssssssssssss","aass","replacedINa");
	}
}