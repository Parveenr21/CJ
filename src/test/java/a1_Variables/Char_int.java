package a1_Variables;

class Char_int{
	
	
	//this program is PRITING ascii code of chars
	
	public void exec(char a)
	{
		
		 int ascii=a;

		 System.out.println(a);	//It will print value of a which is char
System.out.println(ascii);  //It will print value of ascii which is integer/
		
	}
	public static void main(String ...vla)
	{
	
		Char_int A=new Char_int();
		A.exec('a');
		A.exec('z');
		A.exec('A');
		A.exec('Z');
		
		//A.exec('aa'); //This is not a character constant ...its 2 chars in one string
		A.exec((char)0); //0 integer ascii code is null..no.. the casting is making int value loss
		A.exec('0');	// here 0 is character as well... which is actually alt key.. though not sure
		A.exec('9');
//		/A.exec('10');//This is not a character constant..Its a string


		double fx=5.7;
		if(fx>=5.5) System.out.println("Wooo");

	
	}	
	
	
}