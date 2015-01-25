package Bizarre;

class Break{
	int i;
	
	public Break Break(){  //see the implicit Break return type of constructor. its the same class type implicity the return type of constructor
		return new Break();
	}
	
	public Break(){
		
	int a=1/0;
	}
	
	public static void main(String ...xxx)
	{
	
		new Break();
		
		int i=0;
		
		for (i=0;i<10;i++)
			{
		{
		if (i==5)
			break;
	System.out.println(i);
			}
			
			}
	}
	
}
