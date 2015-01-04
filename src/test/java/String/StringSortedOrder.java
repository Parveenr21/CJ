package String;


class StringSortedOrder{
	
	
	//this program is doing firstly the single occurrence of all chars
	//then its sorting the chars..drawback is here .. for string like aaaabbbbsscccaaa
	//here the out put would be aabcs
	
	
	public void exec(String a)
	{
		int i=0,sj=0,m=0,jj=0,x=0,old=0;
		int j;
		char ch1;
		m=a.length();
		
		char ch[]=new char[a.length()];
	char k[]=new char[a.length()];
		
		k[0]=a.charAt(0);
		for (j=0;j<a.length()-1;j++)
		{
	
	if(a.charAt(j)!=a.charAt(j+1))
	{
		k[x+1]=a.charAt(j+1);
		x++;
	}
	
	if (a.charAt(j)==a.length()-1)
	{
	k[x+1]='\0';	
	}
			
		}
		
		for(j=k.length;j>0;j--)
		{
		for (i=0;k[i+1]!='\0';i++)
			{
				if (k[i+1]<k[i])
				{
					ch1=k[i];
					k[i]=k[i+1];
					k[i+1]=ch1;
				}
				
				
				
			}
			
		}
		
		
		for (i=0;k[i]!='\0';i++)
		{
			System.out.println(k[i]);
		
		}
		
		
	}
	public static void main(String ...ass)
	{
	
		StringSortedOrder A=new StringSortedOrder();
		A.exec("aaazzzzzzppoooooooooozyxrstnmjihp");
	
	}	
	
	
}