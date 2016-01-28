package Puzzles;

import com.gargoylesoftware.htmlunit.javascript.host.Cache;

public class Anagram {

	//String "abcd" is given "bcad" is an anagram
	// single char can not be anagram
	//Here I am considering a char can be repeated.
	
	
	boolean agram(String s1,String s2)
	{
		//boolean flag=false;
		char temp[]= new char[255];
		
		if(s1.length()==0 ||s1.length()==1||(s1.length()!=s2.length()))
		{
			
			return false;
		}
		
		
		for(int i=0;i<s1.length();i++) //For String, its s1.length(), here length is method on String object
		{
			
			temp[s1.charAt(i)]++;	//Adding the value here
			temp[s2.charAt(i)]--;	//Deleting the value here.
			
		}
		
		for(int i=0;i<temp.length;i++) //For Array, its temp.length, here length is a class variable on Array Object.
		{
			if(temp[i]!=0)
			{
				return false;
			}
			
		}
		
		return true;
	}
	

public static void main (String ...ccc)
{
	
	System.out.println(	new Anagram().agram("lycos", "ycols"));
	System.out.println(new Anagram().agram("lycos", "yclols"));
	System.out.println(new Anagram().agram("lycos", "yscol"));
	System.out.println(new Anagram().agram("lycos", "yocls"));
	System.out.println(new Anagram().agram("lycos", "yocl"));
	System.out.println(new Anagram().agram("ly", "yl"));
	System.out.println(new Anagram().agram("ly", "l"));
	System.out.println(new Anagram().agram("ll", "ll"));

	
	
}

}



