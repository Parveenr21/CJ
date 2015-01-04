package String;


class StringReverse{
	
	
	//this program is char counting without spaces
	
	
	
	//This exec function uses the String to be stored in an array while traversing from end.
	public void exec(String a)
	{
		int i=0,j=0;
		char x [];
		int y=a.length();
		x=new char [y];
	
		for (i=a.length()  - 1;i>=0;i--)
		{
		
		{
		x[j]=a.charAt(i);	
		j++;	
		}
		}
		
		String z=new String(x);
		
		System.out.println(z);
		

	
	}
	
	
	//this method will reverse the existing String using String buffer
	public void exec1(String x)
	{
		
		
		StringBuffer str = new StringBuffer(x);

		//str.reverse().toString(); //Approach 1 --StringBuffer direct has reverse apis and then convert to String.
		
		
		//Approach2 -- replace first and last characters of String buffer
		
	for (int i=0;i<x.length()/2;i++)
		{
			
			
		str.setCharAt(i, (char)(str.charAt(i)+str.charAt(x.length()-i-1)));
		str.setCharAt(str.length()-1-i, (char)(str.charAt(i)-str.charAt(str.length()-1-i)));
		str.setCharAt(i, (char)(str.charAt(i)-str.charAt(x.length()-i-1)));
		
			
		}
		
		

	System.out.println(str.toString());
		
		
		
		
		
		
	}
	
	
	public static void main(String ...asssss)
	{
	
		StringReverse A=new StringReverse();
		
		String sss= "xyzx dasd adasda";
		
		System.out.println("actual String is " + sss); 
		
		
		A.exec(sss);
		
		A.exec1(sss);
		
		}	
	
	
}