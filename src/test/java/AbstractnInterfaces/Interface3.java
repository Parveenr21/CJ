package AbstractnInterfaces;

interface Interface3 {

	int inter_instance = 30;
	static int inter_static = 300;

	// static void meth3(); //Static methods are not allowed in the interfaces.
	// as they can not have any thing on their own

	void meth3(); // by defaults methods are public and abstract... so no need
					// to put abstract on the methods

	void methGENERAL();

	// static void temp(); //static methods are not allowed in interfaces
}