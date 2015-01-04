package Bizarre;
class Recursion {

	// Factorial program using recursion

	static int fun(int a) {
		int j, k;
		if (a == 1)
			return a;
		else {
			k = a - 1;
			j = a * fun(k);
			return j;
		}

	}

	public static void main(String... aaa)

	{
		int i = Recursion.fun(6);

		System.out.println(i);
	}
}
