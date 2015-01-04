package String;


class StringBooleanPalindrome{
	
	
	//This program results in true/false if the passed string is a palindrome
	
	public boolean exec(String a)
	{
		int i=0,j=0;
		boolean k;
		char x [];
	
		
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
	
		
		for (i=0;i<a.length()/2;i++)	//run loop less than half
		{
		
		
		if(a.charAt(i)!=a.charAt(a.length()-i-1))	//here we are checking (1st-i)th char and (last-i)th char
				{
		
			j++;
			break;
		}
		
		
		
		}	
		
		

	if(j>0)
	{
		
		return false; 
	}
	else{
		
		return true;
	}
	
	}
	public static void main(String ...ass)
	{
	
		StringBooleanPalindrome A=new StringBooleanPalindrome();
		boolean boo= A.exec("poasaop");
	System.out.println(boo);	
	}	
	
	
}