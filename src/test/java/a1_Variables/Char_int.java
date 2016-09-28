package a1_Variables;

class Char_int{
	
	
	//this program is PRITING ascii code of chars
	
	public void exec(char a)
	{
		
		 int ascii=a;

		 System.out.println(a);
System.out.println(ascii);
		
	}
	public static void main(String ...ass)
	{
	
		Char_int A=new Char_int();
		A.exec('a');
		A.exec('z');
		A.exec('A');
		A.exec('Z');
		
		//A.exec('aa'); //This is not a character constant ...its 2 chars in one string
		A.exec((char)0); //0 integer ascii code is null..no.. the casting is making int value loss
		A.exec('0');
		A.exec('9');
//		/A.exec('10');//This is not a character constant..Its a string

		
	
	}	
	
	
}