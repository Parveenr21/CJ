package AbstractnInterfaces;



/*
 * 
 * Interface by default variables are static with final
 * while functions are non static and abstract
 */



interface Interface1 {

	int inter_instance = 10;		//By default its static
	static int inter_static = 100;

	// static void meth3(); //Static methods are not allowed in the interfaces.
	// as they can not have any thing on their own

	void meth1();

	void methGENERAL();

	/*
	 * 
	 * INTERFACE versus Abstract classes
	 * 
	 * 
	 * Interface is generally for dynamic binding where interface reference will
	 * call class objects
	 * 
	 * while abstract class concept is usualy for reusability ..
	 * 
	 * If we create an Interface .. then it can be implmented by other classes
	 * by implementing it while other classes still extends other class. while
	 * if we create abstract class then other class can just extends our class
	 * an no other classs.
	 * 
	 * 
	 * Interface is tightly coupled with more abstraction.. as compare to
	 * abstract classes.
	 * 
	 * 
	 * an abstract class can only extends a class and implements many
	 * interfaces..while Interface can extends many interfaces...
	 */

}