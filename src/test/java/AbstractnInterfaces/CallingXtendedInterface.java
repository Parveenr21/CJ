package AbstractnInterfaces;

public class CallingXtendedInterface {
	
	
	
	public static void main(String ...ccc)
	{
		
		
		new class_ImplementingALL().meth1();
		new class_ImplementingALL().meth2();
		new class_ImplementingALL().meth3();
		new class_ImplementingALL().methGENERAL();
		new class_ImplementingALL().addedMethod();
		//new CallingXtendedInterface().nonstat();
		
		System.out.println(Interface1.inter_static);
		System.out.println(Interface2.inter_static);
		System.out.println(Interface3.inter_static);
		System.out.println(Interface1.inter_instance);  //this is also static as by default DM are static in interfacce
		System.out.println(Interface2.inter_instance);
		System.out.println(Interface3.inter_instance);
	
	}
	
	
	
	

}
