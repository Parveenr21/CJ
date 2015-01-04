package AbstractnInterfaces;

class calling_class_ImplementingALL {

	int inter_instance = 1;
	int inter_static = 2;

	public static void main(String... xxxx) {

		Interface1 I1 = new class_ImplementingALL();
		Interface2 I2 = new class_ImplementingALL();
		Interface3 I3 = new class_ImplementingALL();
		Interface_extending_Interface I_all = new class_ImplementingALL();

		System.out.println("I1.inter_instance" + Interface1.inter_instance);
		System.out.println("I1.inter_static" + Interface1.inter_static);
		I1.meth1();
		I1.methGENERAL();

		System.out.println("I2.inter_instance" + Interface2.inter_instance);
		System.out.println("I2.inter_static" + Interface2.inter_static);
		I2.meth2();
		I2.methGENERAL();

		System.out.println("I3.inter_instance" + Interface3.inter_instance);
		System.out.println("I3.inter_static" + Interface3.inter_static);
		I3.meth3();
		I3.methGENERAL();

		System.out.println("I_all.inter_instance"
				+ Interface_extending_Interface.inter_instance);
		System.out.println("I_all.inter_static"
				+ Interface_extending_Interface.inter_static);
		I_all.meth1();
		I_all.meth2();
		I_all.meth3();
		I_all.methGENERAL();
		I_all.addedMethod();

	}

}