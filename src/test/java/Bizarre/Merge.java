package Bizarre;
class Merge {

	static void sort(int a[], int b[])

	{
		int c[];
		int z = a.length + b.length;
		c = new int[z];
		int i;
		for (i = 0; i < a.length; i++) {
			c[i] = a[i];

		}

		for (i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];

		}

		int d;
		for (; z >= 0; z--) {
			for (i = 0; i < c.length - 1; i++) {

				if (c[i] > c[i + 1]) {
					d = c[i];
					c[i] = c[i + 1];
					c[i + 1] = d;

				}

			}
		}
		for (i = 0; i < c.length; i++) {

			System.out.println("Element" + i + "is" + c[i]);
		}

	}

	public static void main(String... aaaa) {
		Merge.sort(new int[] { 1, 5, 3, 42 }, new int[] { 3, 0, 44, 2 });

	}

}