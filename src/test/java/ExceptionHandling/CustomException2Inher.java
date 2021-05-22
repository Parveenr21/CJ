

package ExceptionHandling;


class CustomException2Inher extends CustomException1{			//It should extend the throwable..as only then other methods of throwable wil come to this class




	public static void main(String ...xxxx){


		try{
			throw new CustomException1();
		}
		catch(CustomException1 e){

			System.out.println("exceptin 1 caught");


		}
		catch (Exception e)
		{
			System.out.println("exception catught normal");
		}
	}


}



/*The version of toString( ) defined by Throwable
(and inherited by Exception) first displays the name of the exception followed by a colon, which
is then followed by your description. By overriding toString( ), you can prevent the exception
name and colon from being displayed. This makes for a cleaner output, which is desirable in
some cases.
*/