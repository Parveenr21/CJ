package String;
class StringWordCount{
	
	
	
	
	public void exec(String a)
	{
		int i=0,j=1;
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
		if(a.charAt(i)==' ')
		{
			j++;
			
		}
		}
		
		System.out.println(j);
		
	}
	
	
	
	public static void main(String ...ass)
	{
	
		StringWordCount A=new StringWordCount();
		A.exec("xyzx dasd adasd");
		}	
	
	
}