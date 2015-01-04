package AbstractnInterfaces;

interface Interface_extending_Interface extends Interface1, Interface2,		Interface3 {

	int inter_instance = 90;
	static int inter_static = 900;

	// static void meth3(); //Static methods are not allowed in the interfaces.
	// as they can not have any thing on their own

	void addedMethod();

}