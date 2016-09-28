package Quiz;

import java.util.Arrays;

public class IntArrayReverse {


	
	//char ca1[] = new char[100];
	
	static char ca1[] = {'1','2','3','4','5','6'};
	
	public static void main(String ...vvv)
	{
		
		
		
		
		//the below code will not work as this works only with the non array datatype
		//System.out.println(ca1.toString());
		
		//System.out.println(Arrays.toString(ca1));
		
		
		
		
		int j=1;
		
		for (int i=0;i<(ca1.length)/2;i++ ,j++)
		{
			
			ca1[i]=(char) (ca1[i]+ca1[(ca1.length)-j]);
			
			
			ca1[(ca1.length)-j]=(char) (ca1[i]-ca1[(ca1.length)-j]);
		
			ca1[i]=(char) (ca1[i]-ca1[(ca1.length)-j]);
		}
		
		

		
		System.out.println(Arrays.toString(ca1));
		System.out.println(new String(ca1));
		
		/*
		 * 
		 * Arrays.toString(ca1)
		 * 
		 * This apis is used to convert any array to string ..NO... this is printing contents of ARRAY like [a,b,c] and not the string like abc
		 * 
		 * so correct api is String s = new String(char array[])
		 * 
		 */

	
		
	}
	
}
