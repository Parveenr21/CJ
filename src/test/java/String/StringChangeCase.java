package String;


class StringChangeCase{
	
	
	//this program is about the changing of cases of alphabets
	
	
	public void exec(String a)
	{
		int i=0,sj=0,m=0,jj=0,x=0,old=0;
		char j;
		m=a.length();
		char k[]=new char[m];
		
		char k1[]=a.toCharArray();
		
		
		//65-90  -- A-Z
		
		
		
		//97-122 -- a-z
		
		//Upper to lower means add 32 to it------- for char 65-90 add 32
		//Lower to upper means substract 32 from it  for char 97-122 substract 32
		
		/*
				
		&& java versus and SQL
		|| java versus or SQL
		*/
		
		
		for (i=0;i<a.length();i++)
		{
		if(a.charAt(i)>=65 && a.charAt(i)<=90)
		{
			k[i]=(char) (a.charAt(i)+32);		//casting of integer to char again
			k1[i]=(char) (a.charAt(i)+32);
			//b.charAt(i)=(char) (a.charAt(i)+32);  This is illegal statement.. it returns a value..its not varibale to set the value.
			
		}
		else if (a.charAt(i)>=97 && a.charAt(i)<=122)
		{
			k[i]=(char) (a.charAt(i)-32);
			k1[i]=(char) (a.charAt(i)-32);
		}
	}	
			
			
		for (i=0;i<k.length;i++)
		{
			System.out.print(k[i]);
			
		}
		System.out.println("");
		
		for (i=0;i<k1.length;i++)
		{
						System.out.print(k1[i]);
		}
		
		
		
	}
	public static void main(String ...ass)
	{
	
		StringChangeCase A=new StringChangeCase();
		A.exec("aaaAAzzzzzzppoooooooooo");
	
	}	
	
	
}