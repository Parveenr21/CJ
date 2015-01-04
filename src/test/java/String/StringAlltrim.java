package String;


class StringAlltrim{
	
	
	//this program is char counting without starting and trailing spaces .. means trim function implementation
	
	public void exec(String a)
	{
		int i=0,j=0;
		
		for (i=0;i<a.length();i++)
		{
		
			//String test=a.substring(0,5);
				
		//String z=new String(x);
			if(a.charAt(i)!=' ')		//it will give index i which is first non blank index
			{
				break;
			}
			
	}
		
		
		System.out.println("value of i   " + i);
		
		
		for (j=a.length()-1;j>=0;j--)
		{
		
			//String test=a.substring(0,5);
				
		//String z=new String(x);
			if(a.charAt(j)!=' ')	//it will give index j which is last non blank index
			{
				break;
			}
			
	}
		
		
		System.out.println("value of j   " + j);
	
		char ab []=new char [j-i+1];			//new array to store new String
	
		
		int k=0,l=0;	
		for (k=i;k<=j;k++)
		{
			//System.out.print(a.charAt(k));		//storing characters from fist string to new char arracy
			ab[l]=a.charAt(k);
			l++;
			
	}
		
	
		
		//Printing characters from the newly created character array
		
		System.out.println();
		for (l=0;l<ab.length;l++)
		{
			//System.out.print(ab[l]);
		}

		
	  //String sss=ab.toString();
		//String sss1=String.valueOf(ab);//it can also convert any data type array to String
		
		String sss2 = new String(ab); //it can also convert any data type array to String
		
		

	
		System.out.println();
		System.out.println(sss2);
		
		
	}
	public static void main(String ...ass)
	{
	
		StringAlltrim A=new StringAlltrim();
		A.exec("                   n       itabcddcbatin                 ");
	
	}	
	
	
}