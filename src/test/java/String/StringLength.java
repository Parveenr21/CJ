package String;

class StringLength{
	
	
	//this program is for counting string length
	
	public void exec(String a)
	{
		int i=0;
	
		a=a+'\0';   //java does not add '\0' after the String.. so we need to add it manually in the end of String
		
		for (i=0;a.charAt(i)!='\0';i++)
		{
			
		}
			
		System.out.println("no. of characters in the String " + i);
		
	}
	

						
		
	
	
	
	
	
	public static void main(String ...ass)
	{
	
		StringLength A=new StringLength();
		A.exec("asd");
	
	}	
	
	
}