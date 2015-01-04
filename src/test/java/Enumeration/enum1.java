package Enumeration;

//enum class with name enum1, but can not instantiate this using new operator

enum enm1{

	//public static and final variable of enum type like reference variables

	Apple,Orange,Grape,Mango,PineApple

}


class enum1{



	public static void main(String ...xxx)


	{
		enm1 e;		//This creates variable of type enm1 which is enum class	


		e=enm1.Apple;	//intializing e enm1 variable with enm1 apple value.
		e=enm1.Orange;

		System.out.println(e);

		System.out.println(enm1.Apple);

		String fruit = enm1.Apple.name();
		String fruit1= enm1.Apple.toString();	//enum type variable can be converted to string or any other data type

		System.out.println(fruit);
		System.out.println(fruit1);


		enm1.values();	//this will return all the enum variable values in an array
		System.out.println("*********");
		enm1 x[] = enm1.values();

		for(int i=0;i<x.length;i++)
		{

			System.out.println(x[i]);
		}

		System.out.println("*********");

		//This is new for loop introduced from 1.5 onwards ..FOR EACH VERSION of loop


		/*here iteration gets automatic without needing increment counter
		here the first variable should be of the second array type.. so in each iteration the value of array gets pased to that
		variable and we can use that 
		 */

		for(enm1 k : x)		 	//x is enm1 type array so it is passing its value one by one to k in each iteration
		{

			System.out.println(k);

		}



		//Two enum variables value can be compared with == operator as we are comapring references


	}







}