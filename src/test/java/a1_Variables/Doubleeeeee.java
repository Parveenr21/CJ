package a1_Variables;

class Doubleeeeee {
	
	
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
			
	}
	}
	}