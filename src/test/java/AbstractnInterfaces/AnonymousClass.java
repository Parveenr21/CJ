package AbstractnInterfaces;

class AnonymousClass {
	public static void main(String[] args) {

		/*
		 * Anonymous class is defined and instantiated in single step so that it
		 * can not be used later on
		 * 
		 * it is generally to provide a new functionality on the fly to an
		 * existing class.and that too with the help of overridden method and
		 * not with the help of new method.
		 */

		// SYNTAX FOR ANONYMOUS CLASS

		// PLS note that this anonymous class can only be with the name of
		// existing class

		/*
		 * existingCLASS referncevar = new existingCLASS(){
		 * 
		 * 
		 * //new method if declared defined here.. will not work for this
		 * reference //ONLY and ONLY overriding for existing method of the
		 * existing class is possible
		 * 
		 * };
		 */

		/*
		 * 
		 * P.S. we do not need to extend the class which we are enhancing .. we
		 * are just providing the additional functionality by creating a new
		 * anonymous class by that on the fly
		 */

		Abstractcla anony = new Abstractcla()

		{ // here its an anonymous class .. it could be with the name of an
			// existing class and it is done with the
			// overriding some methods of a class..e.g in this case we done it
			// with abstract class

			@Override
			public void abstrmethod() {

				System.out
						.println("Abstract method body given.. or overriding in general could be done");
			}

			// The below method is use less even if we uncomment it as this is
			// this anon class own method
			// so can not be called by its refernce

			/*
			 * public void newmethodAnonymousclass(){
			 * 
			 * System.out.println("newly added method of Anonymous class");
			 * 
			 * }
			 */

		};

		anony.abstrmethod();

		// anony.newmethodAnonymousclass();

		// while we can still call existing methods of the original reference.
		anony.fun1();
		Abstractcla.fun111();

	}

	// similarly the anonymous classes can be returned by the methods in return
	// type as well
	// Event listeners are bases on anonymous classes

}