package a1_Variables;


class OpeartorsAssociativity{
	
/*	Arithmetic Operators

//Assume integer variable A holds 10 and variable B holds 20 then:

+	Addition - Adds values on either side of the operator	 A + B will give 30
-	Subtraction - Subtracts right hand operand from left hand operand	 A - B will give -10
*	Multiplication - Multiplies values on either side of the operator	 A * B will give 200
/	Division - Divides left hand operand by right hand operand	 B / A will give 2
%	Modulus - Divides left hand operand by right hand operand and returns remainder	 B % A will give 0
++	Increment - Increase the value of operand by 1	 B++ gives 21
--	Decrement - Decrease the value of operand by 1	 B-- gives 19



	Relational Operators
	
	
	
	Operator	Description	Example
==	 Checks if the value of two operands are equal or not, if yes then condition becomes true.	 (A == B) is not true.
!=	 Checks if the value of two operands are equal or not, if values are not equal then condition becomes true.	 (A != B) is true.
>	 Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	 (A > B) is not true.
<	 Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.	 (A < B) is true.
>=	 Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.	 (A >= B) is not true.
<=	 Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.	 (A <= B) is true.
	
	

	Bitwise Operators


//java bitwise operators can be applied to byte, short, int, long and char
 * 
 * and not on char and float and double datatypes
 * 
 * Bitwise operator works on bits and perform bit by bit operation. Assume if a = 60; and b = 13; Now in binary format they will be as follows:

a = 0011 1100

b = 0000 1101			//although it has to be 16 bit format .. and here we specified only 8 bits

&	 Binary AND Operator copies a bit to the result if it exists in both operands.	 (A & B) will give 12 which is 0000 1100
|	 Binary OR Operator copies a bit if it exists in eather operand.	 (A | B) will give 61 which is 0011 1101
^	 Binary XOR Operator (xclusive OR) copies the bit if it is set in one operand but not both.	 (A ^ B) will give 49 which is 0011 0001
~	 Binary Ones Complement Operator is unary and has the efect of 'flipping' bits.	 (~A ) will give -60 which is 1100 0011
<<	 Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.	 A << 2 will give 240 which is 1111 0000
>>	 Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.	 A >> 2 will give 15 which is 0000 1111
>>>	 Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.	 A >>>2 will give 15 which is 0000 1111

binary shift operators simply shifts to the right or left.how much depends on the operand. they are just simple. and the new values are replaced by 0




//check byte with bitwise opeartion with byte results in byte or int.



	Logical Operators




&&	 Called Logical AND operator. If both the operands are non zero then then condition becomes true.	 (A && B) is false.
||	Called Logical OR Operator. If any of the two operands are non zero then then condition becomes true.	 (A || B) is true.
!	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	 !(A && B) is true.










	Assignment Operators



=	Simple assignment operator, Assigns values from right side operands to left side operand	 C = A + B will assign value of A + B into C
+=	Add AND assignment operator, It adds right operand to the left operand and assign the result to left operand	 C += A is equivalent to C = C + A
-=	Subtract AND assignment operator, It subtracts right operand from the left operand and assign the result to left operand	 C -= A is equivalent to C = C - A
*=	Multiply AND assignment operator, It multiplies right operand with the left operand and assign the result to left operand	 C *= A is equivalent to C = C * A
/=	Divide AND assignment operator, It divides left operand with the right operand and assign the result to left operand	 C /= A is equivalent to C = C / A
%=	Modulus AND assignment operator, It takes modulus using two operands and assign the result to left operand	 C %= A is equivalent to C = C % A
<<=	Left shift AND assignment operator	 C <<= 2 is same as C = C << 2
>>=	Right shift AND assignment operator	 C >>= 2 is same as C = C >> 2
&=	Bitwise AND assignment operator	 C &= 2 is same as C = C & 2
^=	bitwise exclusive OR and assignment operator	 C ^= 2 is same as C = C ^ 2
|=	bitwise inclusive OR and assignment operator	 C |= 2 is same as C = C | 2


	Misc Operators
	
	Ternary operators.... Conditional opearators
	
	variable x = (expression) ? value if true : value if false
Following is the example:

public class Test {

   public static void main(String args[]){
      int a , b;
      a = 10;
      b = (a == 1) ? 20: 30;								//here we do not need to write "IF" here ..automatically .. the comparison happens
      														//actually its a condition..we write "IF" for condition to check.. otherwise   a==1 will return true or false 
      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
   }
}
This would produce following result:

Value of b is : 30
Value of b is : 20




Instance of Operators:---The operator checks whether the object is of a particular type(class type or interface type).

String name = = 'James';
boolean result = name instanceOf String;  
// This will return true since name is type of String



e.g. reference instanceof Class_nameA 

//this returns true or false
 * 
 * Vehicle a = new Car();
      boolean result =  a instanceof Car;
      System.out.println( result);
      
      O/P true
	
	
	
	
	if (source instanceof Button) {
    //...
} else {
    //...
}



interface Domestic {}
class Animal {}
class Dog extends Animal implements Domestic {}
class Cat extends Animal implements Domestic {}
Imagine a dog object, created with Object dog = new Dog(), then:

dog instanceof Domestic // true - Dog implements Domestic			//instance of will return true for all the parent class and Interfaces
dog instanceof Animal   // true - Dog extends Animal
dog instanceof Dog      // true - Dog is Dog
dog instanceof Object   // true - Object is
	
	
	*
	*/
	
	
	public static void main(String ...ccc)
	{
		
		new OpeartorsAssociativity().workingMethod();
		
	}
	
	

	public void workingMethod(){
		
		
		
		
		/*
		 * 
		 * PRECEDENCE
		 * 
		 * 
		 * 
		 * Postfix 	() [] . (dot operator)	Left to right 
Unary 	++ - - ! ~	Right to left 
Multiplicative  	* / % 	Left to right 
Additive  	+ - 	Left to right 
Shift  	>> >>> <<  	Left to right 
Relational  	> >= < <=  	Left to right 
Equality  	== != 	Left to right 
Bitwise AND 	& 	Left to right 
Bitwise XOR 	^ 	Left to right 
Bitwise OR 	| 	Left to right 
Logical AND 	&& 	Left to right 
Logical OR 	|| 	Left to right 
Conditional 	?: 	Right to left 
Assignment 	= += -= *= /= %= >>= <<= &= ^= |= 	Right to left 
Comma 	, 	Left to right 
		 * 
		 */
		
		
		
		
	}
	
}