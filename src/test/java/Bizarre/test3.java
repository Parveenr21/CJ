package Bizarre;
class test3 {

	int fun() {

		return 5;
	}

	int foo() {

		return fun();
	}

	public static void main(String... ccc) {

		System.out.println(new test3().fun());
		System.out.println(new test3().foo());

	}

}