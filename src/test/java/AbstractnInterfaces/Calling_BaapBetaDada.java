package AbstractnInterfaces;

class Calling_BaapBetaDada {

	public static void main(String... cccc)

	{

		Dada d = new Dada();
		Dada d_baap = new Baap();
		Dada d_beta1 = new Beta1();
		Dada d_beta2 = new Beta2();
		Dada d_beta3 = new Beta3();

		Baap bp = new Baap();
		Baap bp_beta1 = new Beta1();
		Baap bp_beta2 = new Beta2();
		Baap bp_beta3 = new Beta3();

		Beta1 b1 = new Beta1();
		Beta2 b2 = new Beta2();
		Beta3 b3 = new Beta3();

		// dada to dada

		System.out.println("d.inter_instance" + d.inter_instance); // here
																	// always
																	// dada
																	// variables
																	// value..get
																	// pritned..
																	// because
																	// overidding
																	// does not
																	// happen
																	// for
																	// variables
		System.out.println("d.inter_static" + Dada.inter_static);// here always
																	// dada
																	// variables
																	// value..get
																	// pritned..
																	// because
																	// overidding
																	// does not
																	// happen
																	// for
																	// variables
		d.dada_method();

		// dada to baap

		System.out.println("d_baap.inter_instance" + d_baap.inter_instance);// here
																			// always
																			// dada
																			// variables
																			// value..get
																			// pritned..
																			// because
																			// overidding
																			// does
																			// not
																			// happen
																			// for
																			// variables
		System.out.println("d_baap.inter_static" + Dada.inter_static);// here
																		// always
																		// dada
																		// variables
																		// value..get
																		// pritned..
																		// because
																		// overidding
																		// does
																		// not
																		// happen
																		// for
																		// variables
		d_baap.dada_method();

		// dada to beta1

		System.out.println("d_beta1.inter_instance" + d_beta1.inter_instance);// here
																				// always
																				// dada
																				// variables
																				// value..get
																				// pritned..
																				// because
																				// overidding
																				// does
																				// not
																				// happen
																				// for
																				// variables
		System.out.println("d_beta1.inter_static" + Dada.inter_static);// here
																		// always
																		// dada
																		// variables
																		// value..get
																		// pritned..
																		// because
																		// overidding
																		// does
																		// not
																		// happen
																		// for
																		// variables
		d_beta1.dada_method();

		// Bapp to Baap

		System.out.println("bp.inter_instance" + bp.inter_instance); // variable
																		// of
																		// baap
																		// naturally
																		// as
																		// its
																		// reference
																		// variable..
		System.out.println("bp.inter_static" + Baap.inter_static);

		bp.dada_method(); // its overriden method of dada is called obviosuly
		bp.baap_method(); // here baap alone method

		// Baap to Beta1

		System.out.println("bp_beta1.inter_instance" + bp_beta1.inter_instance); // variable
																					// of
																					// baap
																					// naturally
																					// here
																					// also..
		System.out.println("bp_beta1.inter_static" + Baap.inter_static);

		bp_beta1.dada_method(); // its overriden method of dada is called
		bp_beta1.baap_method(); // here overriddeb method of baap

		// Beta to Beta1

		System.out.println("b1.inter_instance" + b1.inter_instance); // Beta1
																		// variables
		System.out.println("b1.inter_static" + Beta1.inter_static); // Beta1
																	// variables

		b1.dada_method(); // dada overridden methods latest from child
		b1.baap_method(); // baap overridden method latest from baap
		b1.beta1_method(); // beta method

	}

}