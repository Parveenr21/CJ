package a1_Variables;

class Doubleeeeee {


	//&  and  |  are bit wise operators .. works on bits and both ("here we do this on variables value") are evaluated ..here
	//java bitwise operators can be applied to byte, short, int, long and char and not on char and float and double datatypes

	//hre we do it like (a|b)
	//int number1 = 12, number2 = 25, result;
	// result = number1 | number2;
	//BITWISE operators basically work on integers and these are not logical operators.


	// && and || are logical operators and here first expression is evaluated and if needed then only second epxression is evaluated
//This is also call short circuit operators.. (here we do it on expression such that  TRUE|| TRUE or FALSE&& FALSE)

	public static void main(String args[]) {
		float pi, r, a;
		r = (float) 10.8; // radius of circle
		//here casting to float is done because by default
		//floating literals are double
		pi = (float) 3.1416; // pi, approximately
		a = pi * r * r; // compute area
		System.out.println("Area of circle is " + a);

		if ((int)a==366 & r>10)  //& and && both works for the boolean operations
		//when we use normal & and | then both the expressions are evaluated
		//& and | are bitwise operators and works on bit

		// for boolean.. it works on true and false values..but even if first expression is true . second one will be evelauated.


		//when we use short circuit operators i,.e && and || then only the very first one is evalauted and as per the need the
		//second part gets evaluated
		{
			System.out.println("Area of circle is " + a);

			int aa=4;
			int bb=4;

			//
			//Here this BITWISE operators also work on boolean
			if(aa>2|bb>30)

			{
				System.out.println("INSIDE bitwise");

			}

		}
	}
}