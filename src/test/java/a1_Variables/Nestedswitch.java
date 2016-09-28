package a1_Variables;

class Nestedswitch{
	int i;
	
	
	public static void main(String ...xxx)
	{
	//default clause is not mandatory here...its a nested switch..
		
		//within a case statement we can write switch.
	
		
		int i=2,j=1;
		switch(i)
		{
		case 1:
			
		case 2:
			
			switch(j)
			{
		case 1:
			System.out.println("PPPPPPPP");
			
			break;
		case 2:
			System.out.println("XXXXXX");
		break;
			}
		case 3:
		
		
		System.out.println("YYYYYYYYYYYYYY");
		break;
		}
			
		
	
	
	
	}	
}
