package String;


class StringSingleOccurrence{
	
	
	//this program is char counting without spaces
	
	public void exec(String a)
	{
		int i=0,sj=0,m=0,jj=0,x=0,old=0;
		int j;
		m=a.length();
		char k[]=new char[m];
		
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
			
			
		for (i=0;k[i]!='\0';i++)
		{
			System.out.println(k[i]);
		
		}
		
		
	}
	public static void main(String ...ass)
	{
	
		StringSingleOccurrence A=new StringSingleOccurrence();
		A.exec("aaazzzzzzppoooooooooo");
	
	}	
	
	
}