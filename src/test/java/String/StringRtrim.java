package String;

class StringRtrim{
	
	
	//this program is about trimming right end or trailing spaces from the String
	
	//Although it is implemented by having the new String as String is immutable in JAVA
	
	public void exec(String a)
	{
		int i=0,j=0;
		
			
			for (i=a.length()-1;i>=0;i--)
		{
		
			if(a.charAt(i)!=' ')
			{
				break;
			}
			
	}
	
		
			StringBuffer strb= new StringBuffer(a);
			String str2=strb.substring(0,i);
			
			
			System.out.print(str2); //using String buffer
		
			
			System.out.print(a.substring(0, i));			//usig String.. as we get the String index..just get the Substring
			
		char zz []=new char[i+1]; //3rd appraoch by Char array
		
		for (j=0;j<=i;j++)
		{
			System.out.print(a.charAt(j));
			zz[j]=a.charAt(j);

		}
	  
		//String S1 = new String(zz);			//passing character array to String constructor
		//String S2=zz.toString();			//directly using toString method
		
		
	}
	public static void main(String ...ass)
	{
	
		StringRtrim A=new StringRtrim();
		A.exec("   jjn dasdasdasd adasdasdasd           ");
	
	}	
	
	
}