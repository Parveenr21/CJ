package String;


class StringReplaceMatches{
	
	
	
	void exec(String a, String b, String c){
		
		
		
		int i=0,x=0;
		 int indexA=0, indexB=0;
		 
		 int len=b.length()-a.length()+c.length();
		 char finarr[] = new char[len];	
			
		//This is the logic to first finding a string in another and with in that we are replacing that with  one more string 
			for (x=0;x<b.length()-a.length();x++)
						
			{
				
				finarr[x]=b.charAt(x);
				
				if(a.equals(b.substring(x,x+a.length())))
				{
					indexA=x;
					indexB=10;
					int zz=x;
				//once we get the matched string a in b then we are simply adding new string after that
					for(i=0;i<c.length();i++)
					{
					finarr[zz]=c.charAt(i);
					++zz;
					}
					
					//then from that index to last index of b string we are adding it to new array
					for(i=0;i<b.length()-a.length()-x;i++)
					{
					finarr[zz]=b.charAt(x+a.length()+i);
					++zz;
					}
					
					break;		//without break it will pick the last one matching index
														
				}
				
				
				
				
				
				
				
				
			
			}
			

			
		
			
	System.out.println();
			
			
			if(indexB==10)
			{
				
				System.out.println("String A is with in String B with the index in string B as " + indexA);
				
				for (i=0;i<finarr.length;i++)
				{
					System.out.print(finarr[i]);
					
				}
				
			}
			
			else
			{
				System.out.println("String A is not found with in String B" );
			}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String ...xxx)
	
	{
		
StringReplaceMatches srm = new StringReplaceMatches();
srm.exec("pomegranate", "applepomegranategrapes","banana");
		
		
		
		
		
	}
	
	
	
	
	
	
}