package Bizarre;
class InsertionSort {

	static int[] sort(int a[]) {

		int i, j;
		int count = 0;
		for (i = 1; i < a.length; i++)

		{

			j = i;

			while (j > 0) {

				int temp = a[j];

				if (a[j - 1] > a[j]) {
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}
				j--;

				++count;
			}

		}

		System.out.println("inside for calling " + count);
		return a;

	}

	public static void main(String... xxx) {

		int SortedArray[] = sort(new int[] { 1, 5, 2, 77, 3, 1, 33, 1, 1, 5, 2,
				77, 3, 1, 33, 1 }); // Average case
		// int SortedArray[]=sort (new int[]{1,1,1,2,3,5,33,77}); //Best case
		// int SortedArray[]=sort (new int[]{77,33,5,3,2,1,1,1}); //WORST case

		int len = SortedArray.length;

		System.out.println("Array elemnets in sorted order by Insertion Sort");

		for (int i = 0; i < len; i++) {

			System.out.println(SortedArray[i]);
		}

	}

}