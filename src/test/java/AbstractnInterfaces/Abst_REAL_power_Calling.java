package AbstractnInterfaces;

public class Abst_REAL_power_Calling {

	
public static void main(String ...xxx)

{

	
	/*here this is calling class where the dynamic binding is used to achieve abstraction 
	The dynamic binding holds the concept that at the time of compilation the compiler checks the existence of called method in the parent class.. if all these called methods are found in 
	parent class or interfaces then its fine..else compilation error..
	
	Now at run time.. all these functions are checked in diff children classed where these methods are overridden or implemented.. and if child class does not have this method.. then
	also the parent class method will be reached to child class as it is.. so not an issue.*/
	
	
	//UPCASTING
	Abst_REAL_power iit_CTC= new Abst_REALpower_child1();
	Abst_REAL_power Pvt_CTC= new Abst_REALpower_child2();
	
	
	System.out.println(	iit_CTC.FresherSalary());
	
	System.out.println(	Pvt_CTC.FresherSalary());
	
	//DOWNCASTING
	
	
	Abst_REALpower_child1 childobject= (Abst_REALpower_child1)iit_CTC;
	
	System.out.println(	childobject.FresherSalary());
	
	

	
	
	
	
}
	
}
