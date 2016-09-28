package AbstractnInterfaces;

class Beta2 extends Baap {

	int inter_instance = 60;
	static int inter_static = 600;

	void beta2_method() {

		System.out.println("BETA 2 method");

	}

	@Override
	
	
	/*
	 * 
	 * When we use @Override annotation to a method, it let compiler know that we are overriding it from super class. 
	 * It is not mandatory to use @Override when you override a method.
	 *  Incase you are using @Override annotation, and the method signature is not found at super class will results compilation error. 
	 *  - See more at: http://www.java2novice.com/java-annotations/override/#sthash.8GfQpUya.dpuf
	 * 
	 */
	
	
	/*
	 * Annotation is Metadata. Metadata is data about data. So Annotations are metadata for code. 
	 * 
	 *  Annotations are only metadata and they do not contain any business logic. 
	 * 
	 */
	void baap_method() {

		System.out
				.println("BETA 2 has overridden the baao method name baap_method");
	}

}