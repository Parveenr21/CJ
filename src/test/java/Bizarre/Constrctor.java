package Bizarre;
public class Constrctor {

	int a = 5;

	public Constrctor() {
		int a = 10;
	}

	public static void main(String... xxx) {

		Constrctor c = new Constrctor();
		System.out.println(c.a);

	}

}