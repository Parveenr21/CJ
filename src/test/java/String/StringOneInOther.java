package String;


class StringOneInOther{
	
	//This program tells if one string a is within string b and returns matched or not matched
	
	//just visualize substring overlapping the main string sliding from first to index till wher it goes till end
	
	
	public void exec(String a, String b)
	{
		int i=0,x=0;
	 int indexA=0, indexB=0;
		
		
	
		for (x=0;x<b.length()-a.length();x++)
					
		{
			
			if(a.equals(b.substring(x,x+a.length())))
			{
				indexA=x;
				indexB=10;
				break;		//without break it will pick the last one matching index
			}
			
			
			
		
		}
		
		if(indexB==10)
		{
			
			System.out.println("String A is with in String B with the index in string B as " + indexA);
		}
		
		else
		{
			System.out.println("String A is not found with in String B" );
		}
		
		/*
		for (x=0;x<a.length()-b.length();x++)
		{
			
			if(b.equals(a.substring(x, x+b.length()))==true)
			{
				System.out.println("matched");
			break;
			}
			else{
			if(x==a.length()-b.length()-1)
			{
				System.out.println("Not matched");
				break;
			}
			}
		}
		*/
		
	
		
		
		
	}
	
	
	
	



	public static void main(String ...ass)
	{
		StringOneInOther A=new StringOneInOther();
	A.exec("sss","aassssbssssssssssssssss");
	}
}