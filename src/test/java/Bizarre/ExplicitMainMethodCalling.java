package Bizarre;
public class ExplicitMainMethodCalling {

	static int x = 0;

	public static void main(String... cc) {

		System.out.println("main called ");

		if (x < 1) {
			++x;
		//	new test4().fun();
			// ++x this statement will never be called
		}
	}

	void fun() {

		main();

	}

}
