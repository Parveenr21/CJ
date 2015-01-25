package String;
class StringLtrim{
	
	
	//this program is char counting without spaces
	
	public void exec(String a)
	{
		int i=0,j=0;
		boolean k;
			
		//char[]abc=a.toCharArray();  //create array of characters
		//for array of intergers use int intarray[] = new int[sarray.length]; then 
		//for (int i = 0; i < sarray.length; i++) {
		//
		//intarray[i] = Integer.parseInt(sarray[i]);
		//
		//} check on net also

		//for (i=0;(abc[i]!='\0');i++)
		//for (i=0;i<a.length();i++)
		//for (i=0;i<abc.length;i++)
		//char z=a.charAt(0);  function to traverse string

		for (i=0;i<a.length();i++)
		{
		
			//String test=a.substring(0,5);
				
		//String z=new String(x);
			if(a.charAt(i)!=' ')
			{
				break;
			}
			
	}
		
		int t=a.length()-i;
		char zz []=new char[t];
		
		for (;i<a.length();i++)
		{
			System.out.print(a.charAt(i));
			zz[j]=a.charAt(i);
	j++;	
		}
	  
		String as = new String(zz);
		System.out.println();
		System.out.println(as);
		
		
	}
	public static void main(String ...ass)
	{
	
		StringLtrim A=new StringLtrim();
		A.exec("                   n       itabcddcbatin");
	
	}	
	
	
}