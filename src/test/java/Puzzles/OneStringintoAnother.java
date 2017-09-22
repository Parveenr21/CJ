package Puzzles;

public class OneStringintoAnother {







	static boolean foo(String s1, String s2)
	{

		boolean flag=true;


		int i=0,j=0;



		for(i=0,j=0;i<s2.length();i++,j++)
		{



			if(j==s1.length())
			{
				return true;
			}



			//This statement is also fine

			//if(s1.charAt(j)!=s2.charAt(i))...also note that length comparison would always be first

			if(i>=(s2.length()-s1.length()))  //IF index goes greater than difference then return false
			{
				return false;

			}





			if(s1.charAt(j)!=s2.charAt(i)) //&& condition to not traverse beyong string length index
			{

				j=-1;
			}



		}




		return false;		

	}



	public static void main(String ...ccc)
	{

		String s1="cows";
		String s2="dsfsdfdsfdscowsdfdsf";

		System.out.println(foo(s1,s2));

	}

}
