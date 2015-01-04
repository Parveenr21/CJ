package Inheritance;

public class Upcasting {

	/*
	 * 
	 * 
	 * This is a concept which is foundation of abstraction
	 * 
	 * here a lower or child class reference can be put in PARENT class reference variable
	 * 
	 * 
	 * base b1= new child();
	 * 
	 * and we can call overridden methods of child class using b1.
	 * 
	 * b1.foo() // this will call foo() method which is overridden.. but the mandatory thing is these methods should exist in both
	 * the classes ..
	 * 
	 * 
	 * Accessing methods using b1 or this upcasted reference needs methods present in both classes else
	 * 
	 * If method exist in Parent only .. and not in child in any case . because generally in Inheritance..it will by default come to child
	 * 
	 * AT compilation .. the method is checked in Parent..If not found compilation error.
	 * 
	 * while run time .. method is check in Child class. and if not found then run time error.
	 * 
	 * 
	 * 
	 * NOTE
	 * BUT this way b1.var //this will only call parent variable and not the overidden child DM .bcoz DM never get inhetited
	 * 
	 * 
	 * 
	 * 
	 * 
	 * DOWNCASTING
	 * 
	 * base b1= new child();
	 * Child c= (Child)b1;		//sinmple typecasting this reference variable to Child class
	 * 
	 * 
	 */
	
}
