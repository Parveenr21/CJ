package AbstractnInterfaces;

class Baap extends Dada {

	int inter_instance = 20;
	static int inter_static = 200;


	void baap_method() {

		System.out.println("BAAP method");

	}

	@Override
	void dada_method() {

		System.out.println("BAAP has overridden this method named dada_method");

	}


	void farzi(int x, int y){


	}

}