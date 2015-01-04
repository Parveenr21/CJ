package String;
class StringTriangle2{
	
	
	
	public void exec(String a)
	{
		int i=0,x=0;
	int k[]=new int[26];
		char j,m;
		String c;
		boolean boo;
	
		for (x=0;x<a.length();x++)
		{

			for (i=0;i<x;i++)
			{
				
			System.out.print(" ");
			}
			System.out.println(a.substring(x,a.length()));
		}
	
		
		
		
	}
	
	
	
	



	public static void main(String ...ass)
	{
		StringTriangle2 A=new StringTriangle2();
	A.exec("FARZI");
	}
}