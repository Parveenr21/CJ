package Bizarre;
class SumB {

	static void fun(int a[][])

	{
		int x = 0, y = 0, i = 0, j = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++)

			{
				if (j == 0) {
					x = x + a[i][j];
				}

				if (i == a.length - 1) {
					y = y + a[i][j];
				}

			}

		}

		int d = 0;
		for (i = 0; i < a.length; i++) {
			d = d + a[i][i];

		}
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(d);

		System.out.println(x + y + d);

	}

	public static void main(String... as) {
		SumB.fun(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

	}

}