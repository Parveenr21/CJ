package String;


class StringCharCount{
	
	
	//this program is to give u count of charactes without spaces in the given string
	
	public void exec(String a)
	{
		int i=0,j=0;
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
		if(a.charAt(i)!=' ')	//if string char is not equal to blank then increment the counter..else do not increment it
		{
			j++;
			
		}
		}
		
		System.out.println(j);
		
	}
	
	
	
	public static void main(String ...ass)
	{
	
		StringCharCount A=new StringCharCount();
		A.exec("xyzx dasd adasd");
		}	
	
	
}