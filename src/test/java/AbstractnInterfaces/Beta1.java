package AbstractnInterfaces;

class Beta1 extends Baap {

	int inter_instance = 50;
	static int inter_static = 500;

	void beta1_method() {

		System.out.println("BETA 1 method");

	}

	@Override
	void baap_method() {

		System.out
				.println("BETA 1 has overridden the baao method name baap_method");
	}

}