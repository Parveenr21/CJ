package String;
class StringSequence1{
	
	
	//this program is char counting without spaces
	
	public void exec(String a)
	{
		int i=0,j=0,x=0,old=0;
		int k[]=new int[10];
		j=a.charAt(i);
	
		
		for (;i<a.length();i++)
	{
	if (a.charAt(i)!=j)
	{
	
		try{
			k[x]=i-old;		
		}
	catch(Exception e){
		k[x]=i;
	}
	old=i;
	x++;
	j=a.charAt(i);
	}
		
	if (a.charAt(i)==a.charAt(a.length()-1))
	{
	
		k[x]=a.length()-i;
	break;
	}
	
	}
	
	
		
	
	
		for (i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
		
	}
	public static void main(String ...ass)
	{
	
		StringSequence1 A=new StringSequence1();
		A.exec("ssssabbcccdddd");
	
	}	
	
	
}