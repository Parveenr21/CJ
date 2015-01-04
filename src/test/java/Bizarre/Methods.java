package Bizarre;
public class Methods {

	int nonSTATIC = 10;
	static int sTATIC = 100;

	public static void getMethodSTATIC() {

		System.out.println("Value of static variable" + sTATIC);

	}

	public static void setMethodSTATIC(int a) {

		sTATIC = a;

	}

	public void getMethodNonSTATIC() {

		System.out.println("Value of NON static variable" + nonSTATIC);

	}

	public void setMethodNonSTATIC(int a) {

		nonSTATIC = a;

	}

}