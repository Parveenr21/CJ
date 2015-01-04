package Quiz;

public class StringBufferReversal {


	public static void main(String ...ccc)
	{


		new StringBufferReversal().foo("Please reverse this string");

	}



	public void foo(String test)
	{


		StringBuffer sb = new StringBuffer();

		sb.append(test);

		/*String buffeer has two main apis
		1. Sb.reverse()
		2. sb.replace(beginindex, endindex, NewSTRING)

		other wise we can have 2 ways to put string to a String buffer
		1. default constructor

			StringBuffer sb = new StringBuffer();
			sb.append(test);


			2. Paramterized constructor

			StringBuffer sb = new StringBuffer(test); //here we can pass string, char array and even char sequence.
		
		 *
		 *
		 *
		 *  sb.setCharAt(index, char);
			sb.charAt(index)
		
		 *
		 *
		 */

		
		
		
		
		
		
	}

}
