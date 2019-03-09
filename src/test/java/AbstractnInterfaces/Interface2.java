package AbstractnInterfaces;

interface Interface2 {

	int inter_instance = 20;			//this is by default static ..beacuse it can not have object so no memory
	static int inter_static = 200;

	// although we created both instance and class varibales in interfaces ,,.but actully both are static
	// but by default interface DM are static and final   ..so we have created this instance variable..but it is also static

	// final variables as we can never update the value of interface DM
	// values..as there is no methods in Interfacess..

	// Interfaces are by default static in nature..as they do not belong to objects.

	// static void meth3(); //Static methods are not allowed in the interfaces.
	// as they can not have any thing on their own

	// by defaults methods are public and abstract... so no need to put abstract
	// on the methods

	void meth2();

	void methGENERAL();

}