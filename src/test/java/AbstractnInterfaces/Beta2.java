package AbstractnInterfaces;

class Beta2 extends Baap {

	int inter_instance = 60;
	static int inter_static = 600;

	void beta2_method() {

		System.out.println("BETA 2 method");

	}

	@Override
	void baap_method() {

		System.out
				.println("BETA 2 has overridden the baao method name baap_method");
	}

}