package Puzzles;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PalindromesAllSubstring {




	public  Set<String> substring(String str) {

		int len = str.length();
		Set<String> substringSet=new TreeSet<String>();

		int i=0,j;
		String temp;


		for(i=0;i<len;i++)
		{
			for(j=i+3;j<len+1;j++)
			{

				temp=str.substring(i,j);

				substringSet.add(temp);



			}
		}




		return substringSet;

	}

	public static boolean isPalindrome(String str) {
		int len = str.length();

		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) 
			{
				return false;
			}

		}
		return true;  

	}



	public static void main(String ...ccc)
	{

		Set<String> substrings = new TreeSet<String>();
		//System.out.println(		new PalindromesAllSubstring().isPalindrome("abba"));
		//abcbabba

		substrings=new PalindromesAllSubstring().substring("abcbabba");


		for(String str:substrings )
		{
			System.out.println("Sub String is   "+ str);
			System.out.println(isPalindrome(str));
		}


	}

}
