package Bizarre;
class Double_sort {

	static void sort(int a[][]) {

		// int b[][];
		// b=new int[1][1];
		int k, b;
		int i, j;

		for (k = a[1].length; k >= 1; k--) {
			for (i = 0; i < a.length; i++) {
				for (j = 0; j < a[i].length - 1; j++)

				{

					if (a[i][j] > a[i][j + 1]) {
						// b[0][0]=a[i][j];
						b = a[i][j];
						a[i][j] = a[i][j + 1];
						// a[i][j+1]=b[0][0];
						a[i][j + 1] = b;
					}

				}

			}
		}

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.println("value of " + "a[" + i + "}" + "[" + j + "]"
						+ "is" + a[i][j]);
			}
		}
	}

	public static void main(String... aaa) {
		Double_sort.sort(new int[][] { { 12, 3, 4, 5, 1, 2, 7 },
				{ 1, 2, 3, 1, 1, 55, 1, 1, 2, 3, 4, 6, 3, 333, 2 } });
	}

}