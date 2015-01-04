package AbstractnInterfaces;

abstract public class Abstractcla {

	// Abstraction is simply showing functionality but hiding implementation.

	/*
	 * 
	 * In Java Abstraction is achieved by Abstract methods..(Abstraction means
	 * simply Abstract methods)
	 * 
	 * so Abstraction in java forces user to extends or implements the abstract
	 * methods using inheritance
	 * 
	 * so JAVA forced us to not use methods directly by not allowing Object
	 * creation of Abstract clases and Interfaces.
	 * 
	 * An abstract class can have normal method along with abstract
	 * methods..even abstract class could have just normal function
	 * 
	 * its just abstract class can never be instantiated..it can be used by
	 * extending only.
	 * 
	 * 
	 * static methods can not be abstract.
	 * 
	 * Abstract methods could be in Abstract classes or Interfaces only.
	 * 
	 * 
	 * A Child class has to give body or OVERRIDE ALL the abstract methods of
	 * the super class or it has to become abstract
	 * 
	 * 
	 * STATIC METHODS can not be abstract .. so they are not in the scope of
	 * ABSTRACT CLASS and INHERITANCE
	 * 
	 * In abstract class we can have static methods but with body In
	 * INTERFACES.. methods can never have body .. so we can never have static
	 * methods.
	 * 
	 * In Interfaces by default all methods are implicitly abstract and public
	 */

	public void fun1() {

		System.out.println("Normanl instance function of abstract class");
	}

	static void fun111() {

		System.out.println("static function of abstract class");

	}

	abstract public void abstrmethod(); // abstract needs to be written in front
										// of method without body

	// abstract public static void abstrstaticmethod(); static method can not be
	// abstract..
	// as static method can be called by class name so we can not have abstract
	// static method
}
