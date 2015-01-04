package AbstractnInterfaces;

class ImplemClass_AbstClass_calling {

	public static void main(String... xxx) {

		Abstractcla abs1 = new ImplemClass_AbstClass();
		Abstractcla abs2 = new ImplemClass_AbstClass1();

		abs1.abstrmethod(); // Dynamic binding and binding the method at run
							// time
		abs1.fun1();

		abs2.abstrmethod();// Dynamic binding and binding the method at run time
		abs2.fun1();

	}

}