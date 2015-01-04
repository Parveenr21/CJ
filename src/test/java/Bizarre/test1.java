package Bizarre;
class test1 {

	// this program is priting ascii code of chars

	public void exec(char a) {

		int ascii = a;

		System.out.println(ascii);

	}

	public static void main(String... ass) {

		test1 A = new test1();
		A.exec('a');
		A.exec('z');
		A.exec('A');
		A.exec('Z');

		// A.exec('aa'); //This is not a character constant

		A.exec('0');
		A.exec('9');
		// A.exec('10');//This is not a character constant

	}

}