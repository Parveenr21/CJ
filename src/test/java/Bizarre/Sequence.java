package Bizarre;
class Sequence {

	// this program is char counting without spaces

	public void exec(String a) {
		int i = 0, sj = 0, m = 0, jj = 0, x = 0, old = 0;
		char j;
		int k[] = new int[20];

		for (jj = 0; jj < a.length();) {

			j = a.charAt(jj);
			for (i = jj; i < a.length(); i++) {

				if (j != a.charAt(i)) {
					k[m] = i - jj;
					jj = i;
					m++;
					break;
				}
				if (i == (a.length() - 1)) {
					k[m] = i - jj + 1;
					jj = jj + i + 1;
				}

			}
		}

		for (i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}

	}

	public static void main(String... ass) {

		Sequence A = new Sequence();
		A.exec("aaazzzzzzppoooooooooo");

	}

}