package a1_Variables;
class Charprint {
	public static void main(String args[]) {
	char ch1;
	ch1 = 88; // code for X

	//chars in java ascii value from 0 to 65536
	//No non-negative number to represent ASCII for chars

		int ich1=ch1;
		System.out.println(ch1);		//printing char value of 88  which is X
		System.out.println(ich1); //printing int value of 88 whic is  88

		//byte 1
		//short 2
		//int 4
		//long 8

		//char 2

		//float 4
		//double 8

		int i=88;

	byte x=(byte)1000;
	System.out.println(x);

	//integer literal can easily asign to byte and short uptil it fits in the size of those
	
	//other wise 10 is direct by default int literal.. for long literal its 10l
	//3.2 is by default double literal.. for float literal .. its should be written as 10.5f/F..explixitly 
	//specifying double literal would be 10.5d/D
	//Boolean literals are true/false
	//char literals 'c'
	//String literals  "string", "firstline\nsecondline", "\"QUOTES\""
	int ch2 = 'Y';
	System.out.print("ch1 and ch2: ");
	System.out.println(ch1 + " " + ch2);
	System.out.println((char)i);
	
	int aa=202;
	char cc=202;  //here it is direct unicode value that is passed
	
	int a=15;//here int 15 is getting stored in 32 bit binary
	//int a means . this 15 should stored in 32 bit binary
	char b=15; //her 15 from 0-65536 range is going to be stored in 16 bit binary
	//char b means this 15 should be stored in 
	System.out.println(a);
	System.out.println((int)b);
	System.out.println(x);
	System.out.println("firstline\nsecondline");
	System.out.println((char)aa);
	System.out.println(cc);
	
	char a1='1'; //here 1 is storing as a character constatnt
	
	
	System.out.println((int)a1);

	
	
	
	//Char c=10// this means char range is 0 to 65536 .. so 10 will be picked and when we will print it char corrpsonding to 10 willbe printed
	//int c=10//this means int range -xxx to +xxx so 10 will be printed as int
	
	}
	}