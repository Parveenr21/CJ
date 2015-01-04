package String;
class StringVowel{
	
	
	//this program is char counting without spaces
	
	public void exec(String a)
	{
		int i=0,j=0;
		
		for (i=0;i<a.length();i++)
		{
		
			//String test=a.substring(0,5);
						//String z=new String(x);
			
			if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||
					a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')
			{
				j++;
			}
				}
		
		
		System.out.println(j);
				
	}
	public static void main(String ...ass)
	{
	
		StringVowel A=new StringVowel();
		A.exec("                   n       itabcddcbatin          O       ");
	
	}	
	
	
}