package Puzzles;

public class FrequencyCount {

	//count of occurrence of characters in String
	//  "abcasderaadd  asdf "  
	
	
	void charCountWithCharALL(String s1)
	{
		
		
		char cnt1[] = new char[255]; //having space for new 255 char
		
		//cnt1[] Its for storing the frequency of character while the index is the actual character
		
		
		for(int i=0;i<s1.length();i++)
		{
			cnt1[s1.charAt(i)]++;
		}
		

		for(char i=0;i<cnt1.length;i++)
		{
			System.out.print("character   " + i + "    has the occurence");		
			System.out.println((int)cnt1[i]);		

		}
		
	}
	
	
	int charCountForSingleChar(String s1, char c1)
	{
		
		char cnt1[] = new char[255]; //having space for new 255 char
		
		//cnt1[] Its for storing the frequency of character while the index is the actual character
		
		
		for(int i=0;i<s1.length();i++)
		{
			cnt1[s1.charAt(i)]++;
			System.out.println(cnt1[s1.charAt(i)]);

			//here the counts are printed.. but when we are setting cnt1[]  as char.. then nothing is printing
			//Either have int array or have char array but to print CAST it as int
		}
		
	
		return cnt1[c1];
	}
	
	
	
	void charCountWithChar(String s1)
	{
		
		char cnt1[] = new char[255]; //having space for new 255 char
		
		//cnt1[] Its for storing the frequency of character while the index is the actual character
		
		
		for(int i=0;i<s1.length();i++)
		{
			cnt1[s1.charAt(i)]++;

			
		}
		
		for(char i=0;i<cnt1.length;i++)
		{
			if(cnt1[i]>0)		//Printing only where count is greater than 1
			{
				System.out.print("character   " + i + "    has the occurence");		
				System.out.println((int)cnt1[i]);		

				
			}
			
		}
		
		
	
	}
	
	
	
	
	public static void main(String ...ccc)
	{
	
		String s1="abcasderaadd  asdf abcas a deraadd  asdf a";
		//System.out.println(new FrequencyCount().charCountForSingleChar(s1, 'a'));
		//new FrequencyCount().charCountWithCharALL(s1);
		new FrequencyCount().charCountWithChar(s1);
		
	}
	
	
	
}
