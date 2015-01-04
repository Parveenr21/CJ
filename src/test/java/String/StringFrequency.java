package String;


class StringFrequency {
	
	
	
public void exec(String a)
{
	int i=0,k=0,l=0;
	int b[]=new int[10];
	char j;
	
	
	
	for (l=0;l<a.length();l++)
	{
	
		j=a.charAt(l);
	
		for (i=l;i<a.length();i++)
	{
	if (j!=a.charAt(i))	
	{
	b[k]=b[k]+i-l;
    k++;
    l=i;
    break;
	}
	if (j==a.charAt(a.length()-1))
	{
	b[k]=b[k]+i-l;
	}
	}
	
	}	
	
	
	for (i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
}
	
	
	
	
	
	public static void main(String ...assas)
	{
		StringFrequency A=new StringFrequency();
		A.exec("aaaaa");
		
	}
	
	
}