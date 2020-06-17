package AbstractnInterfaces;

public class Abst_Body_class1 extends AbstClass1 {

	
	void fun1(){
		
		System.out.println(" **** Body provided to Abstract method of AbstClass1");
		
	}
	
	//GOLDEN rule:-- ALL classes have constructor in java.
	
//Static methods can never be abstract..as absracts methods needs to be extended and static do not move to child one.

	//GOLDEN rule.. constructor is always there .. in every class. also in abstract class.

	//even though we can not create object of abstract class but we do have constructor in abstract class..so whats use

	/*
	constructor does not really create object but initialized data members while object gets created.

	 */

	// as we create extending subclasss.. the subclass constructor needs to call constructor of parent class..so abstract needs that.

	public static void main (String ...cc)
	{

		new Abst_Body_class1().fun1();
		new Abst_Body_class1().fun3();

	}
	
}
